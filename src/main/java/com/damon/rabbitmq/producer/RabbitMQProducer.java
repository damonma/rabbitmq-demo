package com.damon.rabbitmq.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * RabbitMQProducer
 *
 * @author damon
 * @date 2017/4/13
 */
@Service
public class RabbitMQProducer {

    private static Logger logger = LoggerFactory.getLogger(RabbitMQProducer.class);

    @Resource
    private AmqpTemplate amqpTemplate;

    public void send(String message) {
        logger.info("RabbitMQProducer send '{}'", message);
        amqpTemplate.convertAndSend("queueTestKey", message);
    }
}
