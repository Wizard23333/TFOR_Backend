package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.TforBackendApplication;
import cn.edu.tongji.tfor_backend.model.UserCollectionEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowUserEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowZoneEntity;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = TforBackendApplication.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("用户操作模块测试")
class ActionServiceImplTest {

    @Autowired
    ActionServiceImpl actionService;

    @BeforeEach
    void setUp() {
    }

    @BeforeAll
    void initAll() {
        // 用户取消关注函数测试前置条件
        UserFollowUserEntity userFollowUserEntity = new UserFollowUserEntity();
        userFollowUserEntity.setUserFollowingId(1950074);
        userFollowUserEntity.setUserFollowedId(1950076);
        actionService.followUser(userFollowUserEntity);


    }

    @AfterAll
    void tearDownAll() {
        // 用户收藏帖子函数测试后置条件
        actionService.cancelCollectPost(1950077, "1654821568621");

        // 用户关注分区函数测试后置条件
        actionService.cancelFollowZone(1951604, 4);
    }

    @AfterEach
    void tearDown() {
    }


    @ParameterizedTest
    @DisplayName("用户关注分区函数测试")
    @CsvFileSource(resources = "/actionServiceTestCSV/followZone.csv", numLinesToSkip = 1)
    void followZone(int caseId, int userId, int zoneId, boolean expect) {
        UserFollowZoneEntity userFollowZoneEntity = new UserFollowZoneEntity();
        userFollowZoneEntity.setUserId(userId);
        userFollowZoneEntity.setZoneId(zoneId);
        assertEquals(actionService.followZone(userFollowZoneEntity), expect, "followZone() failed");

    }

    @ParameterizedTest
    @DisplayName("用户收藏帖子函数测试")
    @CsvFileSource(resources = "/actionServiceTestCSV/collectPost.csv", numLinesToSkip = 1)
    void collectPost(int caseId, int userId, String contentId, boolean expect) {
        UserCollectionEntity userCollectionEntity = new UserCollectionEntity();
        userCollectionEntity.setUserId(userId);
        userCollectionEntity.setContentId(contentId);
        assertEquals(actionService.collectPost(userCollectionEntity), expect, "collectPost() failed");
    }

    @ParameterizedTest
    @DisplayName("用户取消关注函数测试")
    @CsvFileSource(resources = "/actionServiceTestCSV/cancelFollowUser.csv", numLinesToSkip = 1)
    void cancelFollowUser(int caseId, int userId1, int userId2, boolean expect) {
        assertEquals(actionService.cancelFollowUser(userId1, userId2), expect,
                "cancelFollowUser() failed");
    }
}