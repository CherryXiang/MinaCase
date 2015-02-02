package com.snail.mina.code;

import java.nio.charset.Charset;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

public class ServerProtocolCodecFactory implements ProtocolCodecFactory {
	private final ServerProtocolDecoder decoder;
	private final ServerProtocolEncoder encoder;
	
	public ServerProtocolCodecFactory () {
		this(Charset.defaultCharset());
	}

	public ServerProtocolCodecFactory (Charset charset) {
		this.decoder = new ServerProtocolDecoder(charset);
		this.encoder = new ServerProtocolEncoder(charset);
	}

	@Override
	public ProtocolDecoder getDecoder(IoSession arg0) throws Exception {
		// TODO 自动生成的方法存根
		return decoder;
	}

	@Override
	public ProtocolEncoder getEncoder(IoSession arg0) throws Exception {
		// TODO 自动生成的方法存根
		return encoder;
	}
}

