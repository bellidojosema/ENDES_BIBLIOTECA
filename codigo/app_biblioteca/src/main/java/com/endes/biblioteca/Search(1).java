package com.endes.servicios;

import com.endes.biblioteca.BookItem;

/**
 * Interfaz que define métodos para buscar libros en la biblioteca por título o autor.
 */
public interface Search {
    /**
     * Busca un libro por su título.
     * 
     * @param title El título del libro a buscar.
     * @return El objeto {@link BookItem} que coincide con el título, o null si no se encuentra.
     */
    BookItem searchByTitle(String title);

    /**
     * Busca un libro por su autor.
     * 
     * @param author El autor del libro a buscar.
     * @return El objeto {@link BookItem} que coincide con el autor, o null si no se encuentra.
     */
    BookItem searchByAuthor(String author);
}