package com.test.redis;

import org.apache.poi.util.SystemOutLogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Primo on 2016/2/29.
 */
public class Main {
    private static List<String> l = new ArrayList<String>();
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new RedisClient().show();
//        testStringArray("asd","asd1","asd2");
    }

    public static void testStringArray(String... args){
//        for(String s : args){
//            System.out.println(s);
//        }
        long begin = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
//            new Thread(new InnerRunner()).start();
            l.add("asd");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
    }
    static class InnerRunner implements Runnable{
        @Override
        public void run() {
            l.add("asd");
        }
    }
}
