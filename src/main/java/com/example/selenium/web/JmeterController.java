package com.example.selenium.web;

import com.example.selenium.web.Builder.Meal;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/jmeter/demo")
public class JmeterController{

    public static int count = 0;

    @RequestMapping(value = "/get/{name}",method = RequestMethod.GET)
    public  String testGet(@PathVariable String name){

        return "你输入的数据是 "+ name;
    }

    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public String testPost(@RequestParam String name){
        count++;
        return "您的接口被调用了 "+count+"次，you post name is "+name;
    }

    @RequestMapping(value = "/postJson",method = RequestMethod.POST)
    public @ResponseBody Meal testPostJson(@RequestBody Meal meal){
        return meal;
    }
}
