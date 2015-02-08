package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JMSTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-jms.xml");
		ProxyJMSConsumer proxyJMSConsumer = (ProxyJMSConsumer) applicationContext.getBean("messageReceiver");
		proxyJMSConsumer.recive();

		System.out.println("初始化消息消费者");
	}

}