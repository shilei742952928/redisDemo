package com.shilei.redis.redisdemo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author shilei
 * @date 2019/12/26-18:18
 */
@RestController
@RequestMapping(method = {RequestMethod.POST,RequestMethod.GET})
public class HelloWorldRedis {

    @RequestMapping(value = "/helloworld",method = RequestMethod.GET)
    public String helloWorld(@RequestParam(name = "str") String str){
        return "helloWorld"+str;
    }

}
