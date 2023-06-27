package kr.hs.study.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class homeController {
    @GetMapping("/")
    public String test(HttpServletRequest req){
        return "index";
    }

    @GetMapping("/test1")
    public String test1(HttpServletRequest req, Model model){
        String d1 = req.getParameter("data1");
        String d2 =req.getParameter("data2");

//        사용자가 요청한 값을 model에 넣는다(담는다)
        model.addAttribute("data1", d1);
        model.addAttribute("data2", d2);
        return "test1";

    }

    @GetMapping("/test2/{a}/{b}")
    public String test2(@PathVariable String a, @PathVariable String b, Model model){

        model.addAttribute("data1", a);
        model.addAttribute("data2", b);
        return "test2";
    }

    @GetMapping("/test3/{test1}/{test2}/{test3}")
    public String test3(@ModelAttribute modelDto dto, Model model){
        model.addAttribute("data1", dto.getA());
        model.addAttribute("data1", dto.getB());

        return "test3";
    }





}
