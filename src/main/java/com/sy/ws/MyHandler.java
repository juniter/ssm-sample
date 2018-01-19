package com.sy.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component("myHandler")
public class MyHandler extends TextWebSocketHandler {
    public static final Logger logger = LoggerFactory.getLogger(MyHandler.class);
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        logger.info("received message from client : {},text message:{}",message.toString(),message.getPayload());
        session.sendMessage(new TextMessage("server received your message!"));
        super.handleTextMessage(session, message);
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        logger.info("connection established with session id : {}",session.getId());
        super.afterConnectionEstablished(session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        logger.info("connection closed withd session id: {}, and with status code : {}!",session.getId(),status);
        super.afterConnectionClosed(session, status);
    }
}
