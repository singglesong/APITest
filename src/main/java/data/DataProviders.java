package data;

import base.utils.IOUtils;
import org.testng.annotations.DataProvider;
import pojo.JsonData;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by liugumin on 2019/8/28.
 *
 * 提供测试数据
 */
public class DataProviders {

    /**
     * 读取文件内容作为测试数据
     * @return
     */
    @DataProvider(name = "dataByJson")
    public static Iterator<Object> createData(String file){
        List<Object> jsonDatas = new LinkedList<Object>();
        try {
            jsonDatas = IOUtils.readFileToList(file, null, JsonData.class);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return jsonDatas.iterator();
        }
    }

    public static void main(String[] args) {
        Iterator it = createData("testNg/1.txt");
    }
}
