package com.snail.message;

public class IMessage {
	private int msgId;
	private byte[] msgBody;
	
	public IMessage (int msgId, byte[] msgBody) {
		this.msgId = msgId;
		this.msgBody = msgBody;
	}
	
	public int getMsgId() {
		return msgId;
	}

	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}

	public byte[] getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(byte[] msgBody) {
		this.msgBody = msgBody;
	}
}

