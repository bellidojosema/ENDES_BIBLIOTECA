package com.endes.biblioteca;

import com.endes.servicios.Manage;
import com.endes.servicios.Search;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca y gestiona una colección de libros.
 * Implementa las interfaces {@link Search} y {@link Manage} para buscar y administrar libros.
 */
public class Library implements Search, Manage {
    /** Lista que almacena los libros de la biblioteca. */
    private List<BookItem> books;

    /**
     * Constructor que inicializa una biblioteca vacía.
     */
    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Busca un libro por su título.
     * 
     * @param title El título del libro a buscar.
     * @return El objeto {@link BookItem} que coincide con el título, o null si no se encuentra.
     */
    @Override
    public BookItem searchByTitle(String title) {
        for (BookItem book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Busca un libro por su autor.
     * 
     * @param author El autor del libro a buscar.
     * @return El objeto {@link BookItem} que coincide con el autor, o null si no se encuentra.
     */
    @Override
    public BookItem searchByAuthor(String author) {
        for (BookItem book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Añade un nuevo libro a la biblioteca.
     * 
     * @param bookItem El objeto {@link BookItem} a añadir.
     */
    @Override
    public void createBookItem(BookItem bookItem) {
        books.add(bookItem);
    }

    /**
     * Actualiza la información de un libro existente en la biblioteca.
     * 
     * @param bookItem El objeto {@link BookItem} con la información actualizada.
     */
    @Override
    public void updateBookItem(BookItem bookItem) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(bookItem.getISBN())) {
                books.set(i, bookItem);
                return;
            }
        }
    }

    /**
     * Elimina un libro de la biblioteca usando su ISBN.
     * 
     * @param ISBN El ISBN del libro a eliminar.
     */
    @Override
    public void deleteBookItem(String ISBN) {
        books.removeIf(book -> book.getISBN().equals(ISBN));
    }

    /**
     * Obtiene un libro de la biblioteca por su ISBN.
     * 
     * @param ISBN El ISBN del libro a obtener.
     * @return El objeto {@link BookItem} que coincide con el ISBN, o null si no se encuentra.
     */
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