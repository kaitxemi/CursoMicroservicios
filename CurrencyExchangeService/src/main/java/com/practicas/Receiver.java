package com.practicas;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {


    @RabbitListener(queues="${limits-event.rabbitmq.queue}")
    public void receiveMessage(LimitConfiguration message) {
        System.out.println("Received <" + message + ">");
    }

}
