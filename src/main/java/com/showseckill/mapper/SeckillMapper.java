package com.showseckill.mapper;

import com.showseckill.model.SeckillGoods;

public interface SeckillMapper {
    SeckillGoods getGoodsbyGoodsId(String goodsId);
}
