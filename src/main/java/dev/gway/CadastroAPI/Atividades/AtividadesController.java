package dev.gway.CadastroAPI.Atividades;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("atividades")
public class AtividadesController {

// Get - Mandar requisição para mostrar as atividades
    @GetMapping("/listar")
    public String listar(){
        return "Ativades listada com sucesso";
    }


// Post - Mandar uma requisição para criar atividades
    @PostMapping("/criar")
    public String criarAtividade(){

        return "Atividade criada com sucesso";
    }
// Put - Mandar requisição  para alterar a Atividade
    @PutMapping("/alterar")
    public String alterarAtividade(){
        return "Atividade alterada com sucesso";
    }

// Delete - Mandar requisição para deletar as Atividades
    @DeleteMapping("/deletar")
    public String deletarAtividade(){
        return "Atividade deletada com sucesso";
    }




}
