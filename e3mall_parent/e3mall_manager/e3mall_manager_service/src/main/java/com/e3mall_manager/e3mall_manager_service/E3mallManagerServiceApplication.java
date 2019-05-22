package com.e3mall_manager.e3mall_manager_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.e3mall_manager.e3mall_manager_dao.auto")
public class E3mallManagerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(E3mallManagerServiceApplication.class, args);
    }

}
