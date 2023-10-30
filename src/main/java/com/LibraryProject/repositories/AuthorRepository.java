package com.LibraryProject.repositories;

import com.LibraryProject.entities.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Authors, Long> {

}
