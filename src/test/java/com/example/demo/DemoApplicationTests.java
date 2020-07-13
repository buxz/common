package com.example.demo;

import org.jooq.DSLContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


@SpringBootTest
class DemoApplicationTests {

    @Autowired
    DSLContext dslContext;

    @Test
    void contextLoads() {
        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("b");
        for (String string : strings) {
            System.out.println(string);
        }
//        System.out.println(strings().next());
//        BigDecimal b1=new BigDecimal("2.487");
//        BigDecimal add = b1.add(new BigDecimal("2.387"));
//        System.out.println(b1.compareTo(add));//4.7740000000000000213

    }
}
