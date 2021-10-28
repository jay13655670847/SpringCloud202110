package com.jay.cn.consumer80.controller;

import com.jay.cn.consumer80.service.ProviderFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lj
 * @version 1.0
 * @date 2021/10/20 15:06
 */
@RestController
public class TestController {

    @Autowired
    ProviderFeginService providerFeginService;

    
    @RequestMapping("/test")
    public String test(HttpServletRequest request, HttpServletResponse response){
        System.out.println("调用consumer开始》》》》》》》》》》》》》》》》》》");
        String result = providerFeginService.hello();

        return result;

    }
}
