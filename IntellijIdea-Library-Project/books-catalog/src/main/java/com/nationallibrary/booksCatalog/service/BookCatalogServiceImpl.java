package com.nationallibrary.booksCatalog.service;

import com.nationallibrary.booksCatalog.dto.BookDto;
import com.nationallibrary.booksCatalog.entity.Book;
import com.nationallibrary.booksCatalog.repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookCatalogServiceImpl implements BookCatalogService{
    @Autowired
    private BookRepository bookRepository;
    ModelMapper mapper=new ModelMapper();
    List<BookDto> allAvailableBooks=new ArrayList();
    @Override
    public BookDto addBook(BookDto bookDto) {
        Book bookEntity = mapper.map(bookDto, Book.class);
        Book savedBook = bookRepository.save(bookEntity);
        BookDto savedBookDto = mapper.map(savedBook, BookDto.class);
        return savedBookDto;
    }

    @Override
    public List<BookDto> getAllAvailableBooks(int page,int limit) {

        Pageable pageable= PageRequest.of(page, limit);
        Page<Book> allBooksAsPage = bookRepository.findAll(pageable);
        List<Book> booksEntityAsList = allBooksAsPage.getContent();
        for (Book book :booksEntityAsList) {
            BookDto bookDto = mapper.map(book, BookDto.class);
            allAvailableBooks.add(bookDto);
        }
        return allAvailableBooks;
    }

    @Override
    public List<BookDto> searchBooksByPublisher( String publisher) {
        List<Book> allByPublisher= bookRepository.findAllByPublisher(publisher);
        for (Book book :allByPublisher) {
            BookDto bookDto = mapper.map(book, BookDto.class);
            allAvailableBooks.add(bookDto);
        }
        return allAvailableBooks;
    }

    @Override
    public List<BookDto> searchBooksByAuthor(String author) {
        List<Book> allByPublisher= bookRepository.findAllByAuthor(author);
        for (Book book :allByPublisher) {
            BookDto bookDto = mapper.map(book, BookDto.class);
            allAvailableBooks.add(bookDto);
        }
        return allAvailableBooks;
    }

    @Override
    public List<BookDto> searchBooksByName(String name) {
        List<Book> allByPublisher= bookRepository.findAllByName(name);
        for (Book book :allByPublisher) {
            BookDto bookDto = mapper.map(book, BookDto.class);
            allAvailableBooks.add(bookDto);
        }
        return allAvailableBooks;
    }

    @Override
    public List<BookDto> searchBooksByPublisherAndAuthor( String publisher, String author) {
        List<Book> allByPublisher= bookRepository.findAllByAuthorAndPublisher(author,publisher);
        for (Book book :allByPublisher) {
            BookDto bookDto = mapper.map(book, BookDto.class);
            allAvailableBooks.add(bookDto);
        }
        return allAvailableBooks;
    }

    @Override
    public List<BookDto> searchBooksByPublisherAndName( String publisher, String name) {
        List<Book> allByPublisher= bookRepository.findAllByPublisherAndName(publisher,name);
        for (Book book :allByPublisher) {
            BookDto bookDto = mapper.map(book, BookDto.class);
            allAvailableBooks.add(bookDto);
        }
        return allAvailableBooks;
    }
    @Override
    public List<BookDto> searchBooksByAuthorAndName(String author, String name) {
        List<Book> allByPublisher= bookRepository.findAllByNameAndAuthor(author,name);
        for (Book book :allByPublisher) {
            BookDto bookDto = mapper.map(book, BookDto.class);
            allAvailableBooks.add(bookDto);
        }
        return allAvailableBooks;
    }
    @Override
    public List<BookDto> searchBooksByPublisherNameAndAuthorAndPublisher(String name, String author, String publisher) {
        List<Book> allByPublisher= bookRepository.findAllByAuthorAndNameAndPublisher(name,publisher,author);
        System.out.println(allByPublisher);
        for (Book book :allByPublisher) {
            BookDto bookDto = mapper.map(book, BookDto.class);
            allAvailableBooks.add(bookDto);
        }
        return allAvailableBooks;
    }

    @Override
    public BookDto updateBookByName(String id, String name){
        Book updatedBook = bookRepository.updateName(id, name);
        BookDto updatedBookDto = mapper.map(updatedBook, BookDto.class);
        return updatedBookDto;
    }

    @Override
    public BookDto updateBookByPublisher(String id, String publisher) {
        Book updatedBook = bookRepository.updatePublisher(id, publisher);
        BookDto updatedBookDto = mapper.map(updatedBook, BookDto.class);
        return updatedBookDto;
    }

    @Override
    public BookDto updateBookByAuthor(String id, String author) {
        Book updatedBook = bookRepository.updateAuthor(id, author);
        BookDto updatedBookDto = mapper.map(updatedBook, BookDto.class);
        return updatedBookDto;
    }
        @Override
    public void deleteBook(String id) {
            Optional<Book> optionalBook = bookRepository.findById(id);
            Book book=optionalBook.get();
            bookRepository.delete(book);
    }


}
