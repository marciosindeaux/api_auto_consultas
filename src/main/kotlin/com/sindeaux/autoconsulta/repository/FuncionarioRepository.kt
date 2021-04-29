package com.sindeaux.autoconsulta.repository

import com.sindeaux.autoconsulta.entity.Funcionario
import org.springframework.data.jpa.repository.JpaRepository

interface FuncionarioRepository : JpaRepository<Funcionario?, Long?>