package com.nationallibrary.booksCatalog.repository;

import com.nationallibrary.booksCatalog.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedQuery;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,String> {
    String UPDATE_BOOK_PUBLISHER="UPDATE BOOKS book SET book.publisher=:publisher WHERE book.id=:id";
    String UPDATE_BOOK_AUTHOR="UPDATE BOOKS book SET book.author=:author WHERE book.id=:id";
    Book findByName(String name);
    List<Book> findAllByPublisher(String publisher);
    List<Book> findAllByAuthor(String author);
    List<Book> findAllByName(String name);
    List<Book> findAllByAuthorAndPublisher(String author,  String publisher);
    List<Book> findAllByPublisherAndName( String name,String publisher);
    List<Book> findAllByNameAndAuthor(String name,String author);
    List<Book> findAllByAuthorAndNameAndPublisher(String name, String publisher, String author);
    @Modifying
    @Query(value ="update BOOKS book set book.name=:name where book.id=:id")
    Book updateName(@Param("name")String name,@Param("id")String id);
    @Modifying
    @Query(value = UPDATE_BOOK_PUBLISHER)
    Book updatePublisher(@Param("publisher")String publisher ,@Param("id")String id);
    @Modifying
    @Query(value = UPDATE_BOOK_AUTHOR)
    Book updateAuthor(@Param("author")String author ,@Param("id")String id);

}
