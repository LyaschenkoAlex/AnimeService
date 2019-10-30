package com.unicyb.data;

import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String birthday;

    @Override
    public String toString() {
        return "id - " + id + "; name - " + name + "; birthday - " + birthday;
    }
}
