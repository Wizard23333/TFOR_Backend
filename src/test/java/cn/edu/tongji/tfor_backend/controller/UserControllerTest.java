package cn.edu.tongji.tfor_backend.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    int port=8087;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Autowired
    private TestRestTemplate testRestTemplate=new TestRestTemplate();


    void createUserByObject() {
    }

    @ParameterizedTest
    @DisplayName("用户登录函数测试")
    @CsvFileSource(resources = "/userInfoServiceTestCSV/loginByPwd.csv", numLinesToSkip = 1)
    void loginByPwd(int caseId, int userId, String password, boolean expect) {
        String requestJson = "{\"uid\":\""+userId+"\",\"pwd\":\""+password+"\"}";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<String>(requestJson,headers);
        String answer = testRestTemplate.postForObject("http://localhost:8087"+ "/api/user/login/pwd", entity, String.class);
        System.out.println(answer);
    }
}