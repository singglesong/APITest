package asserts;

import data.DataProviders;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by liugumin on 2019/8/28.
 */
public class TaobaoAsertTest {
    @Test(dataProvider = "dataByJson" ,dataProviderClass = DataProviders.class)
    public void testNotNull() throws Exception {
    }

}
