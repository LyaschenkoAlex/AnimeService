package com.unicyb.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "title")
@Getter
@Setter
public class Title {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String studio;
    private String author;
    private String genre;

    @Override
    public String toString() {
        return "id - " + id + "; name - " + name + "; studio - " + studio + "; author - " + author + ";genre - " + genre;
    }
}
