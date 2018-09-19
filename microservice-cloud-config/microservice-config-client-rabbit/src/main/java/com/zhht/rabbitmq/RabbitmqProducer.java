package com.zhht.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * mq 生产端
 * @author ningquan
 *
 */
@Component
public class RabbitmqProducer {

	private static final Logger logger = LoggerFactory.getLogger(RabbitmqProducer.class);
	
	@Autowired
    private AmqpTemplate rabbitTemplate;
	
	public void sendMessage(String message) {
		logger.info("method :sendMessage send message={}",message);
		rabbitTemplate.convertAndSend("helloQueue", message);
		logger.info("method :sendMessage send message finish!");
	}
}
