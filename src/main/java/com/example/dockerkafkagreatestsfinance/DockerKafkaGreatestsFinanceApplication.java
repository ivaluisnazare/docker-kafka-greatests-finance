package com.example.dockerkafkagreatestsfinance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class DockerKafkaGreatestsFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerKafkaGreatestsFinanceApplication.class, args);
	}

}
