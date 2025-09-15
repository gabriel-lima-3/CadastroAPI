package dev.gway.CadastroAPI.Atividades;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/atividades")
public class AtividadesController {

    private final AtividadesRepository atividadesRepository;
    private AtividadesService atividadesService;

    public AtividadesController(AtividadesService atividadesService, AtividadesRepository atividadesRepository) {
        this.atividadesService = atividadesService;
        this.atividadesRepository = atividadesRepository;
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

    //Listar atividade por ID

    @GetMapping("/listar/{id}")
    public AtividadesModel listarAtividadesPorId(@PathVariable long id ){
        return atividadesService.listarAtividade(id);

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
