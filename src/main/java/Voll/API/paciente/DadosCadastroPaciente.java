package Voll.API.paciente;

import Voll.API.endereco.Endereco;

public record DadosCadastroPaciente(String nome, String email, String CPF, Endereco endereco) {}
