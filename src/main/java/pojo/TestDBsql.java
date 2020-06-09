package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class TestDBsql {

    /**
     * 数据库连接信息
     */
    @JsonProperty("jdbc")
    private TestJDBC jdbc;

    /**
     * 数据库操作语句集合
     */
    @JsonProperty("sqlList")
    private List<String>  sqlList;



}
