package dev.gway.CadastroAPI.Ninjas.Controller;

//Entity transforma uma classe em enitidade no banco de dados

import dev.gway.CadastroAPI.Cursos.AtividadesModel;
import jakarta.persistence.*;

import java.util.List;

// JPA = jarkarta persistence API

@Entity
@Table(name = "tb_cadastro")

public class AlunosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String curso;


    // MUITO PARA UM (uma atividade para varios alunos)
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key OU chave estrangeira
    private AtividadesModel atividades;


    public AlunosModel() {

    }

    public AlunosModel(Long id, String nome, String email, int idade, String curso) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.curso = curso;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


}
