package kr.hs.study.product.controller;

import kr.hs.study.product.dto.productDTO;
import kr.hs.study.product.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
        return "result";
    }
}
