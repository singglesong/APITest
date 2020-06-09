package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class TestCase {

	/**
	 * case id
	 */
	@JsonProperty("id")
	private String id;

	/**
	 * 测试用例名字
	 */
	@JsonProperty("name")
	private String name;


	/**
	 * 测试需要对数据库的操作
	 */
	@JsonProperty("dBsql")
	private TestDBsql dBsql;

	/**
	 * 测试接口请求信息
	 */
	@JsonProperty("request")
	private TestRequest request;

	@JsonIgnoreProperties
	private Map<String,String> preconditions;

	@JsonIgnoreProperties
	private Map<String,String> testData;

	@JsonIgnoreProperties
	private Map<String,String> expects;

	@JsonIgnoreProperties
	private Map<String,String> postconditions;

}
