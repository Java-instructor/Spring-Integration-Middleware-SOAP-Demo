package com.java.instructor.soap.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.stereotype.Component;

@Component
public class AmazeChennalInterceptor implements ChannelInterceptor {
	private static final Logger LOGGER = LoggerFactory.getLogger(AmazeChennalInterceptor.class);

	@Override
	public Message<?> preSend(Message<?> message, MessageChannel messageChannel) {
		LOGGER.info("PRE SEND CALLED::" + messageChannel);
		return message;
	}

	@Override
	public void postSend(Message<?> message, MessageChannel messageChannel, boolean sent) {
		if (!sent) {
			LOGGER.info("POST SEND CALLED::" + messageChannel);
			LOGGER.info("Message (" + message + ") was not sent correctly to message channel " + messageChannel);
		}
	}

	@Override
	public boolean preReceive(MessageChannel messageChannel) {
		// LOGGER.info("PRE RECEIVE CALLED::" +messageChannel);
		return true;
	}

	@Override
	public Message<?> postReceive(Message<?> message, MessageChannel messageChannel) {
		// LOGGER.info("POST RECEIVE CALLED::" +messageChannel);
		return message;
	}

}
