package com.lau1yach.service.impl;

import java.util.List;

import com.lau1yach.mapper.ItemMapper;
import com.lau1yach.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lau1yach.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemMapper itemMapper;

	@Override
	public List<Item> getItemList() {
		return itemMapper.selectByExample(null);
	}

	@Override
	public Item getItemById(Integer id) {
		return itemMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateItem(Item item) {
		itemMapper.updateByPrimaryKeySelective(item);
	}

}
