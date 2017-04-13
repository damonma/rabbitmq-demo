package com.damon.rabbitmq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

/**
 * RabbitMQConsumer
 *
 * @author damon
 * @date 2017/4/13
 */
@Service
public class RabbitMQConsumer implements MessageListener {

    private static Logger logger = LoggerFactory.getLogger(RabbitMQConsumer.class);

    @Override
    public void onMessage(Message message) {
        try {
            String result = new String(message.getBody(), "UTF-8");
            System.out.println("RabbitMQConsumer receive '" + result + "'");
            logger.info("RabbitMQConsumer receive '{}'", result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
