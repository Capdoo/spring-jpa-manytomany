package com.demo.springmanytomany.models.case1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "books")
@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String dateRelease;

    private String editorial;

    @ManyToMany(mappedBy = "books")
    Set<AuthorModel> authors;

}
