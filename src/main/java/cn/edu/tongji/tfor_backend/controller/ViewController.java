package cn.edu.tongji.tfor_backend.controller;

import cn.edu.tongji.tfor_backend.configuration.HttpResponse;
import cn.edu.tongji.tfor_backend.model.PostEntity;
import cn.edu.tongji.tfor_backend.model.ZoneEntity;
import cn.edu.tongji.tfor_backend.service.PostService;
import cn.edu.tongji.tfor_backend.service.ZoneInfoService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/view") //api mapping str
@Api(tags = "apis for getting info about zone") // distribution for this series of api
public class ViewController {

    @Autowired
    ZoneInfoService zoneInfoService; // which service the controller used

    @Autowired
    PostService postService;


    @Operation(summary = "get all zones information") // distribution for single api
    @GetMapping("getAllZone") // mapping url
    public HttpResponse getAllZoneNames() {
        try {
            return HttpResponse.success(zoneInfoService.getAllZones());
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    @Operation(summary = "get personal recomandlist by userid")
    @GetMapping("getRecommend/{userId}")
    public HttpResponse getRecommendListByUserId(@PathVariable("userId") Integer userId) {
        try {
            return HttpResponse.success(zoneInfoService.getRecommend(userId));
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    @Operation(summary = "get rank list by time")
    @GetMapping("getRank/{day}")
    public HttpResponse getRankListByTime(@PathVariable Integer day) {
        try {
            return HttpResponse.success(zoneInfoService.getRank(day));
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    @Operation(summary = "get post list by zoneId")
    @GetMapping("getPostList/{zoneId}")
    public ResponseEntity<Object> getPostListByZoneId(@PathVariable Integer zoneId) {
        return new ResponseEntity<>(zoneInfoService.getByZoneId(zoneId), HttpStatus.OK);
    }

    @Operation(summary = "get post lists by certain a key word ")
    @GetMapping("search/{keyword}")
    public HttpResponse getPostListByKeyword(@PathVariable String keyword) {
        try {
            return HttpResponse.success(zoneInfoService.search(keyword));
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    @Operation(summary = "get post detailed info by post id")
    @GetMapping("getPost/{postId}")
    public HttpResponse getPostByPostId(@PathVariable String postId) {
        try {
            PostEntity postEntity = postService.getByPostId(postId);
            if(postEntity == null) {
                return HttpResponse.error("Post ID does not exist!","404");
            }
            return HttpResponse.success(postEntity);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }




}
