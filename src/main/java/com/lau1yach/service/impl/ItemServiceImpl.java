package com.lau1yach.service.impl;

import com.lau1yach.entity.Item;
import com.lau1yach.mapper.ItemMapper;
import com.lau1yach.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lyhpl
 * @Title: ItemServiceImpl
 * @ProjectName SSM
 * @Description: TODO
 * @date 9/25/2018  10:34 AM
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public List<Item> queryItemList() {
        List<Item> list =this.itemMapper.selectByExample(null);
        return list;
    }
}
