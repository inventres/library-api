package com.LibraryProject.repositories;

import com.LibraryProject.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BooksRepository extends JpaRepository<Books, Long> {
    @Query(value = "select * from books where barcode LIKE %?1%", nativeQuery = true)
    List<Books> findBooksByBarcode(String barcode);

//    @Modifying
//    @Query("Select * from Books where Name LIKE '%?1%'")
//    List<Books> findBooksByName(String barcode);
}
