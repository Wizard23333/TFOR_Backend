package cn.edu.tongji.tfor_backend.controller;

import cn.edu.tongji.tfor_backend.repository.ZoneEntityRepository;
import cn.edu.tongji.tfor_backend.service.ZoneInfoService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/view") //api mapping str
@Api(tags = "apis for getting info about zone") // distribution for this series of api
public class ViewController {

    @Autowired
    ZoneInfoService zoneInfoService; // which service the controller used


    @Operation(summary = "test api for zone") // distribution for single api
    @RequestMapping("getAllZone") // mapping url
    public ResponseEntity<Object> getAllZoneNames() {
        return new ResponseEntity<>(zoneInfoService.getAllZones(), HttpStatus.OK);
    }
}
