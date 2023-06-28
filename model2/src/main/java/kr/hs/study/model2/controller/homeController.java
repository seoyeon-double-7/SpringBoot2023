package kr.hs.study.model2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class homeController {
    @GetMapping("/")
    public String test(HttpServletRequest req){

        return "index";
    }

@GetMapping("/test")
public String test(@RequestParam("id") String id, @RequestParam("pass") String pw, Model model){
        model.addAttribute(id);
        model.addAttribute(pw);
        return "re_test1";
}

//    @GetMapping("/test1")
//    public String test1(@RequestParam("id") String id, @RequestParam("pass") String pw, Model model){
//
//        System.out.println("id : " + id);
//        System.out.println("pw : " + pw);
//        model.addAttribute("uid", id);
//        model.addAttribute("upw", pw);
//
//
//        return "re_test1";
//    }

    @GetMapping("/test1")
    public String test1(@ModelAttribute loginDto form, Model model){
//        testDTO dto = new testDTO();
//        dto.setId(id)
//        dto.setPass(pass)
        String id = form.getId();
        String pw = form.getPw();
        model.addAttribute("uid", id);
        model.addAttribute("upw", pw);


        return "re_test1";
    }

    @GetMapping("/test2")
    public ModelAndView test2(@RequestParam int data1, @RequestParam int data2, ModelAndView mv){

        mv.addObject("d1", data1);
        mv.addObject("d2", data2);
        mv.setViewName("re_test2");
        return mv;
    }


    @GetMapping("/test3")
    public String test3(Model model){
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("Lee");
        list.add("Park");
        model.addAttribute("list", list);

        return "re_test3";
    }


    @GetMapping("/test4")
    public ModelAndView test3(ModelAndView mv){
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("Lee");
        list.add("Park");
        mv.addObject(list);

        mv.setViewName("re_test4");

        return mv;
    }
}