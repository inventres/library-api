package com.LibraryProject.apis;
import com.LibraryProject.bussiness.concretes.AuthorServiceImpl;
import com.LibraryProject.entities.Authors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/v1/author")
public class AuthorController {

    private final AuthorServiceImpl authorService;

    public AuthorController(AuthorServiceImpl authorService){
        this.authorService = authorService;
    }

    @RequestMapping("getAuthors")
    public ResponseEntity<List<Authors>> getAuthors(){
        return ResponseEntity.ok(authorService.getAuthors());
    }

    @GetMapping("getAuthor")
    public ResponseEntity<Optional<Authors>> getAuthor(@RequestParam("authorId") Long authorId){
        return ResponseEntity.ok(authorService.getById(authorId));
    }

    @PostMapping("addAuthor")
    public ResponseEntity<Long> addAuthor(@RequestBody Authors author){
        return ResponseEntity.ok(authorService.save(author));
    }


    @DeleteMapping("deleteAuthor")
    public ResponseEntity<Boolean> deleteAuthor(@RequestBody Authors author){
        authorService.delete(author);
        return  ResponseEntity.ok(true);
    }

    @PutMapping
    public ResponseEntity<Authors> updateAuthor(@RequestBody Authors author){
        return ResponseEntity.ok(authorService.update(author));
    }

}
