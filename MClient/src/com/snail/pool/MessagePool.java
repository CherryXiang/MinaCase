package com.snail.pool;

import java.util.HashMap;

import com.google.protobuf.GeneratedMessage;
import com.snail.handler.Handler;
import com.snail.handler.ResLoginHandler;
import com.snail.handler.ResRegisterHandler;
import com.snail.message.ResLoginMsg;
import com.snail.message.ResRegisterMsg;

public class MessagePool {
	//Message类字典
	private static HashMap<Integer, Class<?>> messages = new HashMap<Integer, Class<?>>();
	
	//Handler类字段
	private static HashMap<Integer, Class<?>> handlers = new HashMap<Integer, Class<?>>();
	
	public MessagePool () {
		register(101, ResRegisterMsg.class, ResRegisterHandler.class);
		register(104, ResLoginMsg.class, ResLoginHandler.class);
	}
	
	//注册Message和Handler
	private void register(int id, Class<?> messageClass, Class<?> handlerClass){
		messages.put(id, messageClass);
		if(handlerClass!=null) handlers.put(id, handlerClass);
	}
	
	//获取Message类
	public static GeneratedMessage getMessage(int id) throws InstantiationException, IllegalAccessException{
		if(!messages.containsKey(id)){
			return null;
		}else{
			return (GeneratedMessage)messages.get(id).newInstance();
		}
	}

	//获取Handler类
	public static Handler getHandler(int id) throws InstantiationException, IllegalAccessException{
		if(!handlers.containsKey(id)){
			return null;
		}else{
			return (Handler)handlers.get(id).newInstance();
		}
	}
}