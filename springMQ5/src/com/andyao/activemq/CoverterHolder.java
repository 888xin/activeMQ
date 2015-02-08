package com.andyao.activemq;

import java.util.HashMap;
import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.support.converter.MessageConverter;

public class CoverterHolder implements MessageConverter {
	private MessageConverter defaultMessageConverter;
	private Map<String, MessageConverter> converters = new HashMap<String, MessageConverter>();

	public Message toMessage(Object obj, Session session) throws JMSException {
		String clz = obj.getClass().getName();
		if (converters.containsKey(clz)) {
			Message message = converters.get(clz).toMessage(obj, session);
			message.setObjectProperty("meta-class", clz);
			return message;
		} else {
			Message message = defaultMessageConverter.toMessage(obj, session);
			message.setObjectProperty("default-meta-class", clz);
			return message;
		}
	}
	public Object fromMessage(Message msg) throws JMSException {
		if (msg.getObjectProperty("meta-class") != null) {
			String clz = msg.getObjectProperty("meta-class").toString();
			if (converters.containsKey(clz)) {
				return converters.get(clz).fromMessage(msg);
			}
		} else if (msg.getObjectProperty("default-meta-class") != null) {
			return defaultMessageConverter.fromMessage(msg);
		} else {
			throw new JMSException("Msg:[" + msg + "] is not Map");
		}

		return null;
	}

	public void setConverters(Map<String, MessageConverter> converters) {
		this.converters = converters;
	}

	public void setDefaultMessageConverter(MessageConverter defaultMessageConverter) {
		this.defaultMessageConverter = defaultMessageConverter;
	}

}
