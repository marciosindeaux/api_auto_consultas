package com.sindeaux.autoconsulta.entity

import javax.persistence.*

@Entity
@Table(name= "TB_LOCAL")
class Local {

    @Id
    @Column(name = "ID_LOCAL")
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id: Long? = null;

    @Column(name="CEP")
    open var cep: Long? = null;

    @Column(name="CIDADE")
    open var cidade : String? = null;

    @Column(name="ESTADO")
    open var estado : String? = null;

    @Column( name = "NOME_CLINICA" )
    open var nomeClinica : String? = null;

    @OneToMany(mappedBy = "local", fetch = FetchType.LAZY)
    open var consultas: List<Consulta>? = null;
}