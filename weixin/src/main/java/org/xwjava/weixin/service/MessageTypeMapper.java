package org.xwjava.weixin.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.xwjava.commons.domain.InMessage;
import org.xwjava.commons.domain.event.EventInMessage;
import org.xwjava.commons.domain.image.ImageInMessage;
import org.xwjava.commons.domain.link.LinkInMessage;
import org.xwjava.commons.domain.location.LocationInMessage;
import org.xwjava.commons.domain.shortvideo.ShortVideoInMessage;
import org.xwjava.commons.domain.test.TextInMessage;
import org.xwjava.commons.domain.video.VideoInMessage;
import org.xwjava.commons.domain.voice.VoiceInMessage;

public class MessageTypeMapper {

	private static Map<String, Class<? extends InMessage>> typeMap=new ConcurrentHashMap<>();
	//通过Map记录消息类型和类的关系
	static {
		typeMap.put("text", TextInMessage.class);
		typeMap.put("image", ImageInMessage.class);
		typeMap.put("link", LinkInMessage.class);
		typeMap.put("location", LocationInMessage.class);
		typeMap.put("shortvideo", ShortVideoInMessage.class);
		typeMap.put("video", VideoInMessage.class);
		typeMap.put("voice", VoiceInMessage.class);
		typeMap.put("event", EventInMessage.class);
	}
	
	//通过消息类型获取对应的类
	@SuppressWarnings("unchecked")
	public static <T extends InMessage> Class<T>getClass(String type){
		return (Class<T>) typeMap.get(type);
	}
}
