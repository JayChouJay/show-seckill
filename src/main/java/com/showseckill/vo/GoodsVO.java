package com.showseckill.vo;

import lombok.Data;

import java.util.Calendar;
import java.util.Date;

@Data
public class GoodsVO {
    private Long id;
    private String goodsId;
    private String goodsName;
    private String goodsType;
    private Double price;
    private String imgPath;
    private Double seckillPrice;
    private int stockNum;
    private Date startTime;
    private Calendar endTime;
}
