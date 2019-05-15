package org.xwjava.commons.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class OutMessage {
	
	@JsonProperty("touser")
	private String toUser;
	@JsonProperty("messageType")
	private String MessageType;
	public String getToUser() {
		return toUser;
	}
	public void setToUser(String toUser) {
		this.toUser = toUser;
	}
	public String getMessageType() {
		return MessageType;
	}
	public void setMessageType(String messageType) {
		MessageType = messageType;
	}
	
	
	
}
