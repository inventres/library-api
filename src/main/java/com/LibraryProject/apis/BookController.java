package com.LibraryProject.apis;


import com.LibraryProject.bussiness.concretes.BookServiceImpl;
import com.LibraryProject.entities.Books;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    private final BookServiceImpl bookService;

    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/getbooks")
    public List<Books> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/searchBook")
    public List<Books> searchBook(@RequestBody String barcode)
    {
        List<Books> booksList = bookService.findBooksByBarcode(barcode);
        return bookService.findBooksByBarcode(barcode);
    }

    @GetMapping("/searchBook2")
    public List<Books> searchBook2(@RequestParam("barcode") String barcode)
    {
        return bookService.findBooksByBarcode(barcode);
    }

    @PostMapping("/addbook")
    public ResponseEntity<Long> saveBook(@RequestBody Books book){
        return ResponseEntity.ok(bookService.save(book));
    }

    @PutMapping("/updatebook")
    public ResponseEntity<Books> updateBook(@RequestBody Books book){
        return ResponseEntity.ok(bookService.update(book));
    }

    @DeleteMapping("/deletebook")
    public ResponseEntity<Boolean> deleteBook(@RequestBody Books book){
        return ResponseEntity.ok(bookService.delete(book));
    }

}
