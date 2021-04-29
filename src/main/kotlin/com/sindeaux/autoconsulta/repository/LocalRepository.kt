package com.sindeaux.autoconsulta.repository

import com.sindeaux.autoconsulta.entity.Local
import org.springframework.data.jpa.repository.JpaRepository

interface LocalRepository : JpaRepository<Local?, Long?>