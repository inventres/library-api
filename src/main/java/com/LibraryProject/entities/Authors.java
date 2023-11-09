package com.LibraryProject.entities;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "authors")
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long author_id;
    private String name;
    private String biography;
    private Date dob;

    public Long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "author_id=" + author_id +
                ", name='" + name + '\'' +
                ", biography='" + biography + '\'' +
                ", dob=" + dob +
                '}';
    }


}
