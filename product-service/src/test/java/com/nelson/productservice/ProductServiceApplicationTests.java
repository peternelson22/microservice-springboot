package com.nelson.productservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
//@Testcontainers
class ProductServiceApplicationTests {

//	@Container
//	static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer<>("postgres:15-alpine");
//
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
//		dynamicPropertyRegistry.add("spring.data.postgresql.uri", postgreSQLContainer::get);
//	}

	@Test
	void contextLoads() {
	}

}
