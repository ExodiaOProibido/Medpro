package com.medpro.medpro.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPaciente(
    @NotBlank String nome,
    @NotBlank String telefone,
    @NotBlank(message = "CPF é obrigatório")
    @Pattern(regexp = "\\d{11}", message = "CPF deve conter exatamente 11 dígitos") String cpf,
    @NotBlank(message = "Email é obrigatório")
    @NotBlank String email, 
    @NotNull@Valid DadosEndereco endereco) {
        
    }