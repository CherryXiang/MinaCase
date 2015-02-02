package com.snail.pool;

import java.util.HashMap;

import com.google.protobuf.GeneratedMessage;
import com.snail.handler.Handler;
import com.snail.handler.ReqLoginHandler;
import com.snail.handler.ReqRegisterHandler;
import com.snail.message.ReqLoginMsg;
import com.snail.message.ReqRegisterMsg;

public class MessagePool {
	//Message类字典
	private HashMap<Integer, Class<?>> messages = new HashMap<Integer, Class<?>>();
	
	//Handler类字段
	private HashMap<Integer, Class<?>> handlers = new HashMap<Integer, Class<?>>();
	
	public MessagePool () {
		register(100, ReqRegisterMsg.class, ReqRegisterHandler.class);
		register(103, ReqLoginMsg.class, ReqLoginHandler.class);
	}
	
	//注册Message和Handler
	private void register(int id, Class<?> messageClass, Class<?> handlerClass){
		messages.put(id, messageClass);
		if(handlerClass!=null) handlers.put(id, handlerClass);
	}
	
	//获取Message类
	public GeneratedMessage getMessage(int id) throws InstantiationException, IllegalAccessException{
		if(!messages.containsKey(id)){
			return null;
		}else{
			return (GeneratedMessage)messages.get(id).newInstance();
		}
	}

	//获取Handler类
	public Handler getHandler(int id) throws InstantiationException, IllegalAccessException{
		if(!handlers.containsKey(id)){
			return null;
		}else{
			return (Handler)handlers.get(id).newInstance();
		}
	}
}