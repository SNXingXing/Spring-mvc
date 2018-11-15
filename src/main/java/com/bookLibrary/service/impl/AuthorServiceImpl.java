package com.bookLibrary.service.impl;

import com.bookLibrary.bean.Author;
import com.bookLibrary.bean.AuthorExample;
import com.bookLibrary.dao.AuthorMapper;
import com.bookLibrary.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    AuthorMapper authorMapper;

    public boolean addAuthor(Author author) {
        return authorMapper.insertSelective(author)>0;
    }

    public Author queryByName(String a_name) {
        AuthorExample authorExample = new AuthorExample();
        authorExample.setDistinct(true);
        authorExample.createCriteria().andANameEqualTo(a_name);
        List<Author> authors = authorMapper.selectByExample(authorExample);
        if(authors.size()==0){
            return null;
        }
        return authors.get(0);
    }

    public Author queryById(Integer a_id) {
        return authorMapper.selectByPrimaryKey(a_id);
    }

    public boolean deleteAuthor(Integer a_id) {
        return authorMapper.deleteByPrimaryKey(a_id)>0;
    }

    public boolean updateAuthor( Author author) {
        return authorMapper.updateByPrimaryKey(author)>0;
    }
}
