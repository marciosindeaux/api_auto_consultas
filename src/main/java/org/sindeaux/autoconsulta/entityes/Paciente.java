package org.sindeaux.autoconsulta.entityes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Paciente extends Pessoa{
    @Column(name = "NUM_CARTAO")
    private String numeroConvenio;

    @OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY)
    private List<Consulta> consultas;
}
