package com.sina.controller;

import com.sina.domain.Items;
import com.sina.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/find")
    public ModelAndView findById(ModelAndView mav){
        Items items = itemsService.findById(1);
        mav.addObject("item",items);
        mav.setViewName("itemDetail");
        return mav;
    }

}
