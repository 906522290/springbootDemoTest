package com.test.demo;

import org.springframework.util.StopWatch;

public class Main {
    public static void main(String[] args){
        StopWatch sw= new StopWatch();
        sw.start("任务1");
        sw.stop();

        System.out.println(sw.currentTaskName());
        System.out.println(sw.getLastTaskTimeMillis());
        System.out.printf("任务1耗时：%d%s.\n", sw.getLastTaskTimeMillis(), "ms");
    }
}
