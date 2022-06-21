package cn.edu.tongji.tfor_backend.controller;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class AdminControllerTest {
    int port=8087;
    @Autowired
    private TestRestTemplate testRestTemplate=new TestRestTemplate();

    @BeforeAll
    static void initAll()
    {

    }
    @AfterAll
    static void tearDownAll() {

    }
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @DisplayName("设置帖子标签函数测试")
    @CsvFileSource(resources = "/adminServiceTestCSV/setPostState.csv", numLinesToSkip = 1)
    void setPostState(int caseId, String contentId, int label, boolean expect) {
      //String ans=testRestTemplate.postForObject()
    }

}