package com.nationallibrary.booksCatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.convert.support.GenericConversionService;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class BooksCatalogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksCatalogApplication.class, args);
    }

}
