package com.example.dockerkafkagreatestsfinance.controller;

import com.example.dockerkafkagreatestsfinance.kafka.service.EmployeeProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor(onConstructor_ = @Autowired)
@RestController
public class EmployeeControllerProducer {

    private final EmployeeProducer employeeProducer;

    @PostMapping("/employees/{id}/{firstName}/{lastName}")
    public String producerAvroMessage(@PathVariable int id, @PathVariable String firstName,
                                      @PathVariable String lastName) {
        employeeProducer.produceEmployeeDetails(id, firstName, lastName);
        return "Sent employee details to consumer";
    }
}
