package com.bookLibrary.test;

import com.bookLibrary.bean.BookName;
import com.bookLibrary.bean.Category;
import com.bookLibrary.service.BookNameService;
import com.bookLibrary.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath*:applicationContext.xml")
public class ServiceTest {
    @Autowired
    BookNameService bookNameService;
    @Autowired
    CategoryService categoryService;
    @Test
    public void bookNameadd(){
        BookName bookName=new BookName(null,"酒神");
        boolean flag = bookNameService.addBookName(bookName);
        System.out.println("flag="+flag);
    }

    @Test
    public void bookNameUpdate(){
        BookName bookName=new BookName(4,"冰火魔厨");
        boolean b = bookNameService.updateBookName(bookName);
        System.out.println("flag="+b);
    }

    @Test
    public void bookNameDelete(){
        Integer i=4;
        boolean b = bookNameService.deleteBookName(i);
        System.out.println("删除:"+b);
    }

    @Test
    public void bookNameSelect(){
        BookName bookName = bookNameService.queryByid(2);
        BookName bookName1 = bookNameService.queryByName("将夜");
        System.out.println("书1:"+bookName);
        System.out.println("书2:"+bookName1);
    }
    //--------------------------------------------------------------------------------------------
    @Test
    public void categoryAdd(){
        boolean flag = categoryService.addCategory(new Category(null, "宇宙社会学"));
        System.out.println("flag="+flag);
    }

    @Test
    public void categoryUpdate(){
        boolean flag = categoryService.updateCategory(new Category(1518, "宇宙社会关系"));
        System.out.println("flag="+flag);
    }

    @Test
    public void categorySelectById(){
        Category category = categoryService.queryByCid(1518);
        System.out.println(category);
    }


    @Test
    public void categorySelectByName(){
        Category category = categoryService.queryByCname("宇宙社会关系");
        System.out.println(category);
    }
    @Test
    public void  categoryDelete(){
        boolean flag = categoryService.deleteCategory(1518);
        System.out.println("删除结果:"+flag);
    }


}
