package kr.hs.study.product.controller;

import kr.hs.study.product.dto.productDTO;
import kr.hs.study.product.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class productController {
    @Autowired
    private productService service;

    @GetMapping("/add")
    public String write_form(){
        return "add_form";
    }

    @PostMapping("/add")
    public String add(productDTO dto) {
        service.add(dto);
        return "redirect:/list";
    }

    //리스트
    @GetMapping("/list")
    public String list(Model model){
        List<productDTO> list = service.listAll();
        System.out.println(list); //list 확인
        model.addAttribute("list", list);
        return "list";
    }

    //수정
    @GetMapping("/update/{id}")
    public String update(@PathVariable String id, Model model){
        productDTO dto = service.read(id);
        model.addAttribute("product", dto);
        return "update";
    }

    @PostMapping("/update/{id}")
    public String update_done(productDTO dto, @PathVariable String id){
        service.update(dto, id);
        return "redirect:/list";
    }

    //삭제
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id){
        service.delete(id);
        return "redirect:/list";
    }
}
