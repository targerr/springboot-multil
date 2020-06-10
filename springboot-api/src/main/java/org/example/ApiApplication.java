package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Wgs (ˇˍˇ)
 * @version 1.0
 * @create：2020/06/10
 */
@SpringBootApplication
@MapperScan("org.example.mapper")
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
