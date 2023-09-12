package org.sindeaux.autoconsulta.entityes;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "TB_PESSOA")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PESSOA")
    private Long id;

    @Column(name = "TELEFONE_PESSOA")
    private String telefone;

    @Column(name = "IDADE_PESSOA")
    private LocalDate dataNascimento;

    @Column(name = "CPF_PESSOA")
    private String cpf;

    @Column(name = "NOME_PESSOA")
    private String nome;
}
