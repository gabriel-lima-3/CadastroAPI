package dev.gway.CadastroAPI.Alunos;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunosService {

    private AlunosMapper alunosMapper;
    private final AlunosRepository alunosRepository;
    private AlunosRepository AlunoRepository;

    public AlunosService(AlunosRepository alunosRepository, AlunosRepository alunoRepository) {
        this.alunosRepository = alunosRepository;
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

    public AlunosDTO criarAluno(AlunosDTO alunosDTO){
        AlunosModel alunos = new AlunosMapper().map(alunosDTO);
        alunos = alunosRepository.save(alunos);
        return alunosMapper.map(alunos);
    }

    //Atualizar dados do Aluno por Id

    public AlunosModel UpdateAlunoPorId(long id, AlunosModel alunoAtualizado) {

        if (alunosRepository.existsById(id)) {
            alunoAtualizado.setId(id);
            return alunosRepository.save(alunoAtualizado);
         }
        else{
            return null;
        }
    }
    //Deletar Aluno por Id  // Tem que ser um metodo void (Nao precisa retornar nada)

    public void deletarAlunoPorId(long id){
        alunosRepository.deleteById(id);
    }

}
