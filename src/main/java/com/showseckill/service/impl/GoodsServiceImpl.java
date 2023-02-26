package com.showseckill.service.impl;

import com.showseckill.mapper.GoodsDetailMapper;
import com.showseckill.mapper.GoodsMapper;
import com.showseckill.mapper.SeckillMapper;
import com.showseckill.model.Goods;
import com.showseckill.model.SeckillGoods;
import com.showseckill.service.GoodsService;
import com.showseckill.vo.GoodsVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private SeckillMapper seckillMapper;

    @Override
    public List<GoodsVO> getlist() {
        List<Goods> goodsList = goodsMapper.selectAll();
        List<GoodsVO> result = new ArrayList<>();
        for (int i = 0; i < goodsList.size(); i++) {
            GoodsVO goodsVO = new GoodsVO();
            SeckillGoods seckillGoods=seckillMapper.getGoodsbyGoodsId(goodsList.get(i).getGoods_id());
            goodsVO.setId(goodsList.get(i).getId());
            goodsVO.setGoodsId(goodsList.get(i).getGoods_id());
            goodsVO.setGoodsName(goodsList.get(i).getGoods_name());
            goodsVO.setGoodsType(goodsList.get(i).getGoods_type());
            goodsVO.setPrice(goodsList.get(i).getPrice());
            goodsVO.setImgPath(goodsList.get(i).getImg_path());
            goodsVO.setSeckillPrice(seckillGoods.getSeckill_price());
            goodsVO.setStockNum(seckillGoods.getStock_num());
            goodsVO.setStartTime(seckillGoods.getStart_time());
            goodsVO.setEndTime(seckillGoods.getEnd_time());
            result.add(goodsVO);
        }
        return result;
    }

    @Override
    public List<GoodsVO> getlist2() {
        List<HashMap> list=goodsMapper.selectWithSeckillGoods();
        List<GoodsVO> result=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            GoodsVO goodsVO=new GoodsVO();
            BeanUtils.copyProperties(goodsVO,list.get(i));
            result.add(goodsVO);
        }
        return result;
    }

    @Override
    public GoodsVO getGoodsByGoodsId(String goodsId) {
        Goods goods=goodsMapper.selectByGoodsId(goodsId);
        GoodsVO goodsVO = new GoodsVO();
        SeckillGoods seckillGoods=seckillMapper.getGoodsbyGoodsId(goods.getGoods_id());
        goodsVO.setId(goods.getId());
        goodsVO.setGoodsId(goods.getGoods_id());
        goodsVO.setGoodsName(goods.getGoods_name());
        goodsVO.setGoodsType(goods.getGoods_type());
        goodsVO.setPrice(goods.getPrice());
        goodsVO.setImgPath(goods.getImg_path());
        goodsVO.setSeckillPrice(seckillGoods.getSeckill_price());
        goodsVO.setStockNum(seckillGoods.getStock_num());
        goodsVO.setStartTime(seckillGoods.getStart_time());
        goodsVO.setEndTime(seckillGoods.getEnd_time());
        return goodsVO;
    }

}
