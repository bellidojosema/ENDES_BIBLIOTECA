package com.endes.biblioteca;

import com.endes.servicios.Manage;
import com.endes.servicios.Search;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;
    private BookItem book;

    @BeforeEach
    void setUp() {
        library = new Library();
        book = new BookItem("12345", "Test Book", "Test Author", 2020);
        library.createBookItem(book);
    }

    @Test
    void testCreateBookItem() {
        assertEquals(1, library.getBookItem("12345") != null ? 1 : 0);
    }

    @Test
    void testSearchByTitle() {
        BookItem found = library.searchByTitle("Test Book");
        assertNotNull(found);
        assertEquals("Test Book", found.getTitle());
    }

    @Test
    void testSearchByAuthor() {
        BookItem found = library.searchByAuthor("Test Author");
        assertNotNull(found);
        assertEquals("Test Author", found.getAuthor());
    }

    @Test
    void testUpdateBookItem() {
        BookItem updatedBook = new BookItem("12345", "Updated Book", "Updated Author", 2021);
        library.updateBookItem(updatedBook);
        BookItem found = library.getBookItem("12345");
        assertEquals("Updated Book", found.getTitle());
        assertEquals("Updated Author", found.getAuthor());
    }

    @Test
    void testDeleteBookItem() {
        library.deleteBookItem("12345");
        assertNull(library.getBookItem("12345"));
    }

    @Test
    void testGetBookItem() {
        BookItem found = library.getBookItem("12345");
        assertNotNull(found);
        assertEquals("12345", found.getISBN());
    }
}