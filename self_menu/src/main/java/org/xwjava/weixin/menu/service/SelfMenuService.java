package org.xwjava.weixin.menu.service;

import org.xwjava.weixin.menu.domain.SelfMenu;

public interface SelfMenuService {

	SelfMenu getMenu();

	void saveMenu(SelfMenu selfMenu);

	

}
