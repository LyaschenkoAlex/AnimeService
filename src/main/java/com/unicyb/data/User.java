package com.unicyb.data;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

@Entity
@Table(name = "user")
@Getter
@Setter
@Data
public class User implements UserDetails {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String birthday;
    @Column(name = "id_suggestion")
    private int idSuggestion;
    @Column(name = "type_of_preference")
    private String typeOfPreference;
    @Column(name = "registration_date")
    private String registrationDate;
    private String password;
    @Override
    public String toString() {
        return "id - " + id + "; name - " + name + "; birthday - " + birthday;
    }

    public User(String name, String birthday, int idSuggestion, String typeOfPreference, String registrationDate, String password) {
        this.name = name;
        this.birthday = birthday;
        this.idSuggestion = idSuggestion;
        this.typeOfPreference = typeOfPreference;
        this.registrationDate = registrationDate;
        this.password = password;
    }

    public User(String name, String birthday, String password) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        this.name = name;
        this.birthday = birthday;
        this.password = password;
        this.registrationDate = formatter.format(date);
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
