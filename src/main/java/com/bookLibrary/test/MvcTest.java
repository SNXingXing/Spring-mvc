package com.bookLibrary.test;

import com.bookLibrary.bean.Isbn;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * @author star
 * 测试页面请求
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MvcTest {
    //传入springMVC的IOC
    @Autowired
    WebApplicationContext Context;

    MockMvc mockMvc;
    @Before
    public void initMovcMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(Context).build();
    }

    @Test
    public void testGetAllIsbn() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/getAllIsbn")).andReturn();
        MockHttpServletRequest request = result.getRequest();

        List<Isbn> isbns = (List<Isbn>) request.getAttribute("isbn");

        for (Isbn isbn: isbns) {
            System.out.println(isbn);
        }


    }

}
