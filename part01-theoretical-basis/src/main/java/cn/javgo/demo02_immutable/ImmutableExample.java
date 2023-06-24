package main.java.cn.javgo.demo02_immutable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 不可变对象示例
 */
public class ImmutableExample {
    public static void main(String[] args) {
        // 创建实例(可变对象)
        Map<String,Integer> map = new HashMap<>();
        // 通过Collections.unmodifiableMap()方法返回一个不可变对象
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);

        // 向可变对象中添加数据
        map.put("Hello", 1); // 正常添加

        // 通过不可变对象添加数据
        unmodifiableMap.put("World", 2); // 抛出异常：java.lang.UnsupportedOperationException
    }
}
