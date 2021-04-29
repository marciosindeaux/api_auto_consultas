package com.sindeaux.autoconsulta.repository

import com.sindeaux.autoconsulta.entity.Medico
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface MedicoRepository : JpaRepository<Medico?, Long?> {
    fun findByCrmEquals(crm: String?): Optional<Medico?>?
}