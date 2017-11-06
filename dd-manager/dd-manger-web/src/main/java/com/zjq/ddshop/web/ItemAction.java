package com.zjq.ddshop.web;

import com.zjq.ddshop.pojo.po.TbItem;
import com.zjq.ddshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Scope("prototype")
public class ItemAction {
    @Autowired
    private ItemService itemService;
    @RequestMapping(value = "/item/{itemId}",method = RequestMethod.GET)
    @ResponseBody
    public TbItem getById(@PathVariable("itemId") Long itemId){
//        System.out.println(itemId);
        System.out.println("itemId = [" + itemId + "]");

        TbItem tbItem = itemService.getById(itemId);
        return tbItem;
    }


}
