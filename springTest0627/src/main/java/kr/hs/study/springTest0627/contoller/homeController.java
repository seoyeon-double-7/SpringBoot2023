package kr.hs.study.springTest0627.contoller;

import kr.hs.study.springTest0627.LoginDto;
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
    public String home(){
        return "index";
    }
    @GetMapping("/test1")
    public String test(HttpServletRequest reqe){
        String a= reqe.getParameter("data1");

        return "test1";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest req){
        System.out.println(req.getParameter("id"));
        return "login";
    }

    @PostMapping("/login")
    public String login2(WebRequest req){
        System.out.println(req.getParameter("id"));
        return "login";
    }

    @PostMapping("/login")
    public String login3(@RequestParam("id") String id, @RequestParam("pw") String pw){
        System.out.println(id);
        return "login";
    }

    @PostMapping("/login")
    public String login4(@ModelAttribute LoginDto form){
        System.out.println(form.getId());
        return "login";
    }


}
