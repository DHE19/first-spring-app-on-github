package com.example.demo;

import org.junit.jupiter.api.Test;

//@SpringBootTest
class SpringDeployApplicationTests {

	@Test
	void contextLoads() {
		System.getenv().forEach((key, value) -> System.out.println(key  +" " +value));
	}

}
