package com.example.graphqlexample.service;

import com.example.graphqlexample.entity.Book;
import com.example.graphqlexample.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public Book createBook(
            final String name,
            final String genre,
            final String author
    ) {
        final Book book = new Book();
        book.setName(name);
        book.setGenre(genre);
        book.setAuthor(author);
        return bookRepository.save(book);
    }

    @Transactional(readOnly = true)
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Book> getBook(final int id) {
        return bookRepository.findById(id);
    }
}
