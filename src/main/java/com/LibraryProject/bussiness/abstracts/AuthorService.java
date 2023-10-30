package com.LibraryProject.bussiness.abstracts;
import com.LibraryProject.entities.Authors;
import org.hibernate.mapping.Filterable;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    List<Authors> getAuthors();

    Long save(Authors authors);

    Optional<Authors> getById(Long id);

    Authors update(Authors author);

    void delete(Authors author);

}
