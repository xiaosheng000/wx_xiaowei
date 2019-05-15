package org.xwjava.weixin.unsubscribe;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xwjava.commons.domain.User;
import org.xwjava.commons.domain.event.EventInMessage;
import org.xwjava.commons.processors.EventMessageProcessor;
import org.xwjava.commons.repository.UserRepository;

@Service("unsubscribeMessageProcessor")
public class UnsubscribeEventMessageProcessor implements EventMessageProcessor {

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public void onMessage(EventInMessage msg) {
		if (!msg.getEvent().equals("unsubscribe")) {
			// 非取消关注事件，不处理
			return;
		}
		User user = this.userRepository.findByOpenId(msg.getFromUserName());
		if(user != null) {
		user.setStatus(User.Status.IS_UNSUBSCRIBE);
		user.setUnsubTime(new Date());
		}
	}

}
