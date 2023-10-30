package com.LibraryProject.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long pages;
    private String type;
    private Double unit_price;
    private String information_of_book;
    private Date dob;
    private Integer author_id;

    private String Barcode;

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    public String getInformation_of_book() {
        return information_of_book;
    }

    public void setInformation_of_book(String information_of_book) {
        this.information_of_book = information_of_book;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @OneToMany
    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", type='" + type + '\'' +
                ", unit_price=" + unit_price +
                ", information_of_book='" + information_of_book + '\'' +
                ", dob=" + dob +
                ", Barcode='" + Barcode + '\'' +
                '}';
    }
}
