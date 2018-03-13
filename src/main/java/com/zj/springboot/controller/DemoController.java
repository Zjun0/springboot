package com.zj.springboot.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author: zj
 * @date: ${date}
 */
@RestController//标记为：restful
public class DemoController {
    //
    @RequestMapping(value = "hello",method={RequestMethod.POST, RequestMethod.GET},
            consumes={"application/json"},headers="a=1")
    public String SayHello(){
        return "你好";
    }
    @RequestMapping(value = "/demo2/{id}",method={RequestMethod.POST, RequestMethod.GET})
    public String Demo(@PathVariable("id") Integer id){
        return "id:"+id;
    }

    @RequestMapping(value="/demo3",method= RequestMethod.GET)
    public String Demo3(@RequestParam("id") Integer id){
        return "id:"+id;
    }
}
