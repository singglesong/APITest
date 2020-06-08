package pojo;

import lombok.Data;

import java.util.Map;

@Data
public class TestCase {

	private String id;
	
	private String name;
	
	private Map<String,String> preconditions;
	
	private Map<String,String> testData;
	
	private Map<String,String> expects;
	
	private Map<String,String> postconditions;

}
