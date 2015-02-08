package com.tiantian.springintejms.service;

import java.io.Serializable;

import javax.jms.Destination;

public interface ProducerService {

    /**
     * 发送普通的纯文本消息
     * @param destination
     * @param message
     */
    public void sendMessage(Destination destination, String message);

    /**
     * 发送一个ObjectMessage
     * @param destination
     * @param obj
     */
    public void sendMessage(Destination destination, Serializable obj);

}
