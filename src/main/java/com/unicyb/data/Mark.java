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
    @Column(name = "mark_first")
    private double markFirst;
    @Column(name = "mark_second")
    private double markSecond;
    @Column(name = "mark_third")
    private double markThird;
    private boolean isVisited;

    public Mark(int idTitle, int idUser, double markFirst, double markSecond, double markThird) {
        this.idTitle = idTitle;
        this.idUser = idUser;
        this.markFirst = markFirst;
        this.markSecond = markSecond;
        this.markThird = markThird;
    }

    @Override
    public String toString() {
        return idUser + " " + idTitle + " " + markFirst + " " + markSecond + " " + markThird + "\n";
    }


}
