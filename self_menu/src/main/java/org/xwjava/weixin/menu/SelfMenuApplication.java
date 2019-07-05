package org.xwjava.weixin.menu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.xwjava.commons.config.EventListenerConfig;
import org.xwjava.commons.domain.event.EventInMessage;

@SpringBootApplication
@EntityScan("org.xwjava")
@ComponentScan("org.xwjava")
public class SelfMenuApplication implements EventListenerConfig{
	public static void main(String[] args) {
		SpringApplication.run(SelfMenuApplication.class, args);
	}

	@Override
	public void handle(EventInMessage msg) {
		// TODO Auto-generated method stub
		// 目前此模块不处理任何消息，所以这里留空即可
	}
}
