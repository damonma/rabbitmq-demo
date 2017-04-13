package com.damon.rabbitmq;

import com.damon.rabbitmq.producer.RabbitMQProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ProducerTest
 *
 * @author damon
 * @date 2017/4/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class ProducerTest {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @Test
    public void sendTest() {
        rabbitMQProducer.send("Hello RabbitMQ");
    }
}
