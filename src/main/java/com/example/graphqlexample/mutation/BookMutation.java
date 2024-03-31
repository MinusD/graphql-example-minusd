package com.example.graphqlexample.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphqlexample.entity.Book;
import com.example.graphqlexample.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookMutation implements GraphQLMutationResolver {

    private final BookService bookService;
    public Book createBook(
            final String name,
            final String genre,
            final String author
    ) {
        return this.bookService.createBook(
                name,
                genre,
                author
        );
    }
}
