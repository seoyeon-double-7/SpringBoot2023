package kr.hs.study.redirect_foward.homeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {

    @GetMapping("/redirect")
    public String redirect(){
        return "redirect:result";
    }
//    redirect 요청했을 때 result.html로 주소를 변경해라.
    @GetMapping("/result")
    public String result(){
        return "result";
    }

    @GetMapping("/forward")
    public String forward(){
        return "forward:result";
    }
}
