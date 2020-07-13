package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.jooqGenerator.CaoTest;
import com.example.demo.jooqGenerator.Tables;
import com.example.demo.jooqGenerator.tables.pojos.TUser;
import com.example.demo.jooqGenerator.tables.records.TUserRecord;
import com.example.demo.vo.UserVO;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    DSLContext dslContext;

//    @PreAuthorize("hasAuthority('sys:user:add')")
    @RequestMapping("/add")
    public String test(){
        ArrayList<TUserRecord> tUserRecords = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TUserRecord tUser = new TUserRecord();
            tUser.setUsername("test"+i);
            tUser.setPassword(tUser.getUsername());
            tUserRecords.add(tUser);
        }
        dslContext.batchInsert(tUserRecords).execute();
        return "success";
    }

    @PreAuthorize("hasAuthority('sys:user:view')")
    @RequestMapping("/list")
    public String list(){
        List<TUser> tUsers = dslContext.select().from(Tables.T_USER).fetchInto(TUser.class);
        return JSON.toJSONString(tUsers);
    }

}
