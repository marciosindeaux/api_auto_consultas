package com.sindeaux.autoconsulta.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "TB_CONSULTA")
class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CONSULTA")
    open var id : Long? = null;

    @Column( name = "DTA_CONSULTA")
    open var data: LocalDateTime? = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "ID_PACIENTE")
    open var paciente: Paciente? = null;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn( name ="ID_MEDICO" )
    open var medico: Medico? = null;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn( name = "ID_LOCAL")
    open var local: Local? = null ;

}