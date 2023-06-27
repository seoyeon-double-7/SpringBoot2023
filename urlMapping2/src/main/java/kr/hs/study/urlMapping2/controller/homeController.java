package kr.hs.study.urlMapping2.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class homeController {
    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/test1")
    public String test1(){
        return "test1";
    }

    @GetMapping("/sub/test2")
    public String test2(){
        return "test2";
    }

    @GetMapping("/sub2/sub3/test3")
    public String test3(){
        return "test3";
    }

//    1. test1 접속 -- test1 실행
//    2. test2 접속 --- sub/test2 실행
//    3. test3 접속 -- sub2/sub3/test3
}
