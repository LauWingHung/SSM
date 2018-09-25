package com.lau1yach.controller;

import com.lau1yach.entity.Item;
import com.lau1yach.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author lyhpl
 * @Title: ItemController
 * @ProjectName SSM
 * @Description: TODO
 * @date 9/24/2018  10:07 PM
 */
@Controller
public class ItemController {


    @Autowired
    private ItemService itemService;



    @RequestMapping("/itemList")
    public ModelAndView queryItemList(){
        List<Item> list =this.itemService.queryItemList();
        ModelAndView mav=new ModelAndView();
        mav.addObject("itemList",list);
        mav.setViewName("itemList");
        return mav;
    }

}
