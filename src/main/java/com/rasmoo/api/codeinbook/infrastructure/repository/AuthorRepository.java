package com.rasmoo.api.codeinbook.infrastructure.repository;

import com.rasmoo.api.codeinbook.infrastructure.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends MongoRepository<Author, String> {
}
