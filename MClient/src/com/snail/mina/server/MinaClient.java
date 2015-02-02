package com.snail.mina.server;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import com.snail.mina.code.ClientProtocolCodecFactory;
import com.snail.mina.handler.ClientProtocolHandler;
import com.snail.pool.MessagePool;

public class MinaClient {
	private static MessagePool messagePool = new MessagePool();
	public static MessagePool getMessagePool() {
		return messagePool;
	}
	
	public static void main (String[] args) {
		NioSocketConnector connect = new NioSocketConnector();
		
		DefaultIoFilterChainBuilder chain = connect.getFilterChain();
		chain.addLast("codec", new ProtocolCodecFilter(new ClientProtocolCodecFactory(Charset.forName("UTF-8"))));
		
		connect.setHandler(new ClientProtocolHandler());
		connect.setConnectTimeoutCheckInterval(30);
		
		ConnectFuture cf = connect.connect(new InetSocketAddress("localhost", 8809));
		cf.awaitUninterruptibly();
		cf.getSession().getCloseFuture().awaitUninterruptibly();
		connect.dispose();
	}
}

