package dev.gway.CadastroAPI.Atividades;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atividades")
public class AtividadesController {

    private AtividadesService atividadesService;

    public AtividadesController(AtividadesService atividadesService) {
        this.atividadesService = atividadesService;
    }
    //Crud

    @PostMapping("/criar")
    public AtividadesModel criarAtividade(@RequestBody AtividadesModel atividades){
        return atividadesService.criarAtividade(atividades);

    }

    //Listar todas as atividades

    @GetMapping("/listar")
    public List<AtividadesModel> listarAtividades(){
        return atividadesService.listarAtividades();
    }

    // TODO: Alterar dados
    // TODO: Alterar dados
    // TODO: Alterar dados

    //Deletar atividade por id
    @DeleteMapping("/deletar/{id}")
    public void deletarAtividade(@PathVariable long id){
        atividadesService.deletarAtividadePorId(id);
    }

}
