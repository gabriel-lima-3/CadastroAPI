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
    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;
    private String curso;

    // Muitos para um (uma atividade para varios alunos)
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key OU chave estrangeira
    private AtividadesModel atividades;

}
