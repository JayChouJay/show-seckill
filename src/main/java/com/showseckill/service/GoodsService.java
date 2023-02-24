package com.showseckill.service;

import com.showseckill.model.Goods;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GoodsService {
    List<Goods> getlist();
}
