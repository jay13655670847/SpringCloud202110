package com.jay.cn.consumer80.service;

import com.jay.cn.consumer80.api.TestApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author lj
 * @version 1.0
 * @date 2021/10/20 14:56
 */
@Component
@FeignClient(value = "Provider")
public interface ProviderFeginService extends TestApi {


    @Override
    String hello();
}
