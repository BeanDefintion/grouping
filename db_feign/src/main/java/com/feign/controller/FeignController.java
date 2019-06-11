package com.feign.controller;

import com.feign.client.LabelClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName FeignController
 * @Descrription TODO
 * @Author 15293
 * @DATE 2019/6/11 17:22
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "feign")
public class FeignController {
    @Resource
    private LabelClient labelClient;

    @RequestMapping(value = "test")
    public String test(String id) {
        return labelClient.gain(id);
    }

}
