package com.example.dockerkafkagreatestsfinance.kafka.service;

import com.example.dockerkafkagreatestsfinance.avro.Employee;
import com.example.dockerkafkagreatestsfinance.avro.EmployeeKey;
//import com.example.dockerkafkagreatestsfinance.repositores.RepositoryConsumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.DataInput;
import java.io.IOException;

@Slf4j
@Service
public class EmployeeConsumer {
    @KafkaListener(topics = "${kafka.topics.employee}", groupId = "greatests-finance")
    public void consumeEmployeeDetails(ConsumerRecord<EmployeeKey,Employee> payload) throws IOException {
        log.info("key: {}", payload.key());
        log.info("Headers: {}", payload.headers());
        log.info("Partition: {}", payload.partition());
        log.info("Let's process employee details: {}", payload.value());

    }
}
