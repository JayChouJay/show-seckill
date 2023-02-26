package com.showseckill.service;

import com.showseckill.model.Goods;
import com.showseckill.vo.GoodsVO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GoodsService {
    List<GoodsVO> getlist();
    List<GoodsVO> getlist2();
    GoodsVO getGoodsByGoodsId(String goodsId);
}
