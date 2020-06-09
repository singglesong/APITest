package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import groovyjarjarantlr.collections.impl.LList;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TestSuit {

	/**
	 * 测试用例集合的基础域名
	 */
	@JsonProperty("baseurl")
	private String baseurl;

	/**
	 * 测试用例集合
	 */
	@JsonProperty("caseList")
	private ArrayList<TestCase> caseList;

	

}
