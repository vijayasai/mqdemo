package com.ibm.jms.mqdemo.config;

import javax.jms.JMSException;
import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import com.ibm.mq.jms.MQQueue;

@Configuration
@EnableJms
public class JMSconfig {

	@Value("${mo.ibm.mq.queuename}")
	private String messageQueuue;
	
	@Bean
	public Queue queue() throws JMSException {
		return new MQQueue(messageQueuue);
	}
}
