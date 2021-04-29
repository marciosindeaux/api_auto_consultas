package com.sindeaux.autoconsulta.controller

import com.sindeaux.autoconsulta.entity.Medico
import com.sindeaux.autoconsulta.service.MedicoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.lang.Exception

@RestController
@RequestMapping("/medico")
class MedicoController {

    @Autowired
    private val medicoService: MedicoService? = null

    @GetMapping
    fun buscar(): ResponseEntity<*> {
        return try {
            ResponseEntity<Any?>(medicoService!!.buscarMedicos(), HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable("id") id: Long?): ResponseEntity<*> {
        return try {
            ResponseEntity<Any?>(medicoService!!.buscarMedicoPorId(id!!), HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/crm/{crm}")
    fun buscarPorCRM(@PathVariable("crm") crm: String?): ResponseEntity<*> {
        return try {
            ResponseEntity<Any?>(medicoService!!.buscarMedicoPorCRM(crm), HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @PostMapping
    fun cadastrar(@RequestBody medico: Medico?): ResponseEntity<*> {
        return try {
            medicoService!!.salvarMedico(medico!!)
            ResponseEntity<Any?>(null, HttpStatus.CREATED)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @PutMapping("/{id}")
    fun atualizarDados(@PathVariable("id") id: Long?, @RequestBody medico: Medico): ResponseEntity<*> {
        return try {
            medico.id = id
            medicoService!!.salvarMedico(medico)
            ResponseEntity<Any?>(null, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @DeleteMapping("/{id}")
    fun remover(@PathVariable("id") id: Long?): ResponseEntity<*> {
        return try {
            medicoService!!.deletarMedicoPorId(id)
            ResponseEntity<Any?>(null, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}