package com.bookLibrary.controller;

import com.bookLibrary.bean.Isbn;
import com.bookLibrary.service.IsbnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author star
 * isbn控制器
 */
@Controller
public class IsbnController {
    @Autowired
    IsbnService isbnService;

    @RequestMapping(value="/getAllIsbn")
    public String getAllIsbn(Model model){
        List<Isbn> isbns = isbnService.selectAll();
        System.out.println("Controller:"+isbns);
        model.addAttribute("isbn",isbns);
        return "list";
    }
}
