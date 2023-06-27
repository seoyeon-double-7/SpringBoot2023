package kr.hs.study.GetParameter.controller;

import kr.hs.study.GetParameter.dto.test6;
import kr.hs.study.GetParameter.dto.test7;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {
    @GetMapping("/test1")
    public String test1(HttpServletRequest req){
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String c = req.getParameter("data3");
        System.out.println("data1: "+a);
        System.out.println("data2: "+b);
        System.out.println("data3: "+c);
        return "result";
    }

    @GetMapping("/test2")
    public String test2(HttpServletRequest req){
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String[] c = req.getParameterValues("data3"); //배열
        System.out.println("data1: "+a);
        System.out.println("data2: "+b);
        for (String s:c) {
            System.out.println("data3: "+s);
        }
        return "result";
    }

    @GetMapping("/test3")
    public String test3(WebRequest req){
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String[] c = req.getParameterValues("data3");
        System.out.println("data1: "+a);
        System.out.println("data2: "+b);
        for (String s:c) {
            System.out.println("data3: "+s);
        }
        return "result";
    }

    @GetMapping("/test4/{a}/{b}/{c}")
    public String test4(@PathVariable String a, @PathVariable String b, @PathVariable String c){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        return "result";
    }

    @GetMapping("/test5")
    public String test5(@RequestParam("data1") String data1,
                        @RequestParam("data2") String data2,
                        @RequestParam("data3") String[] data3
    ){

        System.out.println("data1: "+data1);
        System.out.println("data2: "+data2);
        for (String s:data3)
            System.out.println("data3: "+s);

        return "result";
    }

    @GetMapping("/test6")
    public String test6(@ModelAttribute test6 t){
//        @ModelAttribute test6 t
//        부트가 test6 객체 t를 만들고
//        사용자의 데이터를 set메서드를 이용해서 멤버변수에 넣는다.
//        test6 객체의 t에 들어간다.
        System.out.println(t.getData1());
        System.out.println(t.getData2());
        System.out.println(t.getData3());
        return "result";
    }

//    @GetMapping("/test7")
//    public String test7(@ModelAttribute test7 t){
//        return "login";
//    }

    @PostMapping("/test7")
    public String test7(@ModelAttribute test7 t){
        System.out.println(t.getId());
        System.out.println(t.getPw());
        System.out.println(t.getName());
        System.out.println(t.getContent());
        System.out.println();
        return "login";
    }


}