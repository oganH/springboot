package cn.com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xlm on  2019/5/21
 */
@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/")
    public String hello(){
        return "spring boot";
    }
}
