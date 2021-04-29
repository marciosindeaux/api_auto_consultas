package com.sindeaux.autoconsulta.repository

import com.sindeaux.autoconsulta.entity.Paciente
import org.springframework.data.jpa.repository.JpaRepository

interface PacienteRepository : JpaRepository<Paciente?, Long?>