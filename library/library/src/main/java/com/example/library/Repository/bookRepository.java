package com.example.library.Repository;

import com.example.library.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRepository extends JpaRepository<Books,Long> {
}
