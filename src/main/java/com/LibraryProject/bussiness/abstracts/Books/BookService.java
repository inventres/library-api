package com.LibraryProject.bussiness.abstracts.Books;

import com.LibraryProject.entities.Books;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService {

    List<Books> getBooks();

    List<Books> searchByName(String BookName);

    List<Books> searchByBarcode(String Barcode);

    Long save(Books book);

    Optional<Books> getById(Long id);

    Books update(Books book);

    Boolean delete(Books book);

}