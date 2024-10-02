package com.rasmoo.api.codeinbook.domain.port.in;

import com.rasmoo.api.codeinbook.common.dto.AuthorDTO;

public interface AuthorServicePort {

    AuthorDTO create(AuthorDTO dto);
}
