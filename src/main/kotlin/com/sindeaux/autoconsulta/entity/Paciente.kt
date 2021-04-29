package com.sindeaux.autoconsulta.entity

import Pessoa
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.OneToMany

@Entity
class Paciente : Pessoa() {

    @Column(name = "NUM_CARTAO")
    open var numCartao: String? = null

    @OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY)
    open var consultas: List<Consulta>? = null;
}