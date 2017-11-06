package com.zjq.ddshop.service.impl;

import com.zjq.ddshop.dao.TbItemMapper;
import com.zjq.ddshop.pojo.po.TbItem;
import com.zjq.ddshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
   private TbItemMapper itemDao;

    @Override
    public TbItem getById(Long itemId) {
        TbItem tbItem =itemDao.selectByPrimaryKey(itemId);
        return tbItem;
    }
}
