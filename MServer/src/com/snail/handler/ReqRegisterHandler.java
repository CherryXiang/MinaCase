package com.snail.handler;

import org.apache.log4j.Logger;

import com.google.protobuf.InvalidProtocolBufferException;
import com.snail.message.ReqRegisterMsg.ReqRegister;

public class ReqRegisterHandler extends Handler {
	private Logger log = Logger.getLogger(ReqRegisterHandler.class);
	
	public void handlerMsg() {	
		try {
			ReqRegister msg = ReqRegister.parseFrom(this.getMsg().getMsgBody());
			log.error("收到消息：" + msg.getId() + ", " + msg.getUserId() + ", " + msg.getUserName() + ", " + msg.getPwd() + ", " + msg.getEmail() + ", " + msg.getSex());

		} catch (InvalidProtocolBufferException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}	
}
