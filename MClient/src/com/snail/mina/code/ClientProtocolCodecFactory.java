package com.snail.mina.code;

import java.nio.charset.Charset;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

public class ClientProtocolCodecFactory implements ProtocolCodecFactory {
	private final ClientProtocolDecoder decoder;
	private final ClientProtocolEncoder encoder;
	
	public ClientProtocolCodecFactory () {
		this(Charset.defaultCharset());
	}

	public ClientProtocolCodecFactory (Charset charset) {
		this.decoder = new ClientProtocolDecoder(charset);
		this.encoder = new ClientProtocolEncoder(charset);
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