package cf.map;

import java.util.*;

/**
 * LinkedHashMap是继承于HashMap，是基于HashMap和双向链表来实现的。
 * HashMap无序；LinkedHashMap有序，可分为插入顺序和访问顺序两种。
 * 如果是访问顺序(accessOrder=true)，那put和get操作已存在的Entry时，都会把Entry移动到双向链表的表尾(其实是先删除再插入)。
 * LinkedHashMap存取数据，还是跟HashMap一样使用的Entry[]的方式，双向链表只是为了保证顺序。
 * LinkedHashMap是线程不安全的
 * @author chengfan
 * @date 2019-11-13 17:01:14
 */
public class LinkedHashMapTest {

    public static void main(String[] args) {
        //HashMap无序；LinkedHashMap有序
        Map<String, String> hashMap = new HashMap<>(3);
        hashMap.put("name1", "josan1");
        hashMap.put("name2", "josan2");
        hashMap.put("name3", "josan3");
        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        getResult(iterator);
        Map<String, String> linkedHashMap = new LinkedHashMap<>(3,0.75f,true);
        linkedHashMap.put("name1", "josan1");
        linkedHashMap.put("name2", "josan2");
        linkedHashMap.put("name3", "josan3");
        linkedHashMap.put("name2","json20");
        linkedHashMap.put("name1","josan1");
        Iterator<Map.Entry<String, String>> iterator1 = linkedHashMap.entrySet().iterator();
        getResult(iterator1);

    }

    private static void getResult(Iterator<Map.Entry<String, String>> iterator){
        while(iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("key:" + key + ",value:" + value);
        }
    }

}
