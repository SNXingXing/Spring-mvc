package com.bookLibrary.service.impl;

import com.bookLibrary.bean.Category;
import com.bookLibrary.bean.CategoryExample;
import com.bookLibrary.dao.CategoryMapper;
import com.bookLibrary.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    public boolean addCategory(Category category) {
        return  categoryMapper.insertSelective(category)>0;
    }

    public boolean updateCategory( Category category) {
        return categoryMapper.updateByPrimaryKeySelective(category)>0;
    }

    public boolean deleteCategory(Integer c_id) {
        return categoryMapper.deleteByPrimaryKey(c_id)>0;
    }

    public Category queryByCname(String c_name) {
        return categoryMapper.selectByName(c_name);
    }

    public Category queryByCid(Integer c_id) {
        return categoryMapper.selectByPrimaryKey(c_id);
    }


}
