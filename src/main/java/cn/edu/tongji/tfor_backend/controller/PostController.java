package cn.edu.tongji.tfor_backend.controller;

import cn.edu.tongji.tfor_backend.model.AdvertisementEntity;
import cn.edu.tongji.tfor_backend.model.PostEntity;
import cn.edu.tongji.tfor_backend.service.PostService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/post")
@Api(tags = "apis for post different types of contents") // distribution for this series of api
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping(value="postContent")
    public ResponseEntity<Object> postContent(@RequestBody PostEntity newPost) {
        return new ResponseEntity<>(postService.postContent(newPost), HttpStatus.OK);
    }

    @PostMapping(value = "postAdvertisement")
    public ResponseEntity<Object> postAdvertisement(@RequestBody AdvertisementEntity newAdver) {
        return new ResponseEntity<>(postService.postAdvertisement(newAdver), HttpStatus.OK);
    }


}
