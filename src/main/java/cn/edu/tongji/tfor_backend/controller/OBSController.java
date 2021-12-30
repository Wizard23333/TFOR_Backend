package cn.edu.tongji.tfor_backend.controller;
import cn.edu.tongji.tfor_backend.configuration.HttpResponse;
import cn.edu.tongji.tfor_backend.service.ObsGetService;
import cn.edu.tongji.tfor_backend.service.ObsUploadService;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/obs")
@Api(tags = "object storage service controller")
public class OBSController {
    @Autowired
    ObsUploadService obsUploadService;

    @Autowired
    ObsGetService obsGetService;

    @Operation(summary = "Get parameters for uploading")
    @GetMapping("getUploadAuth")
    HttpResponse getUploadAuth() {
        JSONObject res;
        try {
            res = ObsUploadService.getUploadAuth();
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success(res);
    }

    @Operation(summary = "Get the profile URL of a user")
    @GetMapping("getProfileURL")
    HttpResponse getProfileURL(String uid) {
        String res;
        try {
            String objectName = "profile" + "/" + uid;
            res = obsGetService.getUploadURL(objectName);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success(res);
    }

    @Operation(summary = "Get the URL of an image")
    @GetMapping("getDownloadURL")
    HttpResponse getDownloadURL(String objectName){
        String url;
        try {
            url = obsGetService.getUploadURL(objectName);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success(url);
    }

    @Operation(summary = "get the urls of images of a post")
    @GetMapping(value="getPostImageUrls")
    public HttpResponse getPostImageUrls(String contentId) {
        try {
            return HttpResponse.success(obsGetService.getCommentImageList(contentId));
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
    }
}
