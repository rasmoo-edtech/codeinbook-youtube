package com.rasmoo.api.codeinbook.domain.service;

import com.rasmoo.api.codeinbook.common.dto.AuthorDTO;
import com.rasmoo.api.codeinbook.domain.port.out.AuthorRepositoryPort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AuthorServiceTest {

    @Mock
    private AuthorRepositoryPort authorRepositoryPort;

    @InjectMocks
    private AuthorService authorService;


    @Test
    void shouldCreateNewAuthor() {
        AuthorDTO authorDTO = new AuthorDTO(null,"Felipe Alves", "Engenheiro de computação");
        AuthorDTO authorDTOSaved = new AuthorDTO("12345","Felipe Alves", "Engenheiro de computação");
        when(authorRepositoryPort.create(authorDTO)).thenReturn(authorDTOSaved);
        Assertions.assertEquals(authorDTOSaved, authorService.create(authorDTO));
        verify(authorRepositoryPort, times(1)).create(authorDTO);
    }

}
