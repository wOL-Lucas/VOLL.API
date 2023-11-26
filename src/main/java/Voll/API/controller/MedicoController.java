package Voll.API.controller;

import Voll.API.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medico")
public class MedicoController {


    @PostMapping
    public String cadastrar(@RequestBody DadosCadastroMedico dados) {
        System.out.println(dados.toString());
        return "{\"status\":\"ok\"}";
    }

}
