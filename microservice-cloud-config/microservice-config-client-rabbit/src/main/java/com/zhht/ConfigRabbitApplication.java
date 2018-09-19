package com.zhht;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConfigRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigRabbitApplication.class, args);
	}

	@Bean
	public Queue helloQueue() {
		return new Queue("helloQueue");
	}
}
