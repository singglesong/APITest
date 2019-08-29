package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonData {

    @JsonProperty("url")
    private String url;     //  请求的地址
    @JsonProperty("des")
    private String des;     //  描述
    @JsonProperty("headers")
    private Map<String,String> headers;// 请求头
}
