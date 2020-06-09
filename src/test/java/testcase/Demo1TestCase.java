package testcase;

import data.DataProviders;
import data.TestCaseDataFactory;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pojo.TestCase;

/**
 * 简单接口测试Demo
 */
public class Demo1TestCase {

    private String baseurl;

//    private TestCase testCase;

    private TestCaseDataFactory testCaseDataFactory;


    @BeforeTest
    public void preConditions() {
        String path = "TestCaseData/testDataDemo1.xml";
        testCaseDataFactory = TestCaseDataFactory.getInstance(path);
        baseurl = testCaseDataFactory.loadTestSuit().getBaseurl();
//        testCase = testCaseDataFactory.loadDataByCaseId("rest-assured-Demo");
    }

    @Test(dataProvider = "dataFromXml",dataProviderClass= DataProviders.class)
    public void testResponseStatus(Object object)
    {
        TestCase  testCase = (TestCase)object;
//        // Restful Web 根地址
        RestAssured.baseURI = baseurl;

        // Get the RequestSpecification of the request that you want to sent
        // to the server. The server is specified by the BaseURI that we have
        // specified in the above step.
        RequestSpecification httpRequest = RestAssured.given();

        String targeturl = testCase.getPreconditions().get("url");

        Response response = httpRequest.request(Method.GET, targeturl);

        // Now let us print the body of the message to see what response
        // we have recieved from the server
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);
        Assert.assertEquals(response.getStatusCode(),Integer.parseInt(testCase.getExpects().get("statusCode")));
    }


}