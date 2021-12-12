package cn.edu.tongji.tfor_backend.controller;

import cn.edu.tongji.tfor_backend.model.UserFollowZoneEntity;
import cn.edu.tongji.tfor_backend.service.ActionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.edu.tongji.tfor_backend.service.ActionService;
@RestController
@RequestMapping("api/action")
@Api(tags="Action APIS")
public class ActionController {

    @Autowired
    ActionService actionService;

    @PostMapping(value="followZone")
    public ResponseEntity<Object> postContent(@RequestBody UserFollowZoneEntity userFollowZoneEntity) {
        return new ResponseEntity<>(actionService.followZone(userFollowZoneEntity), HttpStatus.OK);
    }




}
