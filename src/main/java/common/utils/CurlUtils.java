package common.utils;

import io.restassured.http.Cookie;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CurlUtils {
    private Map<String,String > headers;

    private List<Cookie> cookies;

}
