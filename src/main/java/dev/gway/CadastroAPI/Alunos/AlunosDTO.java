package dev.gway.CadastroAPI.Alunos;
import dev.gway.CadastroAPI.Atividades.AtividadesModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunosDTO {

    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String curso;
    private String imagemUrl;
    private AtividadesModel atividades;

    private String semestre;





}
