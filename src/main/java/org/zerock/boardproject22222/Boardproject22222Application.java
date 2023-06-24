package org.zerock.boardproject22222;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"org.zerock.boardproject22222.**.mappers"})
public class Boardproject22222Application {

	public static void main(String[] args) {
		SpringApplication.run(Boardproject22222Application.class, args);
	}

}
