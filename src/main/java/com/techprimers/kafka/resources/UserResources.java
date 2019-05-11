package com.techprimers.kafka.resources;

import com.techprimers.kafka.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class UserResources {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;
    private static final String TOPIC = "Kafka_Example";


    @PostMapping("/publish")
    public User postUser(@RequestBody final User user) {
        kafkaTemplate.send(TOPIC, new User(user.getName(), user.getIdade()));
        System.out.println("------" + user.getName() + "---------");
        return new User(user.getName(), user.getIdade());
    }
}

