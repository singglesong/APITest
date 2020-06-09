package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TestJDBC {

    /**
     * jdbc 连接的url
     */
    @JsonProperty("url")
    private String url;

    /**
     * jdbc 连接username
     */
    @JsonProperty("username")
    private String username;

    /**
     * jdbc 连接的password
     */
    @JsonProperty("password")
    private String password;
}
