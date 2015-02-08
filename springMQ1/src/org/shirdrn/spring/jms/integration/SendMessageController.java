package org.shirdrn.spring.jms.integration;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class SendMessageController extends MultiActionController {

	private String successView;
	private MessageSender messageSender;

	public ModelAndView sendMessage(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Map<String, Object> retMap = new HashMap<String, Object>();
		String message = request.getParameter("message");
		messageSender.sendMessage(message);
		
		return new ModelAndView(successView, retMap);
	}

	public String getSuccessView() {
		return successView;
	}

	public void setSuccessView(String successView) {
		this.successView = successView;
	}

	public MessageSender getMessageSender() {
		return messageSender;
	}

	public void setMessageSender(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

}