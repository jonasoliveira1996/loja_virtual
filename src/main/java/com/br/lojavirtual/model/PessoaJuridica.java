package com.br.lojavirtual.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Entity
@Table(name = "pessoa_juridica")
@Getter
@Setter
public class PessoaJuridica extends Pessoa{

    @Serial
    private static final long serialVersionUID = 1L;

    private String cnpj;
    private String inscEstadual;
    private String inscMunicipal;
    private String nomeFantasia;
    private String razaoSocial;
    private String categoria;
}
