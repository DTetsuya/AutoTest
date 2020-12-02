package com.course.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by HFJY on 2020-12-2.
 */
public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void ParamTest1(String name,int age){
        System.out.println("name="+name+"; age="+age);
    }
}
