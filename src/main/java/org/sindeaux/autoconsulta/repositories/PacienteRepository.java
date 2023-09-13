package org.sindeaux.autoconsulta.repositories;

import org.sindeaux.autoconsulta.entityes.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
