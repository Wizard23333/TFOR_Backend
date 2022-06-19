package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.TforBackendApplication;
import cn.edu.tongji.tfor_backend.model.UserEntity;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = TforBackendApplication.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("用户模块测试")
class UserInfoServiceImplTest {

    @Autowired
    UserInfoServiceImpl userInfoService;


    @AfterAll
    void tearDownAll() {
        // 用户注册函数测试后置条件
        userInfoService.deleteUserByTel("15887330987");

    }

    @ParameterizedTest
    @DisplayName("用户登录函数测试")
    @CsvFileSource(resources = "/userInfoServiceTestCSV/loginByPwd.csv", numLinesToSkip = 1)
    void loginByPwd(int caseId, int userId, String password, boolean expect) {
        assertEquals(userInfoService.loginByPwd(userId, password), expect, "loginByPwd() failed");
    }


    @ParameterizedTest
    @DisplayName("用户注册函数测试")
    @CsvFileSource(resources = "/userInfoServiceTestCSV/createUserByObject.csv", numLinesToSkip = 1)
    void createUserByObject(int caseId, String email, Byte gender, String tel, String userName, String pwd, boolean expect) {
        UserEntity userEntity = new UserEntity();

        userEntity.setUserEmail(email);
        userEntity.setUserGender(gender);
        userEntity.setUserTel(tel);
        userEntity.setUserName(userName);
        userEntity.setUserPwd(pwd);
        assertEquals(userInfoService.createUserByObject(userEntity), expect, "createUserByObject() failed");
    }
}