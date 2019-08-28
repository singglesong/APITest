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
}

