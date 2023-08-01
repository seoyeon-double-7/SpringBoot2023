package kr.hs.study.book.controller;

import kr.hs.study.book.dto.bookDTO;
import kr.hs.study.book.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

        return "index";
    }
}
