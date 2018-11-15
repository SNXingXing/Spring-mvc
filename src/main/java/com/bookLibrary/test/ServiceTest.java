package com.bookLibrary.test;

import com.bookLibrary.bean.*;
import com.bookLibrary.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author  star
 * 测试service层
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class ServiceTest {
    @Autowired
    BookNameService bookNameService;
    @Autowired
    CategoryService categoryService;

    @Autowired
    PubliserService publiserService;

    @Autowired
    AuthorService authorService;

    @Autowired
    IsbnService isbnService;

    @Test
    public void bookNameadd() {
        BookName bookName = new BookName(null, "酒神");
        boolean flag = bookNameService.addBookName(bookName);
        System.out.println("flag=" + flag);
    }

    @Test
    public void bookNameUpdate() {
        BookName bookName = new BookName(4, "冰火魔厨");
        boolean b = bookNameService.updateBookName(bookName);
        System.out.println("flag=" + b);
    }

    @Test
    public void bookNameDelete() {
        Integer i = 4;
        boolean b = bookNameService.deleteBookName(i);
        System.out.println("删除:" + b);
    }

    @Test
    public void bookNameSelect() {
        BookName bookName = bookNameService.queryByid(2);
        BookName bookName1 = bookNameService.queryByName("将夜");
        System.out.println("书1:" + bookName);
        System.out.println("书2:" + bookName1);
    }

    //--------------------------------------------------------------------------------------------
    @Test
    public void categoryAdd() {
        boolean flag = categoryService.addCategory(new Category(null, "宇宙社会学"));
        System.out.println("flag=" + flag);
    }

    @Test
    public void categoryUpdate() {
        boolean flag = categoryService.updateCategory(new Category(1518, "宇宙社会关系"));
        System.out.println("flag=" + flag);
    }

    @Test
    public void categorySelectById() {
        Category category = categoryService.queryByCid(1518);
        System.out.println(category);
    }


    @Test
    public void categorySelectByName() {
        Category category = categoryService.queryByCname("宇宙社会关系");
        System.out.println(category);
    }

    @Test
    public void categoryDelete() {
        boolean flag = categoryService.deleteCategory(1518);
        System.out.println("删除结果:" + flag);
    }


    //=======================================================================================
    @Test
    public void publisherAdd() {
        publiserService.addPublisher(new Publisher(null, "北京邮电大学出版社"));

    }

    @Test
    public void publisherSelectByName() {
        List<Publisher> list = publiserService.queryByName("四川出版社");
        System.out.println(list.get(0));
    }

    @Test
    public void publisherSelectById() {
        Publisher publisher = publiserService.queryById(3);
        System.out.println(publisher);
    }

    @Test
    public void publisherDelete() {
        boolean b = publiserService.deletePublisher(3);
        System.out.println("删除结果:" + b);
    }


    //====================================================================================
    @Test
    public void authorAdd() {
        boolean b = authorService.addAuthor(new Author(null, "番茄"));
        System.out.println("插入结果:" + b);
    }

    @Test
    public void authorUpdate() {
        boolean b = authorService.updateAuthor(new Author(5, "番茄爱吃西红柿"));
        System.out.println("修改结果+" + b);
    }

    @Test
    public void authorSelectByName() {
        Author author = authorService.queryByName("番茄");
        System.out.println(author);
    }

    @Test
    public void authorSelectById() {
        Author author = authorService.queryById(2);
        System.out.println(author);
    }

    @Test
    public void authorDelete() {
        boolean b = authorService.deleteAuthor(5);
        System.out.println("删除结果:" + b);

    }

    //========================================================================================


    @Test
    public void isbnSelectByIsbn() {
        Isbn isbn = isbnService.queryByIsbn("9787549204076");
        System.out.println(isbn);

    }

    @Test
    public void isbnSelectByPublisherName() {
        List<Isbn> isbns = isbnService.queryByPublisher("四川出版社");
        for (Isbn isbn: isbns){
            System.out.println(isbn);
        }
    }
    @Test
    public void isbnSelectByAll() {
        List<Isbn> isbns = isbnService.selectAll();
        for (Isbn isbn : isbns) {
            System.out.println(isbn);
        }

    }

}
