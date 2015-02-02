package com.snail.mina.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import org.apache.log4j.Logger;
import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import com.snail.mina.code.ServerProtocolCodecFactory;
import com.snail.mina.handler.ServerProtocolHandler;
import com.snail.pool.MessagePool;

public class MinaServer {
	
	private static MessagePool messagePool = new MessagePool();
	public static MessagePool getMessagePool() {
		return messagePool;
	}

	private static Logger log = Logger.getLogger(MinaServer.class);
	
	private static final int port = 8809;

	public static void main (String[] args) {	
        NioSocketAcceptor acceptor = new NioSocketAcceptor();
		
		DefaultIoFilterChainBuilder chain = acceptor.getFilterChain();
		chain.addLast("codec", new ProtocolCodecFilter(new ServerProtocolCodecFactory(Charset.forName("UTF-8"))));
		
		acceptor.setHandler(new ServerProtocolHandler());
		
		try {
			acceptor.bind(new InetSocketAddress(port));
			log.error("MinaServer start at port:" + port);
		} catch (IOException e) {
			log.error("port " + port + "already used!");
			System.exit(1);
		}
	}
}

