package com.jay.cn.consumer80.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lj
 * @version 1.0
 * @date 2021/10/20 14:14
 */
@RestController
public interface TestApi {

    @GetMapping("/api/test")
    public String hello();
}
