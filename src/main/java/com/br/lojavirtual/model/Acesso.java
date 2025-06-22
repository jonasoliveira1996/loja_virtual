package com.br.lojavirtual.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serial;

@Entity
@Table(name = "acesso")
@Getter
@Setter
public class Acesso implements GrantedAuthority {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String descricao; /*Acesso ex: ROLE_ADMIN ou ROLE_SECRETARIO*/
    @Override
    public String getAuthority() {
        return this.descricao;
    }
}
