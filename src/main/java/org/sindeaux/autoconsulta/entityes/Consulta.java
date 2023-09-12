package org.sindeaux.autoconsulta.entityes;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_CONSULTA")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CONSULTA")
    private Long id;

    @Column( name = "DTA_CONSULTA")
    private LocalDateTime dataConsulta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "ID_PACIENTE")
    private Paciente paciente;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn( name ="ID_MEDICO" )
    private Medico medico;

}
