package com.ums.web;

import com.ums.core.CoreConfig;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by jianggp on 2017/4/28.
 */
@SpringBootApplication
@ComponentScan
@Import(CoreConfig.class)
@EnableTransactionManagement
public class WebMain {

    public static void main(String[] args){

        SpringApplication.run(WebMain.class, args);
    }

    @Bean
    public Mapper dozerBeanMapper() {

        Mapper mapper = new DozerBeanMapper();

        return mapper;
    }
}
