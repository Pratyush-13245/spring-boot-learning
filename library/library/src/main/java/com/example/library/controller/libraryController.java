package com.example.library.controller;


import com.example.library.Entity.Books;
import com.example.library.service.libraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class libraryController {
    @Autowired
    private libraryService libraryService;

    @PostMapping("/addBooks")
    public Books addBook(@RequestBody Books books){
        return libraryService.addBook(books);
    }

    @GetMapping
    public List<Books> getAllBooks(){
        return libraryService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Books getBookById(@PathVariable Long id){
        return libraryService.getBookById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        libraryService.deleteBook(id);
    }

    @PutMapping("/{id}")
    public Books updateBook(@PathVariable Long Id, @RequestBody Books books){
        return libraryService.updateBook(Id, books);
    }







}
