package com.LibraryProject.bussiness.concretes;

import com.LibraryProject.bussiness.abstracts.AuthorService;
import com.LibraryProject.entities.Authors;
import com.LibraryProject.repositories.AuthorRepository;
import org.hibernate.mapping.Filterable;

import java.util.Map;
import java.util.List;
import java.util.Optional;


public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Authors> getAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Long save(Authors authors) {
         return  authorRepository.save(authors).getAuthor_id();
    }

    @Override
    public Optional<Authors> getById(Long id) {
        return authorRepository.findById(id);
    }

    @Override
    public Authors update(Authors author) {
        return authorRepository.save(author);
    }

    @Override
    public void delete(Authors author) {
        authorRepository.delete(author);
    }
}
