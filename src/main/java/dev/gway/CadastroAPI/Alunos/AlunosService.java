package dev.gway.CadastroAPI.Alunos;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AlunosService {

    private final AlunosMapper alunosMapper;
    private final AlunosRepository alunosRepository;

    @Autowired
    public AlunosService(AlunosRepository alunosRepository, AlunosMapper alunosMapper) {
        this.alunosRepository = alunosRepository;
        this.alunosMapper = alunosMapper;
    }

    // Listar todos os alunos
    public List<AlunosDTO> listarAlunos() {
        List<AlunosModel> alunos = alunosRepository.findAll();
        return alunos.stream()
                .map(alunosMapper::map)
                .collect(Collectors.toList());
    }

    // Listar aluno por id
    public AlunosDTO listarAlunoPorId(long id){
        Optional<AlunosModel> alunoPorId = alunosRepository.findById(id);
        return alunoPorId.map(alunosMapper::map).orElse(null);
    }

    // Criar novo aluno
    public AlunosDTO criarAluno(AlunosDTO alunosDTO){
        AlunosModel aluno = alunosMapper.map(alunosDTO);
        aluno = alunosRepository.save(aluno);
        return alunosMapper.map(aluno);
    }

    // Atualizar aluno por id
    public AlunosDTO UpdateAlunoPorId(long id, AlunosDTO alunosDTO) {
        Optional<AlunosModel> alunoExistente = alunosRepository.findById(id);
        if(alunoExistente.isPresent()){
            AlunosModel alunoAtualizado = alunosMapper.map(alunosDTO);
            alunoAtualizado.setId(id);
            AlunosModel alunoSalvo = alunosRepository.save(alunoAtualizado);
            return alunosMapper.map(alunoSalvo);
        } else {
            return null;
        }
    }

    // Deletar aluno por id
    public void deletarAlunoPorId(long id){
        alunosRepository.deleteById(id);
    }
}
