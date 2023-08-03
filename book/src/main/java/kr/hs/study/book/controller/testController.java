package kr.hs.study.book.controller;

import kr.hs.study.book.dto.bookDTO;
import kr.hs.study.book.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class testController {
    @Autowired
    private bookService service;

    @GetMapping("/regist")
    public String regist() {
        return "regist";
    }

    @PostMapping("/regist")
    public String regist1(@ModelAttribute bookDTO dto) {
        service.add(dto);
        System.out.println("postmapping");
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model){
        List<bookDTO> list = service.listAll();
        System.out.println(list);
        model.addAttribute("list", list);
        return "list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id){
        service.delete(id);
        return "redirect:/list";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable String id, Model model){
        bookDTO dto = service.read(id);
        model.addAttribute("book", dto);
        System.out.println(dto);
        return "update";
    }

    @PostMapping("/update/{id}")
    public String update_done(bookDTO dto, @PathVariable String id){
        service.update(dto, id);
        return "redirect:/list";
    }
}
