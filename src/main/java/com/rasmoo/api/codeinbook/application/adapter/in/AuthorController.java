package com.rasmoo.api.codeinbook.application.adapter.in;


import com.rasmoo.api.codeinbook.common.dto.AuthorDTO;
import com.rasmoo.api.codeinbook.domain.port.in.AuthorServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorServicePort authorServicePort;

    @PostMapping
    public ResponseEntity<AuthorDTO> create(@RequestBody AuthorDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(authorServicePort.create(dto));
    }

}
