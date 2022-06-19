package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.TforBackendApplication;
import cn.edu.tongji.tfor_backend.exceptionclass.AdminException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = TforBackendApplication.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("管理员模块测试")
class AdminServiceImplTest {

    @Autowired
    AdminServiceImpl adminService;

    @ParameterizedTest
    @DisplayName("设置帖子标签函数测试")
    @CsvFileSource(resources = "/adminServiceTestCSV/setPostState.csv", numLinesToSkip = 1)
    void setPostState(int caseId, String contentId, int label, boolean expect) {
        if(expect){
            assertDoesNotThrow(()->adminService.setPostState(contentId, label), "setPostState() failed");
        } else {
            assertThrows(AdminException.class, ()->adminService.setPostState(contentId, label), "setPostState() failed");
        }
    }
}