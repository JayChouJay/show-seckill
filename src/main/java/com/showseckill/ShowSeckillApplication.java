package com.showseckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.showseckill.mapper")
@SpringBootApplication
public class ShowSeckillApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShowSeckillApplication.class, args);
    }

}
