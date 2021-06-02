package com.example.springbpgsql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author suixinlu
 */
@MapperScan("com.example.springbpgsql.dao")
@SpringBootApplication
public class SpringbPgsqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbPgsqlApplication.class, args);
    }

}
