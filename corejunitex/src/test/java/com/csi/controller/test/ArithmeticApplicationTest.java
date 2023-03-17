package com.csi.controller.test;

import com.csi.controller.ArithmeticApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class ArithmeticApplicationTest {

    @Autowired
    ArithmeticApplication arithmeticApplication;

    @Test
    public void addTest(){
        Assert.assertEquals(9, arithmeticApplication.add(4, 5));
    }

    @Test
    public void subTest(){
        Assert.assertEquals(2, arithmeticApplication.sub(4, 2));
    }

    @Test
    public void mulTest(){
        Assert.assertEquals(24, arithmeticApplication.mul(4, 6));
    }

    @Test
    public void divTest(){
        Assert.assertEquals(2, arithmeticApplication.div(10, 5));
    }
}
