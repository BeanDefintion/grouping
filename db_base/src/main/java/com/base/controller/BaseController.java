package com.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BaseController
 * @Descrription TODO
 * @Author 15293
 * @DATE 2019/6/11 16:17
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "base")
public class BaseController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(String id) {
        return "日出东方 唯我不败!" + id;
    }
}
