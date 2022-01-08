package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.repository.UserEntityRepository;
import cn.edu.tongji.tfor_backend.service.TokenService;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class TokenServiceImpl implements TokenService {
    @Resource
    UserEntityRepository userEntityRepository;

    @Override
    public String createToken(String arg, int type) {
        System.out.println(arg);
        int uid = 0;
        if (type==0){
            uid = Integer.parseInt(arg);
        }else if (type==1){
            uid = userEntityRepository.getUidByEmail(arg);
        }else if (type==2){
            uid = userEntityRepository.getUidByTel(arg);
        }
        String pwd = userEntityRepository.getPwdById(uid);

        Date start = new Date();
        //一小时有效时间
        long currentTime = System.currentTimeMillis() + 60* 60 * 1000;
        Date end = new Date(currentTime);
        return JWT.create().withAudience(String.valueOf(uid)).withIssuedAt(start).withExpiresAt(end)
                .sign(Algorithm.HMAC256(pwd));
    }
}
