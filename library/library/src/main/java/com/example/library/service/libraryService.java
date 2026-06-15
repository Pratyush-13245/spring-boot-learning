package com.example.library.service;

import com.example.library.Entity.Books;
import com.example.library.Repository.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class libraryService {

    @Autowired
    private bookRepository bookRepository;

    public Books addBook(Books books){
        return bookRepository.save(books);
    }

    public Books updateBook(Long id, Books updatedBooks){
        Books existing = bookRepository.findById(id).orElseThrow();
        existing.setAuthor(updatedBooks.getAuthor());
        existing.setTitle(updatedBooks.getTitle());
        existing.setPrice(updatedBooks.getPrice());


        return bookRepository.save(existing);
    }

    public Books getBookById(long id){
        return bookRepository.findById(id).orElseThrow();
    }

    public List<Books> getAllBooks(){
        return bookRepository.findAll();
    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

}
