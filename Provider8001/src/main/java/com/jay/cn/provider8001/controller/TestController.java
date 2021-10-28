package com.jay.cn.provider8001.controller;

import com.jay.cn.provider8001.api.TestApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lj
 * @version 1.0
 * @date 2021/10/20 14:22
 */
@RestController
public class TestController implements TestApi {
    @Override
    public String hello() {
        System.out.println("h2llo 这是8001~~");
        return "8001";
    }
}
