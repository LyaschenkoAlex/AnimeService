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
    private double rating;
    private String icon;
    private String year;
    private String duration;
    private int episode;
    private String description;

    @Override
    public String toString() {
        return "id - " + id + "; name - " + name + "; studio - " + studio + "; author - " + author + "; genre - " + genre + "; rating - " + rating + "; year - " + year + "; duration - " + duration + "; episode - " + episode;
    }
}
