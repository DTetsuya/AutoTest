package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2020/12/5.
 */
public class TimeOutTest {

    @Test(timeOut = 3000)//单位为毫秒
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }

    @Test(timeOut = 3000)//单位为毫秒
    public void testFailed() throws InterruptedException{
        Thread.sleep(5000);
    }
}
