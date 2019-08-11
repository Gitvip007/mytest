package com.sina.service.impl;

import com.sina.dao.ItemsDao;
import com.sina.domain.Items;
import com.sina.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class findByIdImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
