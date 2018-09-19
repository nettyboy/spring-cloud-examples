package com.zhht.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhht.rabbitmq.RabbitmqProducer;

@RestController
public class MessageController {

	
	@Autowired
	private RabbitmqProducer rabbitmqProducer;
	
	@RequestMapping(value="sendmsg",method=RequestMethod.GET)
	public String sendMessage(@RequestParam("message") String message) {
		rabbitmqProducer.sendMessage(message);
		return "sucess";
	}
}
