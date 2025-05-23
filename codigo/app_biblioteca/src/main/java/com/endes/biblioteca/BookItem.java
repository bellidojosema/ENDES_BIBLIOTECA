package com.endes.biblioteca;

/**
 * Representa un elemento de libro en la biblioteca con información como ISBN, título, autor y año de publicación.
 */
public class BookItem {
    /** El ISBN único del libro. */
    private String ISBN;
    /** El título del libro. */
    private String title;
    /** El autor del libro. */
    private String author;
    /** El año de publicación del libro. */
    private int publicationYear;

    /**
     * Constructor para crear un nuevo BookItem.
     * 
     * @param ISBN El ISBN único del libro.
     * @param title El título del libro.
     * @param author El autor del libro.
     * @param publicationYear El año de publicación del libro.
     */
    public BookItem(String ISBN, String title, String author, int publicationYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    /**
     * Obtiene el ISBN del libro.
     * 
     * @return El ISBN del libro.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Establece el ISBN del libro.
     * 
     * @param ISBN El nuevo ISBN del libro.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Obtiene el título del libro.
     * 
     * @return El título del libro.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Establece el título del libro.
     * 
     * @param title El nuevo título del libro.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Obtiene el autor del libro.
     * 
     * @return El autor del libro.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Establece el autor del libro.
     * 
     * @param author El nuevo autor del libro.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Obtiene el año de publicación del libro.
     * 
     * @return El año de publicación del libro.
     */
    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     * Establece el año de publicación del libro.
     * 
     * @param publicationYear El nuevo año de publicación del libro.
     */
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}