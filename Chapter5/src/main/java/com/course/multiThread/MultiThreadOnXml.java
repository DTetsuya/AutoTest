package com.course.multiThread;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2020/12/2.
 */
public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
