package com.sindeaux.autoconsulta.controller


import com.sindeaux.autoconsulta.entity.Local
import com.sindeaux.autoconsulta.service.LocalService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.lang.Exception

@RestController
@RequestMapping("/local")
class LocalController {

    @Autowired
    private val localService: LocalService? = null

    @GetMapping
    fun buscar(): ResponseEntity<*> {
        return try {
            ResponseEntity<Any?>(localService!!.buscarLocais(), HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable("id") id: Long?): ResponseEntity<*> {
        return try {
            ResponseEntity<Any?>(localService!!.buscarLocalPorId(id!!), HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @PostMapping
    fun cadastrar(@RequestBody local: Local): ResponseEntity<*> {
        return try {
            localService!!.salvarLocal(local!!)
            ResponseEntity<Any?>(null, HttpStatus.CREATED)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @PutMapping("/{id}")
    fun atualizarDados(@PathVariable("id") id: Long?,@RequestBody  local: Local): ResponseEntity<*> {
        return try {
            local.id = id
            localService!!.salvarLocal(local)
            ResponseEntity<Any?>(null, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @DeleteMapping("/{id}")
    fun remover(@PathVariable("id") id: Long?): ResponseEntity<*> {
        return try {
            localService!!.deletarLocalPorId(id)
            ResponseEntity<Any?>(null, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity<Any?>(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}