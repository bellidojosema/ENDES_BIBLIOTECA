package com.endes.biblioteca;

import com.endes.servicios.Manage;
import com.endes.servicios.Search;
import java.util.ArrayList;
import java.util.List;

public class Library implements Search, Manage {
    private List<BookItem> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    @Override
    public BookItem searchByTitle(String title) {
        for (BookItem book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public BookItem searchByAuthor(String author) {
        for (BookItem book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void createBookItem(BookItem bookItem) {
        books.add(bookItem);
    }

    @Override
    public void updateBookItem(BookItem bookItem) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(bookItem.getISBN())) {
                books.set(i, bookItem);
                return;
            }
        }
    }

    @Override
    public void deleteBookItem(String ISBN) {
        books.removeIf(book -> book.getISBN().equals(ISBN));
    }

    @Override
    public BookItem getBookItem(String ISBN) {
        for (BookItem book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
}