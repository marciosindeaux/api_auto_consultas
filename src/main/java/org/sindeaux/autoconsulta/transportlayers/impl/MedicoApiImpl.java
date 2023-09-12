package org.sindeaux.autoconsulta.transportlayers.impl;

import org.sindeaux.autoconsulta.controller.openapi.api.MedicosApi;
import org.sindeaux.autoconsulta.controller.openapi.model.RequestCadastroMedico;
import org.sindeaux.autoconsulta.controller.openapi.model.ResponseMedico;
import org.sindeaux.autoconsulta.controller.openapi.model.ResponseMedicos;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MedicoApiImpl implements MedicosApi {

    @Override
    public ResponseEntity<ResponseMedico> alterarMedico(Integer id, RequestCadastroMedico requestCadastroMedico) {
        return ResponseEntity.ok(new ResponseMedico());
    }

    @Override
    public ResponseEntity<ResponseMedico> buscarMedico(Integer id) {
        return ResponseEntity.ok(new ResponseMedico());
    }

    @Override
    public ResponseEntity<ResponseMedicos> buscarMedicos() {
        return ResponseEntity.ok(new ResponseMedicos());
    }

    @Override
    public ResponseEntity<Void> cadastrarMedico(RequestCadastroMedico requestCadastroMedico) {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> deletarMedico(Integer id) {
        return ResponseEntity.ok().build();
    }

}
