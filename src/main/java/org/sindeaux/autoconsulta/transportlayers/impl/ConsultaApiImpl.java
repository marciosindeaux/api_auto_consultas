package org.sindeaux.autoconsulta.transportlayers.impl;

import org.sindeaux.autoconsulta.controller.openapi.api.ConsultaApi;
import org.sindeaux.autoconsulta.controller.openapi.model.RequestCadastroConsulta;
import org.sindeaux.autoconsulta.controller.openapi.model.ResponseConsulta;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class ConsultaApiImpl implements ConsultaApi {

    @Override
    public ResponseEntity<ResponseConsulta> buscarConsultaPorId(Integer id) {
        return ResponseEntity.ok(new ResponseConsulta());
    }

    @Override
    public ResponseEntity<Void> cadastrarConsultas( RequestCadastroConsulta requestCadastroConsulta){
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> deletarConsulta(Integer id){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<Void> marcarConsultaConcluida(Integer id) {
        return ResponseEntity.ok().build();
    }
}
