package com.sindeaux.autoconsulta.service

import com.sindeaux.autoconsulta.entity.Consulta
import com.sindeaux.autoconsulta.repository.ConsultaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.Exception
import javax.persistence.EntityNotFoundException

@Service
class ConsultaService {

    @Autowired
    private val consultaRepository: ConsultaRepository? = null

    fun salvarConsulta(consulta: Consulta) {
        consultaRepository!!.save(consulta)
    }


    fun buscarConsultas(): List<Consulta?> {
        return consultaRepository!!.findAll()
    }

    @Throws(Exception::class)
    fun buscarConsultaPorId(id: Long): Consulta {
        return consultaRepository!!.findById(id).orElseThrow { EntityNotFoundException() }!!
    }

    @Throws(Exception::class)
    fun buscarConsultasPorMedicoId(idMedico: Long): List<Consulta> {
        return consultaRepository!!.findAllByMedicoId(idMedico);
    }

    fun buscarConsultasPorLocalId(idLocal: Long): List<Consulta> {
        return consultaRepository!!.findAllByLocalId(idLocal);
    }

    fun buscarConsultasPoePaciente(idPaciente: Long): List<Consulta> {
        return consultaRepository!!.findAllByPacienteId(idPaciente);
    }

    fun deletarLocalPorId(id: Long?) {
        consultaRepository!!.deleteById(id!!)
    }

}