package cn.edu.tongji.tfor_backend.configuration;

import cn.edu.tongji.tfor_backend.myannotation.Auth;
import cn.edu.tongji.tfor_backend.service.UserInfoService;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class AuthenticationInterceptor implements HandlerInterceptor {
    @Autowired
    UserInfoService userInfoService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) {
        //从http请求头中取出 token
        //字段为Authentication
        String token = httpServletRequest.getHeader("Authentication");
        //如果不是映射到方法直接通过
        if(!(object instanceof HandlerMethod)){
            return true;
        }
        HandlerMethod handlerMethod=(HandlerMethod)object;
        Method method=handlerMethod.getMethod();

        //检查有没有Auth的注解
        if (method.isAnnotationPresent(Auth.class)) {
            Auth userLoginToken = method.getAnnotation(Auth.class);
            if (userLoginToken.required()) {
                //执行认证
                if (token == null) {
                    throw new RuntimeException("no permission, please log in again.");
                }
                //获取token中的userid
                String uid;
                try {
                    uid = JWT.decode(token).getAudience().get(0);
                } catch (JWTDecodeException j) {
                    throw new RuntimeException("401");
                }
                if (!userInfoService.existById(Integer.parseInt(uid))) {
                    throw new RuntimeException("unknown user, please log in again.");
                }
                //验证token
                String pwd = userInfoService.getPwdById(Integer.parseInt(uid));
                JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(pwd)).build();
                try {
                    jwtVerifier.verify(token);
                } catch (JWTVerificationException e) {
                    throw new RuntimeException("401");
                }
                return true;
            }
        }
        return true;
    }
}
