package com.jay.cn.payment8002.controller;

import com.jay.cn.payment8002.api.TestApi;
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
        System.out.println("h2llo 这是8002~~");
        return "8002";
    }
}
