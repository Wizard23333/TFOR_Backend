package cn.edu.tongji.tfor_backend.controller;

import cn.edu.tongji.tfor_backend.model.AdvertisementEntity;
import cn.edu.tongji.tfor_backend.model.CommentEntity;
import cn.edu.tongji.tfor_backend.model.PostEntity;
import cn.edu.tongji.tfor_backend.model.ZoneOwnPostEntity;
import cn.edu.tongji.tfor_backend.repository.PostEntityRepository;
import cn.edu.tongji.tfor_backend.service.PostService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
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

    @Operation(summary = "post a content")
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

    @Operation(summary = "make a new post belongs to a zone")
    @PostMapping(value="EnterZone")
    public HttpResponse enterZone(@RequestBody ZoneOwnPostEntity zoneOwnPostEntity) {
        try {
            postService.enterZone(zoneOwnPostEntity);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success();
    }

    @Operation(summary = "post an advertisement")
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

    @Operation(summary = "post a comment")
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

    @Operation(summary = "delete a content(including delete comments and the relation of belonging to a zone)")
    @DeleteMapping(value = "deleteContent")
    public HttpResponse deleteContent(String contentId) {
        try {
            postService.deleteContent(contentId);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success("Delete successfully");
    }

    @Operation(summary = "delete am advertisement")
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

    @Operation(summary = "delete a comment by comment ID")
    @DeleteMapping(value = "deleteComment")
    public HttpResponse deleteComment(String contentId) {
        try {
            postService.deleteComment(contentId);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success("Delete successfully");
    }
}
