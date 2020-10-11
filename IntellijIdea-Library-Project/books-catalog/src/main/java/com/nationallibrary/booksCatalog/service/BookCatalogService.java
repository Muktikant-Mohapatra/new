package com.nationallibrary.booksCatalog.service;

import com.nationallibrary.booksCatalog.dto.BookDto;

import java.util.List;

public interface BookCatalogService {

    BookDto addBook(BookDto bookDto);

    List<BookDto> getAllAvailableBooks(int page,int limit);

    List<BookDto> searchBooksByPublisher(String publisher);

    List<BookDto> searchBooksByAuthor( String author);

    List<BookDto> searchBooksByName(String name);

    List<BookDto> searchBooksByPublisherAndAuthor( String publisher, String author);

    List<BookDto> searchBooksByPublisherAndName(String publisher, String name);

    List<BookDto> searchBooksByPublisherNameAndAuthorAndPublisher(String name, String author, String publisher);

    BookDto updateBookByName(String id, String name);

    BookDto updateBookByPublisher(String id, String publisher);

    BookDto updateBookByAuthor(String id, String author);

    void deleteBook(String id);

    List<BookDto> searchBooksByAuthorAndName(String author, String name);
}
