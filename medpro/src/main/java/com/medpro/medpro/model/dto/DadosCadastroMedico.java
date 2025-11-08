package com.medpro.medpro.model.dto;

import com.medpro.medpro.enums.Especialidade;

public record DadosCadastroMedico(String nome, String email, String telefone, String crm, Especialidade especialidade, DadosEndereco endereco) {
    
}
