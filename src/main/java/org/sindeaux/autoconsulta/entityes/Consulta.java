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

    @Column(name = "B_CONSULTA_CONCLUIDA")
    private boolean consultaConcluida;

    @Column(name = "B_CONSULTA_EXPIRADA")
    private boolean consultaExpirada;

    @Column(name = "B_NOTIFICACAO_CONSULTA")
    private boolean notificarConsulta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "ID_PACIENTE")
    private Paciente paciente;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn( name ="ID_MEDICO" )
    private Medico medico;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public boolean isConsultaConcluida() {
        return consultaConcluida;
    }

    public void setConsultaConcluida(boolean consultaConcluida) {
        this.consultaConcluida = consultaConcluida;
    }

    public boolean isConsultaExpirada() {
        return consultaExpirada;
    }

    public void setConsultaExpirada(boolean consultaExpirada) {
        this.consultaExpirada = consultaExpirada;
    }

    public boolean isNotificarConsulta() {
        return notificarConsulta;
    }

    public void setNotificarConsulta(boolean notificarConsulta) {
        this.notificarConsulta = notificarConsulta;
    }
}
