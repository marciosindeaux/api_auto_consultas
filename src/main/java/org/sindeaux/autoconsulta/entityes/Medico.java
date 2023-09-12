package org.sindeaux.autoconsulta.entityes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Medico extends Funcionario{

    @Column(name = "CRM_MEDICO")
    private String crm;

    @Column(name = "ESPECIALIZACAO")
    private String especializacao;

    @OneToMany(mappedBy = "medico", fetch = FetchType.LAZY)
    private List<Consulta> consultas;
}
