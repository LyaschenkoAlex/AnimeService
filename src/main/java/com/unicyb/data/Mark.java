package com.unicyb.data;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "mark")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mark {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "id_title")
    private int idTitle;
    @Column(name = "id_user")
    private int idUser;
    private double mark;
    private boolean isVisited;

    @Override
    public String toString() {
        return "idTitle - " + idTitle + "; idUser - " + idUser + ";mark - " + mark + "isVisited";
    }
}
