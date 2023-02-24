package com.demo.springmanytomany.models.case1;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "authors")
public class AuthorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String country;

    @ManyToMany
    @JoinTable( name = "authors_books", joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<BookModel> books;


}
