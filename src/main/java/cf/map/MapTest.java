package cf.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * map遍历的4种方式
 * @author chengfan
 * @date 2019-11-12 17:56:47
 */
public class MapTest {

    public static void main(String[] args) {
        //方法一：在for循环中使用entries实现Map的遍历：
        // 最常见也是大多数情况下用的最多的，一般在键值对都需要使用
        Map<String,String> map1 = new HashMap<>(2);
        map1.put("熊大", "棕色");
        map1.put("熊二", "黄色");
        for(Map.Entry<String, String> entry : map1.entrySet()){
            String mapKey = entry.getKey();
            String mapValue = entry.getValue();
            System.out.println(mapKey+":"+mapValue);
        }


        //方法二：在for循环中遍历key或者values，一般适用于只需要map中的key或者value时使用，在性能上比使用entrySet较好；
        Map <String,String> map2= new HashMap<>(2);
        map2.put("熊大", "棕色");
        map2.put("熊二", "黄色");
        //key
        for(String key : map2.keySet()){
            System.out.println(key);
        }
        //value
        for(String value : map2.values()){
            System.out.println(value);
        }

        //方法三：通过Iterator遍历
        Map <String,String> map3= new HashMap<>(2);
        Iterator<Map.Entry<String, String>> entries = map3.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String, String> entry = entries.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }

        //通过键找值遍历，这种方式的效率比较低，因为本身从键取值是耗时的操作；
        Map <String,String> map4= new HashMap<>(2);
        for(String key : map4.keySet()){
            String value = map4.get(key);
            System.out.println(key+":"+value);
        }

    }

}
