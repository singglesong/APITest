package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class TestRequest {

    @JsonProperty("url")
    private String url;

    @JsonProperty("method")
    private String method;

    @JsonProperty("body")
    private String body;

    @JsonProperty("headers")
    private Map<String,String> headers;// 请求头

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

}
