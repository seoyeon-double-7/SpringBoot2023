package kr.hs.study.book.service;

import kr.hs.study.book.dao.bookDAO;
import kr.hs.study.book.dto.bookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookServiceimpl implements bookService{
    @Autowired
    private bookDAO dao;
    @Override
    public void add(bookDTO dto) {
        dao.add(dto);
    }

    @Override
    public List<bookDTO> listAll() {
        return dao.listAll();
    }
}
