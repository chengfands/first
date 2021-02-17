package cf.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * json 对象转换
 * @author chengfan
 * @date 2019-11-20 10:29:52
 */
public class JsonTest {


    public static void main(String[] args) {

        String a ="{\"label\":\"单选111\",\"name\":\"sex\",\"isRequire\":\"0\",\"canView\":\"0\",\"showType\":\"0\",\"radioContent\":[{\"1\":\"单1\"},{\"2\":\"中1\"},{\"3\":\"女1\"},{\"4\":\"男1\"},{\"5\":\"南岸\"}]}";
        JSONObject jsonObject = JSONObject.parseObject(a);
        JSONArray array = (JSONArray)jsonObject.get("radioContent");
        System.out.println(array);
        for(int i=0;i<array.size();i++){
            //把里面的对象转化为JSONObject
            JSONObject job = array.getJSONObject(i);
            if(job.get("5")!=null){
                System.out.println("aaaaaaaaaaaa");
            }
        }
        System.out.println(jsonObject);


    }
}
