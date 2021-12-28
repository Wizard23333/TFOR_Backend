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
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.mail.Header;
import java.util.List;
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
    public void createUserByObject(@RequestBody UserEntity newUser) {
        userInfoService.createUserByObject(newUser);
    }

    //用户使用密码登录
    //登录成功返回token，目前还未写好
    @Operation(summary = "INPUT PARAM:[uid],[pwd]")
    @PostMapping("login/pwd")
    public ResponseEntity<JSONObject> loginByPwd(@RequestBody JSONObject jsonObject) {
        int uid = Integer.parseInt(jsonObject.getString("uid"));
        String pwd = jsonObject.getString("pwd");
        JSONObject resp = new JSONObject();
        if(userInfoService.loginByPwd(uid, pwd)){
            resp.put("token",tokenService.createToken(String.valueOf(uid), 0));
            return new ResponseEntity<>(resp, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(resp, HttpStatus.NO_CONTENT);
        }
    }

    //用户使用邮箱验证码登录
    @Operation(summary = "INPUT PARAM:[email],[verifyCode]")
    @PostMapping("login/email")
    public ResponseEntity<JSONObject> loginByEmail(@RequestBody JSONObject jsonObject) {
        String email = jsonObject.getString("email");
        String verifyCode = jsonObject.getString("verifyCode");
        JSONObject resp = new JSONObject();
        String emailVerifyCode = emailService.getEmailVerifyCode();
        if (Objects.equals(verifyCode, emailVerifyCode)){
            //通过email获取用户的id和密码，并将uid返回供前端使用
            resp.put("token",tokenService.createToken(email, 1));
            return new ResponseEntity<>(resp, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(resp, HttpStatus.NO_CONTENT);
        }
    }

    //用户使用短信验证码登录
    @Operation(summary = "INPUT PARAM:[tel],[verifyCode]")
    @PostMapping("login/tel")
    public ResponseEntity<JSONObject> loginByTel(@RequestBody JSONObject jsonObject) {
        String tel = jsonObject.getString("tel");
        String verifyCode = jsonObject.getString("verifyCode");
        String telVerifyCode = telephoneService.getTelVerifyCode();
        JSONObject resp = new JSONObject();
        if (Objects.equals(verifyCode, telVerifyCode)){
            resp.put("token",tokenService.createToken(tel, 2));
            return new ResponseEntity<>(resp, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(resp, HttpStatus.NO_CONTENT);
        }
    }

    //用户修改其他个人信息
    //使用JSONObject作为形参更加灵活
    @Operation(summary = "INPUT PARAM:[uid],[userName],[userGender],[userImage].后面3个选项可选")
    @PutMapping("modify")
    public void modifyUserInfo(@RequestBody JSONObject jsonObject){
        int uid = Integer.parseInt(jsonObject.getString("uid"));
        String userName = jsonObject.getString("userName");
        String userGender = jsonObject.getString("userGender");
        String userImage = jsonObject.getString("userImage");
        userInfoService.changeUserName(uid, userName);
        userInfoService.changeUserGender(uid, userGender);
        userInfoService.changeUserImage(uid, userImage);
    }

    //用户修改手机号信息
    @Operation(summary = "INPUT PARAM:[uid],[telNum],[verifyCode]")
    @PutMapping("changePhoneNbr")
    public void changePhoneNbr(@RequestBody JSONObject jsonObject){
        int uid = Integer.parseInt(jsonObject.getString("uid"));
        String newTelNbr = jsonObject.getString("telNum");
        String verifyCode = jsonObject.getString("verifyCode");
        String telVerifyCode = telephoneService.getTelVerifyCode();
        if (Objects.equals(verifyCode, telVerifyCode)){
            userInfoService.changePhoneNbr(uid, newTelNbr);
        }
    }

    //用户修改邮箱号信息
    @Operation(summary = "INPUT PARAM:[uid],[email],[verifyCode]")
    @PutMapping("changeEmail")
    public void changeEmail(@RequestBody JSONObject jsonObject){
        int uid = Integer.parseInt(jsonObject.getString("uid"));
        String newEmail = jsonObject.getString("email");
        String verifyCode = jsonObject.getString("verifyCode");
        String emailVerifyCode = emailService.getEmailVerifyCode();
        if (Objects.equals(verifyCode, emailVerifyCode)) {
            userInfoService.changeEmail(uid, newEmail);
        }
    }

    //发送邮箱验证码请求
    @Auth
    @GetMapping("getverifycode/email/{emailaddr}")
    public void getEmailVerifyCode(@PathVariable String emailaddr){
        emailService.sendEmailVerifyCode(emailaddr);
    }

    //发送短信验证码请求
    @GetMapping("getverifycode/tel/{telnum}")
    public void getTelVerifyCode(@PathVariable String telnum){
        telephoneService.sendTelVerifyCode(telnum);
    }

    @GetMapping("getInfo/{userId}")
    @Operation(summary = "get user base Info by userId")
    public HttpResponse getUserInfoByUserId(@PathVariable Integer userId) {
        try {
            UserEntity userEntity = userInfoService.getUserInfoByUserId(userId);
            if (userEntity == null) {
                return HttpResponse.error("user Id does not exist!","404");
            }
            else {
                return HttpResponse.success(userEntity);
            }
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

//    @Auth
    @GetMapping("getInfoNeedAuth/{userId}")
    @Operation(summary = "get user Info with authorizeation")
    public HttpResponse getUserInfoNeedAuth(@PathVariable Integer userId) {
        try{
            UserEntity userEntity = userInfoService.getUserInfoByUserIdWithAuth(userId);
            if(userEntity == null) {
                return HttpResponse.error("user Id does not exist!","404");
            }
            else {
                return HttpResponse.success(userEntity);
            }
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    @GetMapping("getRelationInfo/{userId}")
    @Operation(summary = "get info like following num, like num...")
    public HttpResponse getUserRelationInfoByUserId(@PathVariable Integer userId) {
        try {
            Object relationInfo = userInfoService.getUserRelationInfoByUserId(userId);
            if(relationInfo == null) {
                return HttpResponse.error("user Id does not exist!","404");
            }
            else {
                return HttpResponse.success(relationInfo);
            }
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    @GetMapping("getFollowingList/{userId}")
    @Operation(summary = "get following list by user id")
    public HttpResponse getFollowingListByUserId(@PathVariable Integer userId) {
        try {
            Object list = userInfoService.getUserFollowingListByUserId(userId);
            if(list == null) {
                return HttpResponse.error("user Id does not exist!", "404");
            }
            else {
                return HttpResponse.success(list);
            }
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    @GetMapping("getCollectionList/{userId}")
    @Operation(summary = "get collection list by user id")
    public HttpResponse getCollectionListByUserId(@PathVariable Integer userId) {
        try {
            Object list = userInfoService.getUserCollectionPostByUserId(userId);
            if(list == null) {
                return HttpResponse.error("user Id does not exist!", "404");
            }
            else {
                return HttpResponse.success(list);
            }
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    @GetMapping("getFollowingZoneList/{userId}")
    @Operation(summary = "get following zone list by user id")
    public HttpResponse getFollowingZoneListByUserId(@PathVariable Integer userId){
        try {
            Object list = userInfoService.getFollowZoneListByUserId(userId);
            if(list == null) {
                return HttpResponse.error("user Id does not exist!", "404");
            }
            else {
                return HttpResponse.success(list);
            }
        }
        catch (Exception e) {
            return  HttpResponse.error(e.toString());
        }
    }

    @GetMapping("getPostList/{userId}")
    @Operation(summary = "get post list written by a user")
    public HttpResponse getPostListByUserId(@PathVariable Integer userId){
        try {
            Object list = userInfoService.getPostListByUserId(userId);
            if(list == null) {
                return HttpResponse.error("user Id does not exist!", "404");
            }
            else {
                return HttpResponse.success(list);
            }
        }
        catch (Exception e) {
            return  HttpResponse.error(e.toString());
        }
    }

}
