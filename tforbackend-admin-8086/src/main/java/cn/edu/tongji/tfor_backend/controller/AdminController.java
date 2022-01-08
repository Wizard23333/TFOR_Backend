package cn.edu.tongji.tfor_backend.controller;
import cn.edu.tongji.tfor_backend.configuration.HttpResponse;
import cn.edu.tongji.tfor_backend.service.AdminService;
import cn.edu.tongji.tfor_backend.service.PostService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/admin")
@Api(tags = "Controller for administrator")
public class AdminController {
    @Autowired
    PostService postService;

    @Autowired
    AdminService adminService;

    @Operation(summary = "get the list of reported posts")
    @GetMapping("getReportedPostList/{reportNum}")
    HttpResponse getReportedPostList(@PathVariable int reportNum) {
        try {
            return HttpResponse.success(adminService.getReportedPostList(reportNum));
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    @Operation(summary = "get the list of reported comments")
    @GetMapping("getReportedCommentList/{reportNum}")
    HttpResponse getReportedCommentList(@PathVariable int reportNum) {
        try {
            return HttpResponse.success(adminService.getReportedCommentList(reportNum));
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    @Operation(summary = "get the list of reviewed posts")
    @GetMapping("getReviewedPostList")
    HttpResponse getReviewedPostList() {
        try {
            return HttpResponse.success(adminService.getReviewedPostList());
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    @Operation(summary = "get the list of reviewed comments")
    @GetMapping("getReviewedCommentList")
    HttpResponse getReviewedCommentList() {
        try {
            return HttpResponse.success(adminService.getReviewedCommentList());
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }

    @Operation(summary = "set the label of post(1.Normal 2.NotNormal 3.FakeNews 4.EighteenPlus)")
    @PutMapping("setPostLabel")
    HttpResponse setPostState(String contentId, Integer label) {
        try {
            adminService.setPostState(contentId, label);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success();
    }

    @Operation(summary = "set the state of comment (1.Normal 2.NotNormal 3.FakeNews 4.EighteenPlus)")
    @PutMapping("setCommentLabel")
    HttpResponse setCommentState(String contentId, Integer label) {
        try {
            adminService.setCommentState(contentId, label);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success();
    }
}
