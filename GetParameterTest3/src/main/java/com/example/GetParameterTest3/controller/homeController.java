package com.example.GetParameterTest3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class homeController {

    @GetMapping("/register")
    public String register(HttpServletRequest req){

        return "register";
    }

//    @PostMapping("/register")
//    public String postMethod(HttpServletRequest req){
//        System.out.println(req.getParameter("id"));
//        System.out.println(req.getParameter("pwd"));
//        System.out.println(req.getParameter("name"));
//        System.out.println(req.getParameter("email"));
//        System.out.println(req.getParameter("tel"));
//        System.out.println(req.getParameter("local"));
//
//        return "register";
//    }


//    @PostMapping("/register")
//    public String postMethod(WebRequest req){
//        System.out.println(req.getParameter("id"));
//        System.out.println(req.getParameter("pwd"));
//        System.out.println(req.getParameter("name"));
//        System.out.println(req.getParameter("email"));
//        System.out.println(req.getParameter("tel"));
//        System.out.println(req.getParameter("local"));
//
//        return "register";
//    }



//    @PostMapping("/register")
//    public String postMethod(@RequestParam("id") String id, @RequestParam("pwd") String pwd, @RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("tel") String tel, @RequestParam("local")String local){
//
//        System.out.println(id);
//        System.out.println(pwd);
//        System.out.println(name);
//        System.out.println(email);
//        System.out.println(tel);
//        System.out.println(local);
//        return "register";
//    }

    @PostMapping("/register")
    public String postMethod(@ModelAttribute registerDto form){
        System.out.println(form.getId().toString());
        System.out.println(form.getPwd().toString());
        System.out.println(form.getName().toString());
        System.out.println(form.getEmail().toString());
        System.out.println(form.getTel().toString());
        System.out.println(form.getLocal().toString());
        return "register";
    }


}
