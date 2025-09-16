package dev.gway.CadastroAPI.Atividades;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/atividades")
public class AtividadesController {

    private final AtividadesService atividadesService;

    public AtividadesController(AtividadesService atividadesService) {
        this.atividadesService = atividadesService;
    }

    // Criar nova atividade
    @PostMapping("/criar")
    public AtividadesDTO criarAtividade(@RequestBody AtividadesDTO atividadesDTO) {
        return atividadesService.criarAtividade(atividadesDTO);
    }

    // Listar todas as atividades
    @GetMapping("/listar")
    public List<AtividadesDTO> listarAtividades() {
        return atividadesService.listarAtividades();
    }

    // Listar atividade por ID
    @GetMapping("/listar/{id}")
    public AtividadesDTO listarAtividadePorId(@PathVariable long id) {
        return atividadesService.listarAtividade(id);
    }

    // TODO: Alterar dados de atividade
    // @PutMapping("/alterar/{id}")
    // public AtividadesDTO alterarAtividade(@PathVariable long id, @RequestBody AtividadesDTO atividadesDTO) { ... }

    // Deletar atividade por ID
    @DeleteMapping("/deletar/{id}")
    public void deletarAtividade(@PathVariable long id) {
        atividadesService.deletarAtividadePorId(id);
    }
}
