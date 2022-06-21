package cn.edu.tongji.tfor_backend.controller;

import com.alibaba.fastjson.JSONArray;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class ActionControllerTest {
    int port=8087;
    @Autowired
    private TestRestTemplate testRestTemplate=new TestRestTemplate();
    @BeforeEach
    void setUp() {
    }
     @BeforeAll
     static void initAll()
     {

     }
    @AfterAll
    static void tearDownAll() {
        TestRestTemplate testRestTemplate=new TestRestTemplate();
        //String answer = testRestTemplate.postForObject("http://localhost:" +port+ "/api/action/followZone", entity, String.class);
        testRestTemplate.delete("http://localhost:8087" + "/api/action/cancelFollowZone?userId=1951604&zoneId=4");
        //System.out.println(answer);
        testRestTemplate.delete("http://127.0.0.1:8087/api/action/cancelCollectPost?userId=1950077&postId=1654821568621");

        //testRestTemplate.os
    }




    @ParameterizedTest
    @DisplayName("用户关注分区函数测试")
    @CsvFileSource(resources = "/actionServiceTestCSV/followZone.csv", numLinesToSkip = 1)
    void followZone(int caseId, int userId, int zoneId, boolean expect) throws Exception {
        String requestJson = "{\"userId\":\""+userId+"\",\""+zoneId+"\":\"3\"}";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<String>(requestJson,headers);
        String answer = testRestTemplate.postForObject("http://localhost:" +port+ "/api/action/followZone", entity, String.class);
        System.out.println(answer);
    }

    @ParameterizedTest
    @DisplayName("用户收藏帖子函数测试")
    @CsvFileSource(resources = "/actionServiceTestCSV/collectPost.csv", numLinesToSkip = 1)
    void collectPost(int caseId, int userId, String contentId, boolean expect) {

        String requestJson = "{\"contentId\":\""+contentId+"\",\"userId\":\""+userId+"\"}";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<String>(requestJson,headers);
        String answer = testRestTemplate.postForObject("http://localhost:" +port+ "/api/action/collectPost", entity, String.class);
        System.out.println(answer);

    }



    @ParameterizedTest
    @DisplayName("用户取消关注函数测试")
    @CsvFileSource(resources = "/actionServiceTestCSV/cancelFollowUser.csv", numLinesToSkip = 1)
    void cancelFollowUser(int caseId, int userId1, int userId2, boolean expect) {
        String requestJson = "{\"userFollowedId\":\""+userId1+"\",\"userFollowingId\":\""+userId2+"\"}";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<String>(requestJson,headers);
        ResponseEntity<String> answer = testRestTemplate.exchange("http://localhost:" +port+ "/api/action/cancelFollowUser", HttpMethod.DELETE, entity,String.class);
        System.out.println(answer);
    }

}