package org.sindeaux.autoconsulta.repositories;

import org.sindeaux.autoconsulta.entityes.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
