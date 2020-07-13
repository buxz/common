package com.example.demo.controller;

import com.example.demo.vo.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class ErrorController {

    @Autowired
    private AuthenticationManager authenticationManager;

    /**
     * 登录接口
     */
//    @PostMapping(value = "/login")
//    public HttpResult login(@RequestBody LoginBean loginBean, HttpServletRequest request) throws IOException {
//        String username = loginBean.getUsername();
//        String password = loginBean.getPassword();
//
//        // 系统登录认证
//        JwtAuthenticatioToken token = SecurityUtils.login(request, username, password, authenticationManager);
//
//        return HttpResult.ok(token);
//    }
//
    /**
     * 登录接口
     */
    @RequestMapping(value = "/errors")
    public void errors(HttpServletRequest request, HttpServletResponse response) throws IOException {
        AuthenticationException exception = (AuthenticationException) request.getSession().getAttribute("SPRING_SECURITY_LAST_EXCEPTION");
        exception.printStackTrace();
//        return HttpResult.error(exception.getLocalizedMessage());
    }

}
