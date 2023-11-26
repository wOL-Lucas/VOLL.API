package Voll.API.controller;


import Voll.API.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {


    @PostMapping
    public String cadastrar(@RequestBody DadosCadastroPaciente dados){
        System.out.println(dados.toString());
        return "Ok";
    }

}
