package cn.dcg.demo.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "cn.dcg.demo")
@MapperScan("cn.dcg.demo.dao")
//@ImportResource(locations = "classpath:spring-mybatis.xml")
public class DemoControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoControllerApplication.class, args);
    }
}
