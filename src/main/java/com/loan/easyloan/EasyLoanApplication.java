package com.loan.easyloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//主入口类，标注在某个类上，说明这个类是SpringBoot的主配置类
@SpringBootApplication
public class EasyLoanApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyLoanApplication.class, args);
    }

}
