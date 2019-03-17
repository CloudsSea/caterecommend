package edu.njtu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.njtu.mapper")
public class CaterecommendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaterecommendApplication.class, args);
	}

}
