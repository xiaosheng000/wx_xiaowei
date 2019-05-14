package org.xwjava.commons.processors;

import org.xwjava.commons.domain.event.EventInMessage;

public interface EventMessageProcessor {
	
	public void onMessage(EventInMessage msg);
}
