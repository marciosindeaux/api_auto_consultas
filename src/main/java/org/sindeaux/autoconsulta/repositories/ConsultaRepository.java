package org.sindeaux.autoconsulta.repositories;

import org.sindeaux.autoconsulta.entityes.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    public List<Consulta> findAlByMedicoId(Long id);

    public List<Consulta> findAllByPacienteId(Long id);
}
