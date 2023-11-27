package Voll.API.paciente;

import Voll.API.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@EqualsAndHashCode(of="id")
@Getter @AllArgsConstructor @NoArgsConstructor
public class Paciente {
    @Id @GeneratedValue private Long id;
    private String nome;
    private String email;
    private String Telefone;
    private String CPF;

    @Embedded
    private Endereco endereco;
}
