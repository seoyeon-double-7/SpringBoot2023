package kr.hs.study.redirect_foward.homeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class controller {

    @GetMapping("/")
    public String home(HttpServletRequest req){
        return "index";
    }
}
