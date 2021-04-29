package com.sindeaux.autoconsulta.service

import com.sindeaux.autoconsulta.entity.Local
import com.sindeaux.autoconsulta.repository.LocalRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.Exception
import javax.persistence.EntityNotFoundException

@Service
class LocalService {

    @Autowired
    private val localRepository: LocalRepository? = null

    fun salvarLocal(local: Local) {
        localRepository!!.save(local)
    }

    fun buscarLocais(): List<Local?> {
        return localRepository!!.findAll()
    }

    @Throws(Exception::class)
    fun buscarLocalPorId(id: Long): Local {
        return localRepository!!.findById(id).orElseThrow { EntityNotFoundException() }!!
    }

    fun deletarLocalPorId(id: Long?) {
        localRepository!!.deleteById(id!!)
    }
}