package org.xwjava.weixin.library.service;

import org.springframework.data.domain.Page;
import org.xwjava.weixin.library.domain.Book;
import org.xwjava.weixin.library.domain.DebitList;

public interface LibraryService {

	Page<Book> search(String keyword, int pageNumber);

	void add(String id, DebitList list);

	void remove(String id, DebitList list);

}
