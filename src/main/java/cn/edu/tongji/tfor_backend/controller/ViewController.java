package cn.edu.tongji.tfor_backend.controller;

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

@RestController
@RequestMapping("api/view") //api mapping str
@Api(tags = "apis for getting info about zone") // distribution for this series of api
public class ViewController {

    @Autowired
    ZoneInfoService zoneInfoService; // which service the controller used


    @Operation(summary = "get all zones information") // distribution for single api
    @GetMapping("getAllZone") // mapping url
    public ResponseEntity<Object> getAllZoneNames() {
        return new ResponseEntity<>(zoneInfoService.getAllZones(), HttpStatus.OK);
    }

    @Operation(summary = "get personal recomandlist by userid")
    @GetMapping("getRecommend/{userId}")
    public ResponseEntity<Object> getRecommendListByUserId(@PathVariable("userId") Integer userId) {
        return new ResponseEntity<>(zoneInfoService.getRecommend(userId), HttpStatus.OK);
    }

    @Operation(summary = "get rank list by time")
    @GetMapping("getRank/{day}")
    public ResponseEntity<Object> getRankListByTime(@PathVariable Integer day) {
        return new ResponseEntity<>(zoneInfoService.getRank(day), HttpStatus.OK);
    }

    @Operation(summary = "get post lists by certain a key word ")
    @GetMapping("search/{keyword}")
    public ResponseEntity<Object> getPostListByKeyword(@PathVariable String keyword) {
        return new ResponseEntity<>(zoneInfoService.search(keyword), HttpStatus.OK);
    }

    @Operation(summary = "get post detailed info by post id")
    @GetMapping("getPost/{postId}")
    public ResponseEntity<Object> getPostByPostId(@PathVariable Integer postId) {
        if (zoneInfoService.getByPostId(postId) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(zoneInfoService.getByPostId(postId), HttpStatus.OK);
        }

    }


}
