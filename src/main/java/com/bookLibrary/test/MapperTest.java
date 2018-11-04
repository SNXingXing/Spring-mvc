package com.bookLibrary.test;

import com.bookLibrary.bean.Author;
import com.bookLibrary.bean.Isbn;
import com.bookLibrary.dao.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author star
 * 测试dao层工作
 * 1.导入SpringTest模块
 * 2.@ContextConfiguration指定Spring 配置文件的配置
 * 3.直接autowired要使用的组件
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class MapperTest {
    @Autowired
    IsbnMapper isbnMapper;

    @Autowired
    AuthorMapper authorMapper;

    @Autowired
    BookNameMapper bookNameMapper;

    @Autowired
    PublisherMapper publisherMapper;

    @Autowired
    CategoryMapper categoryMapper;
    @Test
    public void testBook(){
        authorMapper.insertSelective(new Author(null,"猫腻"));
    }
}
