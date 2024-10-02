package com.rasmoo.api.codeinbook.domain.service;

import com.rasmoo.api.codeinbook.common.dto.AuthorDTO;
import com.rasmoo.api.codeinbook.domain.port.in.AuthorServicePort;
import com.rasmoo.api.codeinbook.domain.port.out.AuthorRepositoryPort;

public class AuthorService implements AuthorServicePort {

    private final AuthorRepositoryPort authorRepositoryPort;

    public AuthorService(AuthorRepositoryPort authorRepositoryPort) {
        this.authorRepositoryPort = authorRepositoryPort;
    }

    @Override
    public AuthorDTO create(AuthorDTO dto) {
        return authorRepositoryPort.create(dto);
    }

}
