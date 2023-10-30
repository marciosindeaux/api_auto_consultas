package org.sindeaux.autoconsulta.transportlayers.impl;

import org.sindeaux.autoconsulta.controller.openapi.api.ConsultaApi;
import org.sindeaux.autoconsulta.controller.openapi.model.RequestCadastroConsulta;
import org.sindeaux.autoconsulta.controller.openapi.model.ResponseConsulta;
import org.sindeaux.autoconsulta.interactors.ConsultaUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class ConsultaApiImpl implements ConsultaApi {

    public final ConsultaUseCase consultaUseCase;

    public ConsultaApiImpl(ConsultaUseCase consultaUseCase) {
        this.consultaUseCase = consultaUseCase;
    }

    @Override
    public ResponseEntity<ResponseConsulta> buscarConsultaPorId(Integer id) {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> cadastrarConsultas( RequestCadastroConsulta requestCadastroConsulta){
        consultaUseCase.criarConsulta(requestCadastroConsulta);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<Void> deletarConsulta(Integer id){
        consultaUseCase.removerConsultaCadastrada(id.longValue());
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<Void> marcarConsultaConcluida(Integer id) {
        consultaUseCase.marcarConsultaConcluida(id.longValue());
        return ResponseEntity.ok().build();
    }
}
