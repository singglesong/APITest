package asserts;

import base.common.HttpMethod;

import java.util.Map;

/**
 * Created by liugumin on 2019/8/28.
 */
public class TaobaoAsert {



    public boolean notNull(String url, Map<String,String> headers){
        String response = new HttpMethod().getAsString(url,headers);
        return response!=null;
    }
}
