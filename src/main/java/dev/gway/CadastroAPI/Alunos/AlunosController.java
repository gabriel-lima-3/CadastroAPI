package dev.gway.CadastroAPI.Alunos;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
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
    public ResponseEntity<String> criarAluno(@RequestBody AlunosDTO alunos) {

        AlunosDTO alunosDTO = alunosService.criarAluno(alunos);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Aluno criado com sucesso " + alunosDTO.getNome() + " Id: " + alunosDTO.getId());
    }

    //Mostrar todos os Alunos (READ)
    @GetMapping("/listar")
    public ResponseEntity<List<AlunosDTO>> listarAlunos() {
        List<AlunosDTO> alunos = alunosService.listarAlunos();
        return ResponseEntity.ok(alunos);
    }

    //Procurar Aluno por id (READ)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarAlunoPorId(@PathVariable long id) {

        AlunosDTO alunos = alunosService.listarAlunoPorId(id);

        if (alunos != null) {
             return ResponseEntity.ok(alunos) ;
        }else{
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aluno com o id: " + id + " Nao encontrado");

        }
    }

    //Alterar dado dos Alunos (Update)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarAlunoPorId(@PathVariable Long id, @RequestBody AlunosDTO alunoAtualizado) {

        AlunosDTO alunoDTO = alunosService.UpdateAlunoPorId(id, alunoAtualizado); // método correto no service

        if (alunoDTO != null) {
            return ResponseEntity.ok(alunoDTO);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Aluno com o id: " + id + " não encontrado");
        }
    }

    //Deletar Aluno (Delete)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarAlunosPorId(@PathVariable long id) {
        if (alunosService.listarAlunoPorId(id) == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Aluno com ID " + id + " não encontrado");
        } else {
            alunosService.deletarAlunoPorId(id);
            return ResponseEntity.ok("Aluno com ID " + id + " deletado com sucesso");
        }
    }

}
