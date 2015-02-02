package com.snail.mina.code;

import java.nio.charset.Charset;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

import com.snail.message.IMessage;

public class ServerProtocolDecoder extends CumulativeProtocolDecoder {
	private final Charset charset;

	public ServerProtocolDecoder (Charset charset) {
		this.charset = charset;
	}

	@Override
	protected boolean doDecode(IoSession session, IoBuffer buffer, ProtocolDecoderOutput out) throws Exception {
		// TODO 自动生成的方法存根
		if (buffer.remaining() < 8) {
			return false;
		} else {
			buffer.mark();
			int length = buffer.getInt();
			int msgId = buffer.getInt();
			
			if (buffer.remaining() < length) {
				buffer.reset();
				return false;
			} else {
				byte[] bytes = new byte[length];
				buffer.get(bytes);		
				IMessage msg = new IMessage(msgId, bytes);
				out.write(msg);
				return true;
			}
		}
	}
}

