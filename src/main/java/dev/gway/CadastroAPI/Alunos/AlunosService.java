package dev.gway.CadastroAPI.Alunos;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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






}
