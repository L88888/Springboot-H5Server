package com.sit.liu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.sit.liu.demo.dao") // mybatis扫描路径，针对的是接口Mapper类
@ComponentScan(basePackages = {"com.sit.*"})
public class H5ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(H5ServerApplication.class, args);
	}
}
