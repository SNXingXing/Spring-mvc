package com.bookLibrary.service.impl;

import com.bookLibrary.bean.Publisher;
import com.bookLibrary.bean.PublisherExample;
import com.bookLibrary.bean.Purchasebatch;
import com.bookLibrary.dao.PublisherMapper;
import com.bookLibrary.service.PubliserService;
import com.bookLibrary.service.PurchaseBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author  star
 */
@Service
public class PublisherServiceImpl implements PubliserService {
    @Autowired
    PublisherMapper publisherMapper;

    public boolean addPublisher(Publisher publisher) {
        return publisherMapper.insertSelective(publisher)>0;
    }

    public boolean deletePublisher(Integer p_id) {
        return publisherMapper.deleteByPrimaryKey(p_id)>0;
    }

    public boolean updatePublisher(Publisher publisher) {
        return publisherMapper.updateByPrimaryKey(publisher)>0;
    }

    public List<Publisher> queryByName(String p_name) {
        PublisherExample example=new PublisherExample();
        example.setDistinct(true);
        example.createCriteria().andPNameEqualTo(p_name);
        List<Publisher> publishers = publisherMapper.selectByExample(example);
        return publishers;
    }

    public Publisher queryById(Integer p_id) {
        return publisherMapper.selectByPrimaryKey(p_id);
    }


}
