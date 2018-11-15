package com.bookLibrary.service.impl;

import com.bookLibrary.bean.BookName;
import com.bookLibrary.dao.BookNameMapper;
import com.bookLibrary.service.BookNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author star
 */
@Service
public class BookNameServiceImpl implements BookNameService {


    @Autowired
    BookNameMapper bookNameMapper;

    public boolean addBookName(BookName bookName) {
        int i = bookNameMapper.insertSelective(bookName);
        return i > 0;
    }

    public boolean updateBookName(BookName bookName) {
        return bookNameMapper.updateByPrimaryKey(bookName) > 0;
    }

    public boolean deleteBookName(Integer n_id) {

        return bookNameMapper.deleteByPrimaryKey(n_id) > 0;
    }

    public BookName queryByName(String n_name) {
        return bookNameMapper.selectByName(n_name);
    }

    public BookName queryByid(Integer n_id) {
        return bookNameMapper.selectByPrimaryKey(n_id);
    }
}
