package com.showseckill.mapper;

import com.showseckill.model.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

public interface GoodsMapper {
    List<Goods> selectAll();
    List<HashMap>selectWithSeckillGoods();
    Goods selectByGoodsId(String goodsId);
}
