package com.showseckill.controller;

import com.showseckill.model.Goods;
import com.showseckill.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService service;
    @GetMapping
    public List<Goods> getGoods(){
        return service.getlist();
    }
}
