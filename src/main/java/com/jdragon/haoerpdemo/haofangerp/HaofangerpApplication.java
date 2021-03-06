package com.jdragon.haoerpdemo.haofangerp;

import org.junit.jupiter.params.provider.EnumSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableTransactionManagement
@EnableSwagger2
@EnableCaching
public class HaofangerpApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaofangerpApplication.class, args);
    }

}
