package asserts;

import data.DataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by liugumin on 2019/8/28.
 */
public class StringAssert {

    /**
     * 判断是否全部包含指定的字符串
     * @param content  断言的字符串
     * @param fields    断言判断的集合
     * @throws Exception
     */
    public void ContainAll(String content ,String fields,boolean direction) throws Exception {
        // 且关系，初始为true
        boolean result=true;
        // 获取响应body
        String[] params = fields.split(",");
        for(String param:params){
            result = result&&content.contains(param);
        }
        // 根据断言方向进行断言
        if(direction) {
            Assert.assertTrue(result);
        }
        else {
            Assert.assertFalse(result);
        }
    }


    /**
     * 判断是否包含一个指定的字符串
     * @param content
     * @param fields
     * @param direction
     * @throws Exception
     */
    @Test(dataProvider = "dataByJson" ,dataProviderClass = DataProviders.class)
    public void testContainOne(String content ,String fields,boolean direction) throws Exception {
        // 或关系，初始为true
        boolean result=false;
        // 获取响应body
        String[] params = fields.split(",");
        for(String param:params){
            result = result&&content.contains(param);
        }
        // 根据断言方向进行断言
        if(direction) {
            Assert.assertTrue(result);
        }
        else {
            Assert.assertFalse(result);
        }
    }




}
