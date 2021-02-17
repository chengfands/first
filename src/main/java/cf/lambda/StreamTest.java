package cf.lambda;

import com.google.common.base.Joiner;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author chengfan
 * @date 2019-12-02 17:15:20
 */
public class StreamTest {

    public static void main(String[] args) {

        List<Computer> list = new ArrayList<Computer>(){
            {
                add(new Computer(null,"Black","China",1000));
                add(new Computer(null,"Red","USA",2000));
                add(new Computer("Apple","white","Japan",3000));
                add(new Computer("Asus","Red","USA",4000));
            }
        };

        //取name做集合
        List<String> map1 = list.stream().map(Computer::getName).collect(Collectors.toList());
        System.out.println(map1.size());
        //name，color封装map
        Map<String, String> map2 = list.stream().collect(Collectors.toMap(Computer::getName, Computer::getColor));
        System.out.println(map2.size());
        //name,对象封装map
        Map<String, Computer> map3 = list.stream().collect(Collectors.toMap(Computer::getName, Function.identity()));
        System.out.println(map3.size());
        //所有价格上涨50%,定义一个函数
        Consumer<Computer> raise = p -> p.setPrice(p.getPrice() + p.getPrice() / 100 * 50);
        list.forEach(raise);
        list.forEach(a -> System.out.println(a.getPrice()));

        //过滤价格>2500的电脑，价格倒序取前两个
        Predicate<Computer> pass = p -> p.getPrice() > 2500;
        List<Computer> result = list.stream().filter(pass).sorted((a,b) -> b.getPrice().compareTo(a.getPrice())).limit(2).collect(Collectors.toList());
        result.forEach(a -> System.out.println(a.getPrice()));

        //所有电脑name用逗号分隔拼成字符串
        String names = list.stream().map(Computer::getName).collect(Collectors.joining(","));
        System.out.println(names);

        //按照颜色分组
        Map<String, List<Computer>> computerMap = list.stream().collect(Collectors.groupingBy(Computer::getColor));
        System.out.println(computerMap);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //获取所有结果count,min,max,sum,average
        IntSummaryStatistics stats = numbers.stream().mapToInt( x -> x+1).summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());

        //list转成符号分隔的字符串
        List<Integer> number22 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(Joiner.on("、").join(number22));
    }
}
