package com.zhht.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * mq 消费端
 * @author ningquan
 *
 */
@Component
@RabbitListener(queues= {"helloQueue"})
public class RabbitConsumer {

	private static final Logger logger = LoggerFactory.getLogger(RabbitConsumer.class);
	
	@RabbitHandler
	 public void process(String msg) {
		logger.info("开始消费消息，message content={}",msg);
	 }
}
