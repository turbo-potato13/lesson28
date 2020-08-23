package com.vtb.api;

import com.vtb.api.bookstore.Book;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.vtb.api.bookstore.Genre.FANTASY;

@Component
public class BookRepository {
    private static final Map<Long, Book> books = new HashMap<>();

    @PostConstruct
    public void initData(){
        Book harryPotter = new Book();
        harryPotter.setId(1L);
        harryPotter.setTitle("HarryPotter");
        harryPotter.setPrice(220);
        harryPotter.setGenre(FANTASY);
        books.put(harryPotter.getId(), harryPotter);

        Book hobbit = new Book();
        hobbit.setId(2L);
        hobbit.setTitle("Hobbit");
        hobbit.setPrice(420);
        hobbit.setGenre(FANTASY);
        books.put(hobbit.getId(), hobbit);
    }

    public Book findById(Long id){
        Assert.notNull(id, "The book's id not be null");
        return books.get(id);
    }

    public List<Book> findAll(){
        return new ArrayList<>(books.values());
    }
}
