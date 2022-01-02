package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.service.TelephoneService;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
//导入可选配置类
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
// 导入对应SMS模块的client
import com.tencentcloudapi.sms.v20190711.SmsClient;
// 导入要请求接口对应的request response类
import com.tencentcloudapi.sms.v20190711.models.SendSmsRequest;
import org.springframework.stereotype.Service;

@Service
public class TelephoneServiceImpl implements TelephoneService {
    //用于验证的系统校验码
    public String telVerifyCode = "";

    /*
    腾讯云账户密钥对
    不能直接将密钥对提交到仓库中
    有安全风险会被github警告
    所以这里提交了随便两个字符串
     */
    String secretId = "AKIDqVv72g3f5NSItMZeXUEqGSO4VhdR0NYT";
    String secretKey = "kESRAJDqCI7euud5GBpCxRfbGiupTpvk";

    /*
    使用腾讯云短信服务进行验证短信的发送
    以下代码参考腾讯云官方文档进行编写
    @URL:https://github.com/TencentCloud/tencentcloud-sdk-java
     */
    @Override
    public void sendTelVerifyCode(String telnum) {
        try {
            /* 必要步骤：
             * 实例化一个认证对象，入参需要传入腾讯云账户密钥对secretId，secretKey。
             * 可以直接在代码中写死密钥对，但是不要将代码复制、上传或者分享给他人，
             * 以免泄露密钥对危及财产安全。
             * */
            Credential cred = new Credential(secretId, secretKey);

            // 实例化一个http选项，可选，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            // 设置代理
            //httpProfile.setProxyHost("host");
            //httpProfile.setProxyPort(port);
            /* SDK默认使用POST方法。
             * 如果你一定要使用GET方法，可以在这里设置。GET方法无法处理一些较大的请求 */
            httpProfile.setReqMethod("POST");
            /* SDK有默认的超时时间，非必要请不要进行调整
             * 如有需要请在代码中查阅以获取最新的默认值 */
            httpProfile.setConnTimeout(60);
            /* SDK会自动指定域名。通常是不需要特地指定域名的，但是如果你访问的是金融区的服务
             * 则必须手动指定域名，例如sms的上海金融区域名： sms.ap-shanghai-fsi.tencentcloudapi.com */
            httpProfile.setEndpoint("sms.tencentcloudapi.com");

            /* 非必要步骤:
             * 实例化一个客户端配置对象，可以指定超时时间等配置 */
            ClientProfile clientProfile = new ClientProfile();
            /* SDK默认用TC3-HMAC-SHA256进行签名
             * 非必要请不要修改这个字段 */
            clientProfile.setSignMethod("HmacSHA256");
            clientProfile.setHttpProfile(httpProfile);
            /* 实例化要请求产品(以sms为例)的client对象
             * 第二个参数是地域信息，可以直接填写字符串ap-guangzhou，或者引用预设的常量 */
            SmsClient client = new SmsClient(cred, "ap-guangzhou",clientProfile);
            /* 实例化一个请求对象，根据调用的接口和实际情况，可以进一步设置请求参数
             * 你可以直接查询SDK源码确定接口有哪些属性可以设置
             * 属性可能是基本类型，也可能引用了另一个数据结构
             * 推荐使用IDE进行开发，可以方便的跳转查阅各个接口和数据结构的文档说明 */
            SendSmsRequest req = new SendSmsRequest();

            /* 填充请求参数,这里request对象的成员变量即对应接口的入参
             * 你可以通过官网接口文档或跳转到request对象的定义处查看请求参数的定义
             * 基本类型的设置:
             * 帮助链接：
             * 短信控制台: https://console.cloud.tencent.com/sms/smslist
             * sms helper: https://cloud.tencent.com/document/product/382/3773 */

            /* 短信应用ID: 短信SdkAppid在 [短信控制台] 添加应用后生成的实际SdkAppid，示例如1400006666 */
            String appid = "1400556751";
            req.setSmsSdkAppid(appid);

            /* 短信签名内容: 使用 UTF-8 编码，必须填写已审核通过的签名，签名信息可登录 [短信控制台] 查看 */
            //签名更改需要备案审核，目前还未通过，所以用的还是上学期数据库项目的签名
            String sign = "旅行之道";
            req.setSign(sign);

            /* 模板 ID: 必须填写已审核通过的模板 ID。模板ID可登录 [短信控制台] 查看 */
            String templateID = "1064468";
            req.setTemplateID(templateID);

            /* 下发手机号码，采用 e.164 标准，+[国家或地区码][手机号]
             * 示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号，最多不要超过200个手机号
             * 此处采用传入的参数作为接收号码*/
            String[] phoneNumbers = { telnum };
            req.setPhoneNumberSet(phoneNumbers);

            /* 模板参数: 若无模板参数，则设置为空*/
            String verifyCode = EmailServiceImpl.generateVerCode();
            this.telVerifyCode = verifyCode;
            String[] templateParams = { verifyCode };
            req.setTemplateParamSet(templateParams);

            /* 通过 client 对象调用 SendSms 方法发起请求。注意请求方法名与请求对象是对应的
             * 返回的 res 是一个 SendSmsResponse 类的实例，与请求对象对应 */
            client.SendSms(req);
        }catch (TencentCloudSDKException e){
            e.printStackTrace();
        }
    }

    public String getTelVerifyCode(){
        return this.telVerifyCode;
    }
}