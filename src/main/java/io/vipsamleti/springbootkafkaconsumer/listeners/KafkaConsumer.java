package io.vipsamleti.springbootkafkaconsumer.listeners;

import io.vipsamleti.springbootkafkaconsumer.models.User;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "KAFKA_TOPIC", groupId = "group_id")
    public void consume(String message){
        System.out.println("Consumed Message: "+ message);
    }

    @KafkaListener(topics = "USER_JSON", groupId = "user_json", containerFactory = "userContainerFactory")
    public void consumeUserJson(User user){
        System.out.println("User Json : "+ user);
    }

}
