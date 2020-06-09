package common.utils;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonUtils {
    private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);

    private static ObjectMapper objectMapper = new ObjectMapper();

    static{
        /**重写objectMapper 将null转换为"" **/
        objectMapper.getSerializerProvider().setNullValueSerializer(
                new JsonSerializer<Object>() {
                    @Override
                    public void serialize(Object value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
                        jsonGenerator.writeString("");
                    }
                }
        );
    }



    /**   将本地文本中的内容读取到string字符串
     * @param filePahtName   文件路径 如 ：C://新建文本文档(4).txt
     * @return   文件中的字符串
     * @throws IOException
     */
    public static String readJsonData(String filePahtName) {
        StringBuffer strbuffer = new StringBuffer();
        File myFile = new File(filePahtName);
        if (!myFile.exists()) {
            logger.error("不能找到文件" + filePahtName + "，请检查文件地址");
            return null;
        }
        try {
            FileInputStream fis = new FileInputStream(myFile);
            InputStreamReader inputStreamReader = new InputStreamReader(fis, "UTF-8");//乱码的话可以换成 GBK    //将字节流转化为字符输入流
            BufferedReader in = new BufferedReader(inputStreamReader);  // 创建一个使用默认大小输入缓冲区的缓冲字符输入流。
            String str;
            while ((str = in.readLine() )!= null) {
                strbuffer.append(str);
            }
            in.close();
            inputStreamReader.close();
            fis.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        return strbuffer.toString();
    }

    /**
     * Json 字符串转为对象
     * @param JSONStr
     * @param claz
     * @param <T>
     * @return
     */
    public static  <T extends Object> T parseJsonData(String JSONStr,Class<T> claz){
        Object object = null;
        try {
            object = objectMapper.readValue(JSONStr, claz);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
        return object != null ? (T) object : null;

    }

    /**
     * 方法名称: JSON2List
     * 方法描述:  JSON 转换为List:
     * 返回类型: List<T>
     * @throws
     */
    public static <T> List<T> JSON2List(String jsonStr, Class<T> claz) {
        List<T> result = null;
        try{
            JavaType t = objectMapper.getTypeFactory().
                    constructParametricType(List.class, claz);
            result = objectMapper.readValue(jsonStr, t);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
         e.printStackTrace();
        }
        return result==null?new ArrayList<T>():result;
    }


}
