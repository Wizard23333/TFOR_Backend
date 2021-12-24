package cn.edu.tongji.tfor_backend.controller;
import cn.edu.tongji.tfor_backend.configuration.HttpResponse;
import cn.edu.tongji.tfor_backend.configuration.OBS;
import cn.edu.tongji.tfor_backend.configuration.SignDemo;
import cn.edu.tongji.tfor_backend.service.ObsGetService;
import cn.edu.tongji.tfor_backend.service.ObsService;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;

@RestController
@RequestMapping("api/obs")
@Api("object storage service controller")
public class OBSController {
    @Autowired
    ObsService obsService;

    @Autowired
    ObsGetService obsGetService;

    @Operation(summary = "Get parameters for uploading")
    @GetMapping("getUploadAuth")
    HttpResponse getUploadAuth() throws IOException {
        JSONObject res;
        try {
            res = ObsService.getUploadAuth();
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
            //SignDemo signDemo = new SignDemo();
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
    HttpResponse getDownloadURL(String objectName) throws Exception {
        String url;
        try {
            SignDemo signDemo = new SignDemo();
            url = signDemo.getUploadURL(objectName);
        }
        catch (Exception e) {
            return HttpResponse.error(e.toString());
        }
        return HttpResponse.success(url);
    }
}
