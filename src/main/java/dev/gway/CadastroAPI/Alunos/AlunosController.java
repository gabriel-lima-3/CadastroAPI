package dev.gway.CadastroAPI.Alunos;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa e minha primeira mensagem nessa rota";
    }

    //CRUD ---------------------------------------

    // Adicionar Aluno (Create)
    @PostMapping("/adicionar")
    public String criarAluno() {
        return "Ninja criado";
    }

    //Mostrar todos os Alunos (READ)
    @GetMapping("/listar")
    public String mostrarTodosAlunos() {
        return "Mostrar todos os alunos";
    }

    //Procurar Aluno por id (READ)
    @GetMapping("/listarId")
    public String mostrarAlunosPorId() {
        return "Mostrar  alunos por id";
    }

    //Alterar dado dos Alunos (Update)
    @PutMapping("/alterar")
    public String alterarAlunoPorId() {
        return "Alterar  alunos por id";
    }

    //Deletar Aluno (Delete)
    @DeleteMapping("/deletarId")
    public String deletarAlunosPorId() {
        return "Retornar aluno deletado por id";
    }
}
