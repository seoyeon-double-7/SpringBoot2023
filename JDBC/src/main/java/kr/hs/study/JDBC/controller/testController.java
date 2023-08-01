package kr.hs.study.JDBC.controller;

import kr.hs.study.JDBC.dto.MyuserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {

    @GetMapping("/write_form")
    public String write_form(){
        return "write_form";
    }

    @PostMapping("/write_form")
    public String write_form2(@ModelAttribute MyuserDTO form){
        String id = form.getId();
        String pw = form.getPw();
        System.out.println("id : " + id);
        System.out.println("pw : " + pw);
        return "write_form";

    }

}
