package com.wucc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @RequestMapping(path = "/{method_mapping}/{method_id}" ,method = RequestMethod.GET)
    public Map<String,String> testMap(@PathVariable("method_mapping") String methodMapping,
                                      @PathVariable("method_id") String methodId){
        Map<String,String> map = new HashMap<>();
        map.put(methodMapping,methodId);
        return  map;
    }

    @GetMapping(path = "/requestHeader" )
    public Map<String,String> testMap02(@RequestHeader("haha") String header){
        Map<String,String> map = new HashMap<>();
        map.put("haha",header);
        return  map;
    }


    @DeleteMapping(path = "/user" )
    public Map<String,String> testMap03(String id ){
        Map<String,String> map = new HashMap<>();
        map.put("id",id);
        return  map;
    }
    @PutMapping(path = "/user" )
    public Map<String,String> testMap04(String id ){
        Map<String,String> map = new HashMap<>();
        map.put("id",id);
        return  map;
    }
}
