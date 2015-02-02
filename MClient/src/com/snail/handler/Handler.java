package com.snail.handler;

import com.snail.message.IMessage;

public abstract class Handler {
	//待处理消息
	private IMessage msg;
	//参数
	private Object parameter;
	
	public IMessage getMsg() {
		return msg;
	}
	
	public void setMsg(IMessage msg) {
		this.msg = msg;
	}
	
	public Object getParameter() {
		return parameter;
	}
	
	public void setParameter(Object parameter) {
		this.parameter = parameter;
	}
	
	public void handlerMsg() {
		
	}
}

