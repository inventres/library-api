package com.LibraryProject.repositories;

import com.LibraryProject.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BooksRepository extends JpaRepository<Books, Long> {

    @Modifying
    @Query("Select * from Books where Barcode LIKE '%?1%'")
    List<Books> findBooksByBarcode(String barcode);

    @Modifying
    @Query("Select * from Books where Name LIKE '%?1%'")
    List<Books> findBooksByName(String barcode);
}
