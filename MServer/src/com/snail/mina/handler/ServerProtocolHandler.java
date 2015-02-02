package com.snail.mina.handler;

import org.apache.log4j.Logger;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import com.snail.handler.Handler;
import com.snail.message.IMessage;
import com.snail.mina.server.MinaServer;

public class ServerProtocolHandler extends IoHandlerAdapter {
	
	private Logger log = Logger.getLogger(ServerProtocolHandler.class);

	@Override
	public void exceptionCaught(IoSession session, Throwable arg1) // 当接口中其他方法抛出异常未被捕获时触发此方法
			throws Exception {
		// TODO 自动生成的方法存根
		log.error("ServerProtocolHandler Exception!");
	}

	@Override
	public void messageReceived(IoSession session, Object obj) throws Exception {
		// TODO 自动生成的方法存根
		log.error("Received " + session.getRemoteAddress() + " message!");

		IMessage msg = (IMessage)obj;
		Handler handler = MinaServer.getMessagePool().getHandler(msg.getMsgId());
		handler.setMsg(msg);
		handler.handlerMsg();
	}
	

	@Override
	public void messageSent(IoSession session, Object obj) throws Exception { // 当信息已经传送给客户端后触发此方法.
		// TODO 自动生成的方法存根
	}

	@Override
	public void sessionClosed(IoSession session) throws Exception { // 当一个客户端关闭时
		// TODO 自动生成的方法存根
		//log.error("Session " + session.getRemoteAddress() + " closed!");
	}

	@Override
	public void sessionCreated(IoSession session) throws Exception { // 当一个新客户端连接后触发此方法
		// TODO 自动生成的方法存根
		log.error("Session " + session.getRemoteAddress() + " created!");
	}

	@Override
	public void sessionIdle(IoSession session, IdleStatus arg1) throws Exception { // 当连接空闲时触发此方法.
		// TODO 自动生成的方法存根
	}

	@Override
	public void sessionOpened(IoSession session) throws Exception { // 当一个客端端连结进入时
		// TODO 自动生成的方法存根 
		log.error("Session " + session.getRemoteAddress() + " opened!");
	}

}

