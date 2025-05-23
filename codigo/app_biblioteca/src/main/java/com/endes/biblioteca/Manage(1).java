package com.endes.servicios;

import com.endes.biblioteca.BookItem;

/**
 * Interfaz que define métodos para la gestión de libros en la biblioteca, incluyendo creación,
 * actualización, eliminación y obtención de libros.
 */
public interface Manage {
    /**
     * Crea un nuevo libro en la biblioteca.
     * 
     * @param bookItem El objeto {@link BookItem} a añadir.
     */
    void createBookItem(BookItem bookItem);

    /**
     * Actualiza la información de un libro existente en la biblioteca.
     * 
     * @param bookItem El objeto {@link BookItem} con la información actualizada.
     */
    void updateBookItem(BookItem bookItem);

    /**
     * Elimina un libro de la biblioteca usando su ISBN.
     * 
     * @param ISBN El ISBN del libro a eliminar.
     */
    void deleteBookItem(String ISBN);

    /**
     * Obtiene un libro de la biblioteca por su ISBN.
     * 
     * @param ISBN El ISBN del libro a obtener.
     * @return El objeto {@link BookItem} que coincide con el ISBN, o null si no se encuentra.
     */
    BookItem getBookItem(String ISBN);
}
