package com.example.graphqlexample.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqlexample.entity.Book;
import com.example.graphqlexample.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BookQuery implements GraphQLQueryResolver {

    private final BookService bookService;

    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }

    public Optional<Book> getBook(final int id) {
        return bookService.getBook(id);
    }
}
