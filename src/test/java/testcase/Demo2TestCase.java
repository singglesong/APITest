package testcase;

import common.utils.JdbcUtils;
import common.utils.JsonUtils;
import io.restassured.RestAssured;
import io.restassured.http.Cookie;

import io.restassured.http.Method;
import io.restassured.response.Response;

import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pojo.TestCase;
import pojo.TestSuit;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Demo2TestCase {

    TestSuit suit;

    List<Cookie> cookies;
    ArrayList<TestCase> caseList;

    @BeforeTest
    public void preConditions() {
        String path ="E:/IdeaProjects/APITest/src/main/resources/TestCaseData/testDataDemo2.json";
        String jsondata = JsonUtils.readJsonData(path);
        suit = JsonUtils.parseJsonData(jsondata,TestSuit.class);
        caseList = suit.getCaseList();
    }

//    @Test(dataProvider = "dataFromJson",dataProviderClass = DataProviders.class)
    @Test
    public void testCase(){
        baseURI = "http://47.111.8.172:9278";
//        Response response =
                given()
                         .contentType("application/json; charset=UTF-8")
                         .body("{\"username\":\"liangshuihe\",\"password\":\"123456\"}")
                         .request(Method.POST,"/login/v2")
                         .then()
                .body("data.user_name",equalTo("liangshuihe"));
    }

    @Test
    public void testCase2(){
        try {
            String tem="";
            TestCase testCase = caseList.get(0);

            ResultSet resultSet = JdbcUtils.getResult(testCase.getDBsql().getSqlList().get(0), testCase.getDBsql().getJdbc());
            while (resultSet.next()){
                tem = resultSet.getString("name");
            }
            Assert.assertEquals("刘成成", tem);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeConn();
        }
    }

    @Test
    public void testCase3(){
        baseURI = "https://lmyxtest-web.limachufa.com";
//        Response response =
        given()
                .formParam("bookers","[{\"ticketType\": 1,\"bookerName\": \"王云\",\"idcardType\": 0,\"idcardNo\": \"420621199503270621\",\"bookerPhone\": \"18727083743\",\"seatType\": 0}]")
                .formParam("contactName","阿云")
                .formParam("contactTel","18727083743")
                .formParam("date","2020-06-01")
                .formParam("endTime","15:50")
                .formParam("from","汉口")
                .formParam("memberId","712708494783938560")
                .formParam("runTimeDays","1")
                .formParam("runTimeHour","14")
                .formParam("runTimeMinutes","850")
                .formParam("startTime","11:09")
                .formParam("tenantId","519142041838419968")
                .formParam("to","杭州东")
                .formParam("trainNumber","D2194")
                .request(Method.POST,"/web/trainlineOrder/bookTrainTickets")
                .then()
                .body("message",equalTo("出票失败"));
    }

}
