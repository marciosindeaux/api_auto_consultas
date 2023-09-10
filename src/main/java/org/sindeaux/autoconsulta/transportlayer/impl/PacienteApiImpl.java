package org.sindeaux.autoconsulta.transportlayer.impl;

import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.sindeaux.autoconsulta.controller.openapi.api.PacientesApi;
import org.sindeaux.autoconsulta.controller.openapi.model.RequestCadastroPaciente;
import org.sindeaux.autoconsulta.controller.openapi.model.ResponsePaciente;
import org.sindeaux.autoconsulta.controller.openapi.model.ResponsePacientes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PacienteApiImpl implements PacientesApi {

    @Override
    public ResponseEntity<ResponsePaciente> alterarPaciente(Integer id, RequestCadastroPaciente requestCadastroPaciente) {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<ResponsePaciente> bucarPaciente(Integer id) {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<ResponsePacientes> buscarPacientes(){
        return ResponseEntity.internalServerError().build();
    }

    @Override
    public ResponseEntity<Void> cadastrarPaciente(RequestCadastroPaciente requestCadastroPaciente) {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<Void> deletarPaciente(Integer id){
        return ResponseEntity.ok().build();
    }
}
