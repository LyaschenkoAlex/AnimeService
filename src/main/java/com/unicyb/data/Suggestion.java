package com.unicyb.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "suggestion")
@Getter
@Setter
public class Suggestion {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "id_user")
    private int idUser;
    @Column(name = "suggestion_list")
    private String suggestionList;
    private String date;
    @Column(name = "success_rate")
    private double successRate;
    @Column(name = "algorithm_used")
    private String algorithmUsed;

    @Override
    public String toString() {
        return super.toString();
    }
}
