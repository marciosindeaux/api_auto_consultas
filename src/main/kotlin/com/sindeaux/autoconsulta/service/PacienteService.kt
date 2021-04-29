package com.sindeaux.autoconsulta.service

import com.sindeaux.autoconsulta.entity.Medico
import com.sindeaux.autoconsulta.entity.Paciente
import com.sindeaux.autoconsulta.repository.PacienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.Exception
import javax.persistence.EntityNotFoundException

@Service
class PacienteService {

    @Autowired
    private val pacienteRepository: PacienteRepository? = null

    fun salvarPaciente(paciente: Paciente) {
        pacienteRepository!!.save(paciente)
    }

    fun buscarPacientes(): List<Paciente?> {
        return pacienteRepository!!.findAll()
    }

    @Throws(Exception::class)
    fun buscarPacientePorId(id: Long): Paciente {
        return pacienteRepository!!.findById(id).orElseThrow { EntityNotFoundException() }!!
    }

    fun deletarPacientePorId(id: Long?) {
        pacienteRepository!!.deleteById(id!!)
    }

    fun deletarPaciente(paciente: Paciente) {
        deletarPacientePorId(paciente.id)
    }

}