package cn.edu.tongji.tfor_backend.configuration;

/**
 * API Response
 */
public class HttpResponse {

    private HttpResponse() { }
    /**
     * Request status
     */
    private String status;

    /**
     * Request code
     */
    private String code;

    /**
     * Introduction of response
     */
    private String message;

    /**
     * Return data
     */
    private Object data;

    /**
     * Error Request
     */
    public static HttpResponse error() {
        return init(BaseEnum.STATUS_ERROR.value, BaseEnum.DESCRIPTION_ERROR.value, BaseEnum.CODE_ERROR.value, null);
    }

    /**
     * Error Request, set message
     */
    public static HttpResponse error(String message) {
        return init(BaseEnum.STATUS_ERROR.value, message, BaseEnum.CODE_ERROR.value, null);
    }

    /**
     * Error Request, set message and code
     */
    public static HttpResponse error(String message, String code) {
        return init(BaseEnum.STATUS_ERROR.value, message, code, null);
    }

    /**
     * Error Request, set message and code and return data
     */
    public static HttpResponse error(String message, String code, Object data) {
        return init( BaseEnum.STATUS_ERROR.value, message, code, data);
    }

    /**
     * Request successfully
     */
    public static HttpResponse success() {
        return init(BaseEnum.STATUS_SUCCESS.value, BaseEnum.DESCRIPTION_SUCCESS.value, BaseEnum.CODE_SUCCESS.value, null);
    }

    /**
     * Request successfully
     */
    public static HttpResponse success(Object data) {
        return init(BaseEnum.STATUS_SUCCESS.value, BaseEnum.DESCRIPTION_SUCCESS.value, BaseEnum.CODE_SUCCESS.value, data);
    }

    /**
     * Request successfully
     */
    public static HttpResponse success(Object data, String message) {
        return init(BaseEnum.STATUS_SUCCESS.value, message, BaseEnum.CODE_SUCCESS.value, data);
    }

    public HttpResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public HttpResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public HttpResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public HttpResponse setData(Object data) {
        this.data = data;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    private static HttpResponse init(String status, String message, String code, Object data) {
        HttpResponse model = new HttpResponse();
        model.status = status;
        model.message = message;
        model.code = code;
        model.data = data;
        return model;
    }


    /**
     *
     */
    private HttpResponse(String status, String code) {
        this.status = status;
        this.code = code;
    }

    /**
     *
     */
    private HttpResponse(String status, String code, String message, Object data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;

    }

    @Override
    public String toString() {
        return "CloudResultModel{" +
                "status='" + status + '\'' +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * 基础枚举
     */
    enum BaseEnum {
        // status
        STATUS_SUCCESS("SUCCESS"),
        STATUS_ERROR("ERROR"),
        // introduction
        DESCRIPTION_SUCCESS("Request successfully"),
        DESCRIPTION_ERROR("Request failed"),
        // code
        CODE_SUCCESS("200"),
        CODE_ERROR("500");

        public final String value;
        BaseEnum(String value) {
            this.value = value;
        }
    }
}