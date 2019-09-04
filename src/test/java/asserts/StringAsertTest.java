package asserts;

import base.utils.NetWorkUtils;
import base.utils.ObjectUtils;
import data.DataProviders;
import kong.unirest.HttpResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pojo.JsonData;
import pojo.taobao.report.TaobaoReportV3;
import pojo.taobao.report.TotalAssetsV2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 断言类型
 * Created by liugumin on 2019/8/28.
 */
public class StringAsertTest {

    private Map<String,String> map;

    @BeforeClass
    private void init(){
        map = new HashMap<String, String>();
    }

    /**
     * 判断非空
     * @param jsonData
     * @throws Exception
     */
    @Test(dataProvider = "dataByJson" ,dataProviderClass = DataProviders.class)
    public void testNull(JsonData jsonData) throws Exception {

    }




    @Test(dataProvider = "dataByJson" ,dataProviderClass = DataProviders.class)
    public void testContainAll(JsonData jsonData) throws Exception {
        StringAssert stringAssert = new StringAssert();
        // 获取response
        HttpResponse<String> response  = NetWorkUtils.getResponseAsString(jsonData.getUrl(),jsonData.getHeaders());
        boolean result= stringAssert.containAll(response.getBody(),jsonData.getAssertParams().get("contain"));

        // 根据断言方向进行断言
        if(jsonData.isAssertDirect())
            Assert.assertTrue(result);
        else
            Assert.assertFalse(result);

    }


    /**
     * 字符串转换为对象，查看是否符合要求
     * @param jsonData
     * @throws Exception
     */
    @Test(dataProvider = "dataByJson" ,dataProviderClass = DataProviders.class)
    public void testContainOne(JsonData jsonData) throws Exception {
        StringAssert stringAssert = new StringAssert();
        // 获取response
        HttpResponse<String> response  = NetWorkUtils.getResponseAsString(jsonData.getUrl(),jsonData.getHeaders());
        boolean result= stringAssert.containOne(response.getBody(),jsonData.getAssertParams().get("contain"));

        // 根据断言方向进行断言
        if(jsonData.isAssertDirect())
            Assert.assertTrue(result);
        else
            Assert.assertFalse(result);
    }



}


