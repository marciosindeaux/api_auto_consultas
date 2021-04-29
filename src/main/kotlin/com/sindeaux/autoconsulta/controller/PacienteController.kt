package com.sindeaux.autoconsulta.controller


import com.sindeaux.autoconsulta.entity.Paciente
import com.sindeaux.autoconsulta.service.PacienteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.lang.Exception

@RestController
@RequestMapping("/paciente")
class PacienteController {
    @Autowired
    private val pacienteService: PacienteService? = null

    @GetMapping
    fun buscar(): ResponseEntity<*> {
        return try {
            ResponseEntity<Any?>(pacienteService!!.buscarPacientes(), HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable("id") id: Long?): ResponseEntity<*> {
        return try {
            ResponseEntity<Any?>(pacienteService!!.buscarPacientePorId(id!!), HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @PostMapping
    fun cadastrar(@RequestBody paciente: Paciente?): ResponseEntity<*> {
        return try {
            pacienteService!!.salvarPaciente(paciente!!)
            ResponseEntity<Any?>(null, HttpStatus.CREATED)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @PutMapping("/{id}")
    fun atualizarDados(@PathVariable("id") id: Long?, @RequestBody paciente: Paciente): ResponseEntity<*> {
        return try {
            paciente.id = id
            pacienteService!!.salvarPaciente(paciente)
            ResponseEntity<Any?>(null, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @DeleteMapping("/{id}")
    fun remover(@PathVariable("id") id: Long?): ResponseEntity<*> {
        return try {
            pacienteService!!.deletarPacientePorId(id)
            ResponseEntity<Any?>(null, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @DeleteMapping
    fun removerObjeto(@RequestBody paciente: Paciente): ResponseEntity<*> {
        return try {
            pacienteService!!.deletarPaciente(paciente)
            ResponseEntity<Any?>(null, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}