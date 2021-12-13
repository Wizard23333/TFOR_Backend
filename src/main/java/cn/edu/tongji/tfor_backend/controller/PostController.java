package cn.edu.tongji.tfor_backend.controller;

import cn.edu.tongji.tfor_backend.model.AdvertisementEntity;
import cn.edu.tongji.tfor_backend.model.CommentEntity;
import cn.edu.tongji.tfor_backend.model.PostEntity;
import cn.edu.tongji.tfor_backend.repository.PostEntityRepository;
import cn.edu.tongji.tfor_backend.service.PostService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import cn.edu.tongji.tfor_backend.configuration.HttpResponse;

@RestController
@RequestMapping("api/post")
@Api(tags = "apis for post different types of contents") // distribution for this series of api
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping(value="postContent")
    public HttpResponse postContent(@RequestBody PostEntity newPost) {
        try {
            postService.postContent(newPost);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success("Post successfully");
    }

    @PostMapping(value = "postAdvertisement")
    public HttpResponse postAdvertisement(@RequestBody AdvertisementEntity newAdver) {
        try {
            postService.postAdvertisement(newAdver);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success("Post successfully");
    }

    @PostMapping(value = "postComment")
    public HttpResponse postComment(@RequestBody CommentEntity newComment) {
        try {
            postService.postComment(newComment);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success("Post successfully");
    }

    @DeleteMapping(value = "deleteContent")
    public HttpResponse deleteContent(Integer contentId) {
        try {
            postService.deleteContent(contentId);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success("Delete successfully");
    }

    @DeleteMapping(value = "deleteAdvertisement")
    public HttpResponse deleteAdvertisement(Integer contentId) {
        try {
            postService.deleteAdvertisement(contentId);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success("Delete successfully");
    }

    @DeleteMapping(value = "deleteComment")
    public HttpResponse deleteComment(Integer contentId) {
        try {
            postService.deleteComment(contentId);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success("Delete successfully");
    }
}
