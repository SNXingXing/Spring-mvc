package com.bookLibrary.test;

import com.bookLibrary.bean.Author;
import com.bookLibrary.bean.BookName;
import com.bookLibrary.bean.Isbn;
import com.bookLibrary.bean.Publisher;
import com.bookLibrary.dao.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    public void testBook() {
        //authorMapper.insertSelective(new Author(null,"猫腻"));
        //bookNameMapper.insertSelective(new BookName(null,"将夜"));
        //publisherMapper.insertSelective(new Publisher(null,"起点中文网"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        //这里会有一个异常，所以要用try catch捕获异常
        try {
            d = sdf.parse("2014-05-01");
        } catch (Exception e) {
            e.printStackTrace();
        }
        isbnMapper.insertSelective(new Isbn(null, "9787540584931", 3, 2, 3, 529, d, "第一版"));
    }
}