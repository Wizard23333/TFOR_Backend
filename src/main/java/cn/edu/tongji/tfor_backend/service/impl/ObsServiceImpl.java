package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.configuration.OBS;
import cn.edu.tongji.tfor_backend.service.ObsService;
import com.alibaba.fastjson.JSONObject;
import com.obs.services.BasicObsCredentialsProvider;
import com.obs.services.ObsClient;
import com.obs.services.model.PostSignatureRequest;
import com.obs.services.model.PostSignatureResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class ObsServiceImpl implements ObsService {

}
