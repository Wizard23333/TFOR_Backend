package cn.edu.tongji.tfor_backend.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class ViewControllerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Autowired
    private TestRestTemplate testRestTemplate;

    @ParameterizedTest
    @DisplayName("按天获取热榜帖子函数测试")
    @CsvFileSource(resources = "/zoneInfoServiceTestCSV/getRank.csv", numLinesToSkip = 1)
    void getRankListByTime(int caseId, int day, String expect) {
        String result=testRestTemplate.getForObject("http://localhost:8087/" + "api/view/getRank/"+day,String.class);
        System.out.println(result);
    }


    @ParameterizedTest
    @DisplayName("帖子关键词查询函数测试")
    @CsvFileSource(resources = "/zoneInfoServiceTestCSV/search.csv", numLinesToSkip = 1)
    void getPostListByKeyword(int caseId, String keyWord, int expectLength) {
        String result=testRestTemplate.getForObject("http://localhost:8087/" + "api/view/search/"+keyWord,String.class);
        System.out.println(result);
    }

}