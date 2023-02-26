package com.showseckill.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeckillGoods {
    private Long id;
    private String goods_id;
    private Double seckill_price;
    private int stock_num;
    private Date start_time;
    private Calendar end_time;
}
