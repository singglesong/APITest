package pojo;

import lombok.Data;

import java.util.Map;

@Data
public class JsonData {
    private String url;     //  请求的地址
    private String des;     //  描述
    private Map<String,String> headers;// 请求头
}
