package com.sindeaux.autoconsulta.repository


import com.sindeaux.autoconsulta.entity.Consulta
import org.springframework.data.jpa.repository.JpaRepository

interface ConsultaRepository : JpaRepository<Consulta?, Long?> {

    fun findAllByMedicoId(medico: Long): List<Consulta>;

    fun findAllByPacienteId(idPaciente: Long): List<Consulta>;

    fun findAllByLocalId(idLocal: Long): List<Consulta>;
}