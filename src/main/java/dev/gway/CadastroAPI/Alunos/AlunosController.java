package dev.gway.CadastroAPI.Alunos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AlunosController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa e minha primeira mensagem nessa rota";
    }


}
