package dev.gway.CadastroAPI.Alunos;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunosService {

    private AlunosRepository AlunoRepository;

    public AlunosService(AlunosRepository alunoRepository) {
        AlunoRepository = alunoRepository;
    }

    //Listar todos os meus alunos
    public List<AlunosModel> listarAlunos(){
        return AlunoRepository.findAll();
    }

    public AlunosModel listarAlunoPorId(long id){
       Optional<AlunosModel> alunoPorId = AlunoRepository.findById(id);
       return alunoPorId.orElse(null);

    }

    public AlunosModel criarAluno(AlunosModel alunos){
        return AlunoRepository.save(alunos);

    }






}
