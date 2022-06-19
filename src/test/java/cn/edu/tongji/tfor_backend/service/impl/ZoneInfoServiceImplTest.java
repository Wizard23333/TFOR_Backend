package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.TforBackendApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = TforBackendApplication.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("帖子模块测试")
class ZoneInfoServiceImplTest {

    @Autowired
    ZoneInfoServiceImpl zoneInfoService;

    @ParameterizedTest
    @DisplayName("按天获取热榜帖子函数测试")
    @CsvFileSource(resources = "/zoneInfoServiceTestCSV/getRank.csv", numLinesToSkip = 1)
    void getRank(int caseId, int day, String expect) {
        if(expect != null){
            assertNotNull(zoneInfoService.getRank(day), "getRank() failed");
        } else {
            assertNull(zoneInfoService.getRank(day), "getRank() failed");
        }

    }

    @ParameterizedTest
    @DisplayName("帖子关键词查询函数测试")
    @CsvFileSource(resources = "/zoneInfoServiceTestCSV/search.csv", numLinesToSkip = 1)
    void search(int caseId, String keyWord, int expectLength) {
        assertEquals(zoneInfoService.search(keyWord).size(), expectLength, "search() failed");
    }
}