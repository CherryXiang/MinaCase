package com.snail.handler;

import org.apache.log4j.Logger;

import com.google.protobuf.InvalidProtocolBufferException;
import com.snail.message.ReqLoginMsg.ReqLogin;

public class ReqLoginHandler extends Handler {
    private Logger log = Logger.getLogger(ReqLoginHandler.class);
	
	public void handlerMsg() {
		try {
			ReqLogin msg = ReqLogin.parseFrom(this.getMsg().getMsgBody());
			log.error("收到消息:" + msg.getId() + ", " + msg.getUserId() + ", " + msg.getUsername() + ", " + msg.getPwd());

		} catch (InvalidProtocolBufferException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
