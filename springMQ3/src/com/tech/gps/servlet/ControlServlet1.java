package com.tech.gps.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
 
import com.tech.gps.util.MessageSender;
 
 
public class ControlServlet1 extends HttpServlet {
    
	private MessageSender topicSender;
	 
  
	public MessageSender getTopicSender() {
		return topicSender;
	}

	public void setTopicSender(MessageSender topicSender) {
		this.topicSender = topicSender;
	}

	public void init() throws ServletException {
 
	}
	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		     doPost(request,response);
	}

	 
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
  
		  request.setCharacterEncoding("utf-8");
		 
		  for(int i =0;i<10;i++){
			
		    try {
				 Thread.sleep(1000);
			  } catch (InterruptedException e) {
				 
				  e.printStackTrace();
			  }	  
			  
		      topicSender.sendMessage("坐标：118.36582,37.2569812");
		  
		  }
		 
	}

}
