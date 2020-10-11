package com.nationallibrary.booksCatalog.controller;

import com.nationallibrary.booksCatalog.dto.BookDto;
import com.nationallibrary.booksCatalog.entity.Book;
import com.nationallibrary.booksCatalog.repository.BookRepository;
import com.nationallibrary.booksCatalog.request.AddBookRequest;
import com.nationallibrary.booksCatalog.respone.AvailableBookDetailsResponse;
import com.nationallibrary.booksCatalog.respone.AddBookResponse;
import com.nationallibrary.booksCatalog.respone.UpdatedBookDetailsResponse;
import com.nationallibrary.booksCatalog.service.BookCatalogService;
import org.apache.commons.lang.enums.EnumUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/bookCatalog")
public class BookCatalogController {
    @Autowired
    private BookCatalogService service;

    ModelMapper mapper=new ModelMapper();

    @PostMapping( value = "/books/book/add")
    public ResponseEntity<AddBookResponse> addBook(@RequestBody AddBookRequest request){
        BookDto bookDto = mapper.map(request, BookDto.class);
        BookDto addedBook=service.addBook(bookDto);
        AddBookResponse response = mapper.map(addedBook, AddBookResponse.class);
        return  ResponseEntity.ok(response);
    }
    @GetMapping(value = "/books")
    public ResponseEntity<AvailableBookDetailsResponse> getAvailableBooks(@RequestParam(name = "page",defaultValue = "1") int page,
                                                                                               @RequestParam(name = "limit",defaultValue = "20") int limit,
                                                                                               @RequestParam(name = "publisher",required = false) String publisher,
                                                                                               @RequestParam(name = "author",required = false) String author,
                                                                           @RequestParam(name = "name",required = false) String name){
        List<BookDto> allAvailableBooksDtoAsList =new ArrayList<>();
        List<AddBookResponse> allAvaliableBooksAsResponseList=new ArrayList<>();
        AvailableBookDetailsResponse response = new AvailableBookDetailsResponse();
        if (page!=0 && limit!=0 && publisher==null&& author==null&&name==null){
            allAvailableBooksDtoAsList = service.getAllAvailableBooks(page,limit);
        }
        else if (publisher!=null&& (author==null&&name==null)) {
            allAvailableBooksDtoAsList= service.searchBooksByPublisher(publisher);
        }
        else if (author!=null&& (publisher==null&&name==null)) {
            allAvailableBooksDtoAsList= service.searchBooksByAuthor(author);
        }
        else if (name!=null&& (author==null&&publisher==null)) {
            allAvailableBooksDtoAsList= service.searchBooksByName( name);
        }
        else if (publisher!=null&&author!=null && name==null) {
            allAvailableBooksDtoAsList= service.searchBooksByPublisherAndAuthor( publisher,author);
        }
        else if (name!=null&&author!=null && publisher==null) {
            allAvailableBooksDtoAsList= service.searchBooksByAuthorAndName(author,name) ;
        }
        else if (publisher!=null&&name!=null && author==null) {
            allAvailableBooksDtoAsList= service.searchBooksByPublisherAndName(name,publisher);
        }
        else if (publisher!=null&&name!=null && author!=null) {
            allAvailableBooksDtoAsList= service.searchBooksByPublisherNameAndAuthorAndPublisher( name,author,publisher);
        }
        for (BookDto dto:allAvailableBooksDtoAsList) {
            AddBookResponse addBookResponse=mapper.map(dto,AddBookResponse.class);
            allAvaliableBooksAsResponseList.add(addBookResponse);
        }
        if (allAvaliableBooksAsResponseList.size()!=0)
               response.setBooks(allAvaliableBooksAsResponseList);
       // else
         //   return  ResponseEntity.notFound().build();
        return ResponseEntity.ok(response);
    }
    @PutMapping(value = "/books/book")
    public ResponseEntity<UpdatedBookDetailsResponse> updateBookName(@RequestParam(name = "id") String id,
                                                                     @RequestParam(name = "name" ,required = false) String name,
                                                                     @RequestParam(name = "publisher",required = false) String publisher,
                                                                     @RequestParam(name = "author",required = false) String author){
        BookDto updatedbookDto=new BookDto();
        if ((name!=null)&&(id!=null)&&(publisher==null)&&(author==null)){
            updatedbookDto=service.updateBookByName(id,name);
       }
       else if ((publisher!=null)&&(name==null)&&(id!=null)&&(author==null)){
            updatedbookDto=service.updateBookByPublisher(id,publisher);
       }
       else if ((author!=null)&&(name==null)&&(publisher==null)&&(id!=null)){
            updatedbookDto = service.updateBookByAuthor(id,author);
       }

        UpdatedBookDetailsResponse response = mapper.map(updatedbookDto, UpdatedBookDetailsResponse.class);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping(value = "/books/book")
    public ResponseEntity deleteBook(@RequestParam("id") String id){
        service.deleteBook(id);
        return null;
    }
    @Autowired
    BookRepository repository;
    @GetMapping(value = "/books/search")
    public ResponseEntity searchBook(@RequestParam("author") String author,@RequestParam("name") String name){
        List<Book> search = repository.findAllByNameAndAuthor(author,name);
        System.out.println(search);
        return null;
    }
}
