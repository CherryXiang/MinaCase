package com.snail.mina.code;

import java.nio.charset.Charset;

import org.apache.log4j.Logger;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoderAdapter;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

import com.snail.message.IMessage;

public class ServerProtocolEncoder extends ProtocolEncoderAdapter {
    private final Charset charset;
    
    public ServerProtocolEncoder (Charset charset) {
    	this.charset = charset;
    }
	
	@Override
	public void encode(IoSession session, Object obj, ProtocolEncoderOutput out)
			throws Exception {
		// TODO 自动生成的方法存根		
		IMessage msg = (IMessage)obj;
		
		int msgId = msg.getMsgId();
		int length = msg.getMsgBody().length;
		IoBuffer buffer = IoBuffer.allocate(length + 8);
		buffer.putInt(length);
		buffer.putInt(msgId);
		buffer.put(msg.getMsgBody());
		buffer.flip();
		
		out.write(buffer);
	}
}

