package dev.gway.CadastroAPI.Alunos;

//Entity transforma uma classe em enitidade no banco de dados

import dev.gway.CadastroAPI.Atividades.AtividadesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// JPA = jarkarta persistence API

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class AlunosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int idade;

    @Column(name = "curso")
    private String curso;

    @Column(name = "imagem_url")
    private String imagemUrl;

    @Column(name = "semestre")
    private String semestre;

    // Muitos para um (uma atividade para varios alunos)
    @ManyToOne
    @JoinColumn(name = "Atividades_id") // Foreing Key OU chave estrangeira
    private AtividadesModel atividades;



}
