package com.example.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {

    @Autowired
    DSLContext dslContext;

    @Test
    void contextLoads() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id","aaa");
        jsonObject.put("typeName","bbb");
        jsonObject.put("property","ccc");
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("id","aaa");
        jsonObject2.put("typeName","bbb");
        jsonObject2.put("property","ccc");
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject);
        jsonArray.add(jsonObject2);
        System.out.println(jsonArray.toJSONString());
    }
}
