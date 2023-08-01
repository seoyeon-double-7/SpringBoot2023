package kr.hs.study.JDBC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class homeController {

    @GetMapping("/")
    public String home(HttpServletRequest req){
        return "index";
    }
}
