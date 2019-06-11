package com.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName labelClient
 * @Descrription TODO
 * @Author 15293
 * @DATE 2019/6/11 16:53
 * @Version 1.0
 **/
@FeignClient(value = "BASE")
public interface LabelClient {

    @RequestMapping(value = "base/test", method = RequestMethod.GET)
    public String gain(@RequestParam("id") String id);
}
