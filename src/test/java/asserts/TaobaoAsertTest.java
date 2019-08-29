package asserts;

import data.DataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.JsonData;

/**
 * Created by liugumin on 2019/8/28.
 */
public class TaobaoAsertTest {
    @Test(dataProvider = "dataByJson" ,dataProviderClass = DataProviders.class)
    public void testNotNull(JsonData jsonData) throws Exception {
        TaobaoAsert asert = new TaobaoAsert();
        Assert.assertTrue( asert.notNull(jsonData.getUrl(),jsonData.getHeaders()));
    }

}


