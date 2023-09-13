package org.sindeaux.autoconsulta.interactors;

import jakarta.persistence.EntityNotFoundException;
import org.sindeaux.autoconsulta.controller.openapi.model.RequestCadastroConsulta;
import org.sindeaux.autoconsulta.entityes.Consulta;
import org.sindeaux.autoconsulta.entityes.Medico;
import org.sindeaux.autoconsulta.entityes.Paciente;
import org.sindeaux.autoconsulta.repositories.ConsultaRepository;
import org.sindeaux.autoconsulta.repositories.MedicoRepository;
import org.sindeaux.autoconsulta.repositories.PacienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsultaUseCase {
    private final ConsultaRepository consultaRepository;
    private final MedicoRepository medicoRepository;
    private final PacienteRepository pacienteRepository;

    public ConsultaUseCase(ConsultaRepository consultaRepository, MedicoRepository medicoRepository, PacienteRepository pacienteRepository) {
        this.consultaRepository = consultaRepository;
        this.medicoRepository = medicoRepository;
        this.pacienteRepository = pacienteRepository;
    }


    public Consulta criarConsulta(RequestCadastroConsulta requestCadastroConsulta){
        Medico medico = medicoRepository.findById(requestCadastroConsulta.getIdMedico()).orElseThrow(() -> new EntityNotFoundException("Não existe médico cadastrado com o Id informado"));
        Paciente paciente = pacienteRepository.findById(requestCadastroConsulta.getIdPaciente()).orElseThrow(() -> new EntityNotFoundException("Não existe paciente cadastrado com o Id informado"));
        Consulta consulta = new Consulta();
        consulta.setMedico(medico);
        consulta.setNotificarConsulta(true);
        consulta.setPaciente(paciente);
        consulta.setDataConsulta(requestCadastroConsulta.getDataHoraConsulta().toLocalDateTime());
        return consultaRepository.saveAndFlush(consulta);
    }

    public void marcarConsultaConcluida(Long idConsulta){
        Consulta consulta = consultaRepository.findById(idConsulta).orElseThrow(() -> new EntityNotFoundException("Não existe consulta cadastrada com o Id informado"));
        consulta.setConsultaConcluida(true);
        consulta.setConsultaExpirada(false);
        consulta.setNotificarConsulta(false);
        consultaRepository.saveAndFlush(consulta);
    }


}
