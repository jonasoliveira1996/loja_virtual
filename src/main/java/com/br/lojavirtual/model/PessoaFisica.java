package com.br.lojavirtual.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.util.Date;

@Entity
@Table(name = "pessoa_fisica")
@Getter
@Setter
public class PessoaFisica extends  Pessoa{

    @Serial
    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private String cpf;
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
}
