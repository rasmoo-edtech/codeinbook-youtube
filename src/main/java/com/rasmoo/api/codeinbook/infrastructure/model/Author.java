package com.rasmoo.api.codeinbook.infrastructure.model;


import com.rasmoo.api.codeinbook.common.dto.AuthorDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Optional;

@Document("documents")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    private String id;

    @Indexed
    private String fullName;

    private String resume;

    public void with(AuthorDTO dto) {
        this.id = Optional.ofNullable(dto.id()).orElse(id);
        this.fullName = Optional.ofNullable(dto.fullName()).orElse(fullName);
        this.resume = Optional.ofNullable(dto.resume()).orElse(resume);
    }


    public AuthorDTO toDto() {
        return new AuthorDTO(id, fullName, resume);
    }
}
