package com.merciqiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.merciqiao.transaction"})
public class SpringTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTransactionApplication.class, args);

	}
}
