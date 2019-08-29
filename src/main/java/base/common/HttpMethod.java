package base.common;

import kong.unirest.GetRequest;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

import java.util.Map;
import java.util.Set;

/**
 * Created by liugumin on 2019/8/28.
 */
public class HttpMethod {

    /**
     * get请求获取String类型的响应
     * @param url  请求地址
     * @param headers 请求头
     * @return
     */
    public  String getAsString(String url, Map<String,String> headers){
       GetRequest getRequest = Unirest.get(url);

       // 塞请求头
       Set<String > sets = headers.keySet();
       for(String head:sets){
           getRequest.header(head,headers.get(head));
       }

       // 返回字符串响应
        return  getRequest.asString().getBody();
    }

    public static void main(String[] args) {
        HttpResponse<String> response = Unirest.get("https://api.51datakey.com/gateway/jingdong/v6/data/f8f6889a-c48d-11e9-a2f2-00163e0e3263")
                .header("Authorization", "token  cb2f48f3c2a74488ad3abb52cfc4c8b6")
                .header("X-Moxie-IgnoreNull", "false")
                .header("cache-control", "no-cache")
                .header("Postman-Token", "9a6f2af6-ac4c-41e2-8447-069b8f5a88d5")
                .asString();
        System.out.println(response.getBody());
    }
}

