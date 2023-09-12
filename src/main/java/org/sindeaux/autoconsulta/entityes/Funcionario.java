package org.sindeaux.autoconsulta.entityes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Funcionario extends Pessoa{

    @Column(name = "MATRICULA")
    private String matricula;
}
