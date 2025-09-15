package dev.gway.CadastroAPI.Alunos;

import org.springframework.stereotype.Component;

@Component
public class AlunosMapper {

    public AlunosModel map (AlunosDTO alunosDTO) {

        AlunosModel alunosModel = new AlunosModel();

        alunosModel.setId(alunosDTO.getId());
        alunosModel.setNome(alunosDTO.getNome());
        alunosModel.setEmail(alunosDTO.getEmail());
        alunosModel.setIdade(alunosDTO.getIdade());
        alunosModel.setCurso(alunosDTO.getCurso());
        alunosModel.setImagemUrl(alunosDTO.getImagemUrl());
        alunosModel.setSemestre(alunosDTO.getSemestre());
        alunosModel.setAtividades(alunosDTO.getAtividades());

        return alunosModel;

    }

    public AlunosDTO map(AlunosModel alunosModel) {

        AlunosDTO alunosDTO = new AlunosDTO();

        alunosDTO.setId(alunosModel.getId());
        alunosDTO.setNome(alunosModel.getNome());
        alunosDTO.setEmail(alunosModel.getEmail());
        alunosDTO.setIdade(alunosModel.getIdade());
        alunosDTO.setCurso(alunosModel.getCurso());
        alunosDTO.setImagemUrl(alunosModel.getImagemUrl());
        alunosDTO.setSemestre(alunosModel.getSemestre());
        alunosDTO.setAtividades(alunosModel.getAtividades());

        return alunosDTO;
    }

}
