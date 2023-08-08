package kr.hs.study.Mybatis.controller;

import kr.hs.study.Mybatis.dto.myUserDTO;
import kr.hs.study.Mybatis.service.myUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class testController {
    @Autowired
    private myUserService service;

    @GetMapping("/add")
    public String add_form(){
        return "write_form";
    }
    @PostMapping("/add")
    public String addForm(myUserDTO dto){
        service.insert(dto);
        return "redirect:/list";
}

    @GetMapping("/list")
    public String list(Model model){
        List<myUserDTO> list = service.listAll();
        model.addAttribute("list", list);
        System.out.println(list);
        return "list";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable String id, Model model){
        myUserDTO dto = service.read(id);
        model.addAttribute("myuser", dto);
        return "update";
    }
    @PostMapping("/update")
    public String update_done(myUserDTO dto){
        service.update(dto);
        return "redirect:/list";
    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable String id){
        service.delete(id);
        return "redirect:/list";
    }



}
