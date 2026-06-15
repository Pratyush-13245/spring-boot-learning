package com.example.library.Entity;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Data

public class Books {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    private String title;
	private String author;
    private String publisher;
    private double price;

}
