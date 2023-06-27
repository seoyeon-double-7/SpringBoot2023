package kr.hs.study.urlMapping21.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sub2")
public class homeController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/test2")
    public String test2(){
        return "result";
    }

    @GetMapping("/test3")
    public String test3(){
        return "result";
    }

    @GetMapping("/test4")
    public String test4(){
        return "result";
    }
}
