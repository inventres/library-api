package com.LibraryProject.bussiness.concretes.Books;

import com.LibraryProject.bussiness.abstracts.Books.BookService;
import com.LibraryProject.entities.Books;
import com.LibraryProject.repositories.BooksRepository;
import com.LibraryProject.utils.Error_Messages;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookServiceImpl implements BookService {

    private final BooksRepository booksRepository;

    public BookServiceImpl(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public List<Books> getBooks() {
        return booksRepository.findAll();
    }

    @Override
    public List<Books> searchByName(String BookName) {
        return booksRepository.findBooksByName(BookName);
    }

    @Override
    public List<Books> searchByBarcode(String Barcode) {
        return booksRepository.findBooksByBarcode(Barcode);
    }

    @Override
    public Long save(Books book) {
        Books savedBook = booksRepository.save(book);
        return savedBook.getId();
    }

    @Override
    public Optional<Books> getById(Long id) {
        return booksRepository.findById(id);
    }

    @Override
    public Books update(Books book) {
        if (book.getId() == null || book.getId() < 0)
            throw new IllegalArgumentException(Error_Messages.ERROR_1.getErrorMessage());

        Books updated = booksRepository.save(book);
        return updated;
    }

    @Override
    public Boolean delete(Books book) {
        if (book.getId() == null || book.getId() < 0)
            throw new IllegalArgumentException(Error_Messages.ERROR_1.getErrorMessage());

        try {
            booksRepository.delete(book);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}
