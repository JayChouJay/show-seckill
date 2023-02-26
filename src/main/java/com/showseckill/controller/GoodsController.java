package com.showseckill.controller;

import com.showseckill.model.Goods;
import com.showseckill.service.GoodsService;
import com.showseckill.vo.GoodsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService service;

    @GetMapping
    public String getGoods(Model model) {
        List<GoodsVO> goodsVOList = service.getlist();
        model.addAttribute(goodsVOList);
        return "list";
    }

    @GetMapping("/goodsDetail/{goodsId}")
    public String getGoodsByid(Model model, @PathVariable String goodsId) {
        GoodsVO goodsVO=service.getGoodsByGoodsId(goodsId);
        model.addAttribute(goodsVO);
        return "goodsDetail";
    }
}
