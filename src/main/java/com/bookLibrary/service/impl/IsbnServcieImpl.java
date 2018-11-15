package com.bookLibrary.service.impl;

import com.bookLibrary.bean.Isbn;
import com.bookLibrary.bean.IsbnExample;
import com.bookLibrary.bean.Publisher;
import com.bookLibrary.dao.IsbnMapper;
import com.bookLibrary.service.IsbnService;
import com.bookLibrary.service.PubliserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IsbnServcieImpl implements IsbnService {
    @Autowired
    IsbnMapper isbnMapper;
    @Autowired
    PubliserService publiserService;

    public boolean addIsbn(Isbn isbn) {
        return isbnMapper.insertSelective(isbn)>0;
    }

    public boolean updateIsbn(Isbn isbn) {
        return isbnMapper.updateByPrimaryKey(isbn)>0;
    }

    public boolean deleteIsbn(Integer isbn_id) {
        return isbnMapper.deleteByPrimaryKey(isbn_id)>0;
    }

    public Isbn queryByIsbn(String isbn) {
        IsbnExample example =new IsbnExample();
        example.setDistinct(true);
        example.createCriteria().andIsbnLessThanOrEqualTo(isbn);
        List<Isbn> isbns = isbnMapper.selectByExample(example);
        Isbn isbn1 =null;
        try {
             isbn1 = isbns.get(0);
        } catch (Exception e) {
             return null;
        }
        return isbn1;
    }

    public List<Isbn> queryByPublisher(String p_name) {
        List<Publisher> publishers = publiserService.queryByName(p_name);
        Publisher publisher =null;
        try {
            publisher= publishers.get(0);
        } catch (Exception e) {
            return null;
        }
        IsbnExample example=new IsbnExample();
        example.setDistinct(true);
        example.createCriteria().andPIdEqualTo( publisher.getpId());
        List<Isbn> isbns = isbnMapper.selectByExampleWithElse(example);


        return isbns;
    }

    public List<Isbn> queryByCategory(String c_name) {
        return null;
    }

    public List<Isbn> queryByAuthor(String a_name) {
        return null;
    }

    public List<Isbn> queryByBookName(String n_name) {
        return null;
    }

    public List<Isbn> selectAll() {
        return isbnMapper.selectByExampleWithElse(null);
    }
}
