package dev.gway.CadastroAPI.Cursos;

import dev.gway.CadastroAPI.Ninjas.Controller.AlunosModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_atividades")
public class AtividadesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String titulo;
    private String status;


    @OneToMany(mappedBy = "atividades")
    private List<AlunosModel> alunos;



}
