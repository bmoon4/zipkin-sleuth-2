package com.moon.zipkindemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication 
@ComponentScan()
public class ZipkinDemoApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinDemoApplication.class, args);
	}
}