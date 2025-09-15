package dev.gway.CadastroAPI.Alunos;


import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

    private AlunosService alunosService;

    public AlunosController(AlunosService alunosService) {
       this.alunosService = alunosService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa e minha primeira mensagem nessa rota";
    }

    //CRUD ---------------------------------------

    // Adicionar Aluno (Create)
    @PostMapping("/criar")
    public AlunosModel criarAluno(@RequestBody AlunosModel alunos) {
        return alunosService.criarAluno(alunos);
    }

    //Mostrar todos os Alunos (READ)
    @GetMapping("/listar")
    public List<AlunosModel> listarAlunos() {
        return alunosService.listarAlunos();
    }

    //Procurar Aluno por id (READ)
    @GetMapping("/listar/{id}")
    public AlunosModel listarAlunoPorId(@PathVariable long id) {
        return alunosService.listarAlunoPorId(id);
    }

    //Alterar dado dos Alunos (Update)
    @PutMapping("/alterar/{id}")
    public AlunosModel alterarAlunoPorId(@PathVariable long id, @RequestBody AlunosModel alunoAtualizado) {
        return alunosService.UpdateAlunoPorId(id, alunoAtualizado);
    }

    //Deletar Aluno (Delete)
    @DeleteMapping("/deletar/{id}")
    public void deletarAlunosPorId(@PathVariable long id ) {
       alunosService.deletarAlunoPorId(id);
    }
}
