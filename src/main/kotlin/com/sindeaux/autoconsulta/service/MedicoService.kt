package com.sindeaux.autoconsulta.service


import org.springframework.beans.factory.annotation.Autowired
import com.sindeaux.autoconsulta.repository.MedicoRepository
import com.sindeaux.autoconsulta.entity.Medico
import org.springframework.stereotype.Service
import java.lang.Exception
import kotlin.Throws
import javax.persistence.EntityNotFoundException

@Service
class MedicoService {

    @Autowired
    private val medicoRepository: MedicoRepository? = null

    fun salvarMedico(medico: Medico) {
        medicoRepository!!.save(medico)
    }

    fun buscarMedicos(): List<Medico?> {
        return medicoRepository!!.findAll()
    }

    @Throws(Exception::class)
    fun buscarMedicoPorId(id: Long): Medico {
        return medicoRepository!!.findById(id).orElseThrow { EntityNotFoundException() }!!
    }

    fun buscarMedicoPorCRM(crm: String?): Medico {
        return medicoRepository!!.findByCrmEquals(crm)!!.orElseThrow { EntityNotFoundException() }!!
    }

    fun deletarMedicoPorId(id: Long?) {
        medicoRepository!!.deleteById(id!!)
    }

    fun deletarMedico(medico: Medico) {
        deletarMedicoPorId(medico.id)
    }
}