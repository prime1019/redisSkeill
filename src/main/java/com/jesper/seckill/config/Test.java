package com.jesper.seckill.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2021-01-04 23:11
 * @Version : V1.0
 * @Description :
 */
public class Test {
    public static void main(String[] args) {
        String [] s= new String[]{
                "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
        };
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        s=list.toArray(new String[0]);//没有指定类型的话会报错
    }
}
