package com.example.GetParameter_Test2.controller;

import com.sun.tools.jconsole.JConsoleContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class homeController {

        @GetMapping("/")
        public String test(HttpServletRequest req){
            return "index";
        }

        @GetMapping("/login")
        public String login(HttpServletRequest req){
            return "login";
        }

//        @PostMapping("/login")
//        public String postMethod(HttpServletRequest req){
//            System.out.println(req.getParameter("id"));
//            System.out.println(req.getParameter("pw"));
//            return "login";

//    @PostMapping("/login")
//    public String postMethod(WebRequest req) {
//        System.out.println(req.getParameter("id"));
//        System.out.println(req.getParameter("pw"));
//        return "login";
//    }

//    @PostMapping("/login")
//    public String login(@RequestParam("id") String id, @RequestParam("pw") String pw) {
//        System.out.println("id : " + id);
//        System.out.println("pw : " + pw);
//        return "login";
//    }

    @PostMapping("/login")
    public String postMethod(@ModelAttribute loginDto form){
        System.out.println("modelattribute 사용한 비번 : " + form.getId().toString());
//        }
            System.out.println("modelattribute 사용한 비번 : " + form.getPw().toString());
            return "login";
        }

}
