package com.atguigu.spring.boot.test;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

// @Runwith(SpringRunner.class)在SpringBoot的2.1.6版本需要写这个注解
@SpringBootTest
public class MyTest {

    @Test
    public void test() {
        System.out.println("hello spring boot test");
    }

}
