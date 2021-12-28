package cn.edu.tongji.tfor_backend.controller;

import cn.edu.tongji.tfor_backend.configuration.HttpResponse;
import cn.edu.tongji.tfor_backend.model.UserEntity;
import cn.edu.tongji.tfor_backend.myannotation.Auth;
import cn.edu.tongji.tfor_backend.service.EmailService;
import cn.edu.tongji.tfor_backend.service.TelephoneService;
import cn.edu.tongji.tfor_backend.service.TokenService;
import cn.edu.tongji.tfor_backend.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("api/user")
@Api(tags = "apis about register and login")
public class UserController {
    @Autowired
    UserInfoService userInfoService; // which service the controller used

    @Autowired
    TokenService tokenService;

    @Autowired
    EmailService emailService;

    @Autowired
    TelephoneService telephoneService;

    //用户注册
    @Operation(summary = "api for user register") // distribution for single api
    @PostMapping("register") // mapping url
    public HttpResponse createUserByObject(@RequestBody UserEntity newUser) {
        try {
            userInfoService.createUserByObject(newUser);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success("register successfully");
    }

    //用户使用密码登录
    //登录成功返回token，目前还未写好
    @Operation(summary = "INPUT PARAM:[uid],[pwd]")
    @PostMapping("login/pwd")
    public HttpResponse loginByPwd(@RequestBody JSONObject jsonObject) {
        int uid = Integer.parseInt(jsonObject.getString("uid"));
        String pwd = jsonObject.getString("pwd");
        JSONObject resp = new JSONObject();
        try {
            if (userInfoService.loginByPwd(uid, pwd)) {
                resp.put("token", tokenService.createToken(String.valueOf(uid), 0));
                return HttpResponse.success(resp);
            } else {
                return HttpResponse.error("No content");
            }
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    //用户使用邮箱验证码登录
    @Operation(summary = "INPUT PARAM:[email],[verifyCode]")
    @PostMapping("login/email")
    public HttpResponse loginByEmail(@RequestBody JSONObject jsonObject) {
        String email = jsonObject.getString("email");
        String verifyCode = jsonObject.getString("verifyCode");
        JSONObject resp = new JSONObject();
        String emailVerifyCode = emailService.getEmailVerifyCode();
        try {
            if (Objects.equals(verifyCode, emailVerifyCode)) {
                //通过email获取用户的id和密码，并将uid返回供前端使用
                resp.put("token", tokenService.createToken(email, 1));
                return HttpResponse.success(resp);
            } else {
                return HttpResponse.error("No content");
            }
        }
        catch(Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    //用户使用短信验证码登录
    @Operation(summary = "INPUT PARAM:[tel],[verifyCode]")
    @PostMapping("login/tel")
    public HttpResponse loginByTel(@RequestBody JSONObject jsonObject) {
        String tel = jsonObject.getString("tel");
        String verifyCode = jsonObject.getString("verifyCode");
        String telVerifyCode = telephoneService.getTelVerifyCode();
        JSONObject resp = new JSONObject();
        try{
            if (Objects.equals(verifyCode, telVerifyCode)){
                resp.put("token",tokenService.createToken(tel, 2));
                return HttpResponse.success(resp);
            }else{
                return HttpResponse.error("No content");
            }
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    //用户修改其他个人信息
    //使用JSONObject作为形参更加灵活
    @Operation(summary = "INPUT PARAM:[uid],[userName],[userGender],[userImage].后面3个选项可选")
    @PutMapping("modify")
    public HttpResponse modifyUserInfo(@RequestBody JSONObject jsonObject){
        int uid = Integer.parseInt(jsonObject.getString("uid"));
        String userName = jsonObject.getString("userName");
        String userGender = jsonObject.getString("userGender");
        String userImage = jsonObject.getString("userImage");
        try {
            userInfoService.changeUserName(uid, userName);
            userInfoService.changeUserGender(uid, userGender);
            userInfoService.changeUserImage(uid, userImage);
            return HttpResponse.success();
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    //用户修改手机号信息
    @Operation(summary = "INPUT PARAM:[uid],[telNum],[verifyCode]")
    @PutMapping("changePhoneNbr")
    public HttpResponse changePhoneNbr(@RequestBody JSONObject jsonObject){
        int uid = Integer.parseInt(jsonObject.getString("uid"));
        String newTelNbr = jsonObject.getString("telNum");
        String verifyCode = jsonObject.getString("verifyCode");
        try {
            String telVerifyCode = telephoneService.getTelVerifyCode();
            if (Objects.equals(verifyCode, telVerifyCode)){
                userInfoService.changePhoneNbr(uid, newTelNbr);
            }
            return HttpResponse.success();
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    //用户修改邮箱号信息
    @Operation(summary = "INPUT PARAM:[uid],[email],[verifyCode]")
    @PutMapping("changeEmail")
    public HttpResponse changeEmail(@RequestBody JSONObject jsonObject){
        int uid = Integer.parseInt(jsonObject.getString("uid"));
        String newEmail = jsonObject.getString("email");
        String verifyCode = jsonObject.getString("verifyCode");
        try {
            String emailVerifyCode = emailService.getEmailVerifyCode();
            if (Objects.equals(verifyCode, emailVerifyCode)) {
                userInfoService.changeEmail(uid, newEmail);
            }
            return HttpResponse.success();
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    //发送邮箱验证码请求
    @Auth
    @GetMapping("getverifycode/email/{emailaddr}")
    public HttpResponse getEmailVerifyCode(@PathVariable String emailaddr){
        try{
            emailService.sendEmailVerifyCode(emailaddr);
            return HttpResponse.success();
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    //发送短信验证码请求
    @GetMapping("getverifycode/tel/{telnum}")
    public HttpResponse getTelVerifyCode(@PathVariable String telnum){
        try{
            telephoneService.sendTelVerifyCode(telnum);
            return HttpResponse.success();
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

}
