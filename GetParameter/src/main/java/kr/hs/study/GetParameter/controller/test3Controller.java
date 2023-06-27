package kr.hs.study.GetParameter.controller;

import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

public class test3Controller {
    @GetMapping("/test3")
    public String test3(HttpServletRequest req){
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String[] c = req.getParameterValues("data3");
        return "result";
    }
}

