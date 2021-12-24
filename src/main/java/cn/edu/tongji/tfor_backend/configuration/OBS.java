package cn.edu.tongji.tfor_backend.configuration;
import com.obs.services.ObsClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OBS {
    public static String endPoint = "https://obs.cn-east-3.myhuaweicloud.com";
    public static String requestURL = "https://tfor.obs.cn-east-3.myhuaweicloud.com";
    public static String ak = "JDOPVQVKTYEJUXZXODLK";
    public static String sk = "T0GuWarQxxBR9V1Bcr9MCVWpP1kobKgptrCyeg5X";
    public static String bucketName = "tfor";
    public static ObsClient obsClient = null;

    public static final String SIGN_SEP = "\n";
    public static final String OBS_PREFIX = "x-obs-";
    public static String DEFAULT_ENCODING = "UTF-8";
    public static List<String> SUB_RESOURCES = Collections.unmodifiableList(Arrays.asList(
            "CDNNotifyConfiguration", "acl", "append", "attname", "backtosource", "cors", "customdomain", "delete",
            "deletebucket", "directcoldaccess", "encryption", "inventory", "length", "lifecycle", "location", "logging",
            "metadata", "modify", "name", "notification", "orchestration", "partNumber", "policy", "position", "quota",
            "rename", "replication", "response-cache-control", "response-content-disposition",
            "response-content-encoding", "response-content-language", "response-content-type", "response-expires",
            "restore", " storageClass", "storagePolicy", "storageinfo", "tagging", "torrent", "truncate",
            "uploadId", "uploads", "versionId", "versioning", "versions", "website", "x-image-process",
            "x-image-save-bucket", "x-image-save-object", "x-obs-security-token"));
}
