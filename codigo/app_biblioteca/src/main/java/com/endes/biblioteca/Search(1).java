package com.endes.servicios;

import com.endes.biblioteca.BookItem;

public interface Search {
	   BookItem searchByTitle(String title);
	   BookItem searchByAuthor(String author);
}
		