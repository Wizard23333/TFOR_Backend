package cn.edu.tongji.tfor_backend.controller;

import cn.edu.tongji.tfor_backend.configuration.HttpResponse;
import cn.edu.tongji.tfor_backend.model.PostEntity;
import cn.edu.tongji.tfor_backend.model.UserCollectionEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowUserEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowZoneEntity;
import cn.edu.tongji.tfor_backend.service.ActionService;
import io.swagger.annotations.Api;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import cn.edu.tongji.tfor_backend.service.ActionService;
@RestController
@RequestMapping("api/action")
@Api(tags="Action APIS")
public class ActionController {

    @Autowired
    ActionService actionService;

    @PostMapping(value="followZone")
    public HttpResponse followZone(@RequestBody UserFollowZoneEntity userFollowZoneEntity) {
        try {
            actionService.followZone(userFollowZoneEntity);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success("Follow successfully");
    }

    @PostMapping(value = "collectPost")
    public HttpResponse collectPost(@RequestBody UserCollectionEntity userCollectionEntity) {
        try {
            actionService.collectPost(userCollectionEntity);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success("Collect successfully");
    }

    @PostMapping(value = "followUser")
    public HttpResponse followUser(@RequestBody UserFollowUserEntity userFollowUserEntity) {
        try {
            actionService.followUser(userFollowUserEntity);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success("Follow successfully");
    }

    @DeleteMapping(value = "cancelFollowZone")
    public HttpResponse cancelFollowZone(Integer userId, Integer zoneId) {
        System.out.println(zoneId);
        actionService.cancelFollowZone(userId,zoneId);
        return HttpResponse.success("cancel follow successfully");
    }

    @DeleteMapping(value = "cancelFollowUser")
    public HttpResponse cancelFollowUser(Integer userId1, Integer userId2) {
        actionService.cancelFollowUser(userId1,userId2);
        return HttpResponse.success("cancel follow successfully");
    }

    @DeleteMapping(value = "cancelCollectPost")
    public HttpResponse cancelCollectPost(Integer userId, Integer postId) {
        actionService.cancelCollectPost(userId,postId);
        return HttpResponse.success("cancel follow successfully");
    }

    @PutMapping(value = "likePost")
    public HttpResponse likePost(Integer contentId) {
        actionService.likePost(contentId);
        return HttpResponse.success("like successfully");
    }

    @PutMapping(value = "reportPost")
    public HttpResponse reportPost(Integer contentId) {
        actionService.reportPost(contentId);
        return HttpResponse.success("report successfully");
    }








}
