package com.rasmoo.api.codeinbook.application.adapter.out;

import com.rasmoo.api.codeinbook.common.dto.AuthorDTO;
import com.rasmoo.api.codeinbook.domain.port.out.AuthorRepositoryPort;
import com.rasmoo.api.codeinbook.infrastructure.model.Author;
import com.rasmoo.api.codeinbook.infrastructure.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthorRepositoryAdapter implements AuthorRepositoryPort {

    private final AuthorRepository authorRepository;

    @Override
    public AuthorDTO create(AuthorDTO dto) {
        Author author = new Author();
        author.with(dto);
        return authorRepository.save(author).toDto();
    }
}
