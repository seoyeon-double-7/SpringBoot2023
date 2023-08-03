package kr.hs.study.Mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {
    @GetMapping("/")
    public @ResponseBody String home(){
        return "Hello World";
    }
}
