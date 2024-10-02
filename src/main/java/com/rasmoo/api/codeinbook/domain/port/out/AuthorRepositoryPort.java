package com.rasmoo.api.codeinbook.domain.port.out;

import com.rasmoo.api.codeinbook.common.dto.AuthorDTO;

public interface AuthorRepositoryPort {

    AuthorDTO create(AuthorDTO dto);

}
