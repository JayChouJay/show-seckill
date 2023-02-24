package com.showseckill.service.impl;

import com.showseckill.mapper.GoodsMapper;
import com.showseckill.model.Goods;
import com.showseckill.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper mapper;
    @Override
    public List<Goods> getlist() {
        return mapper.selectAll();
    }
}
