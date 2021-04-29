package com.sindeaux.autoconsulta.entity

import Pessoa
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.OneToMany

@Entity
class Medico : Pessoa() {
    @Column(name = "CRM_MEDICO")
    open var crm: String? = null

    @Column(name = "ESPECIALIZACAO")
    open var especializcao: String? = null

    @OneToMany(mappedBy = "medico", fetch = FetchType.LAZY)
    open var consultas: List<Consulta>? = null;

}