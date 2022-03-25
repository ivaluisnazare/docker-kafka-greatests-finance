package com.example.dockerkafkagreatestsfinance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.schema.registry.EnableSchemaRegistryServer;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
@EnableSchemaRegistryServer
public class DockerKafkaGreatestsFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerKafkaGreatestsFinanceApplication.class, args);
	}

}
