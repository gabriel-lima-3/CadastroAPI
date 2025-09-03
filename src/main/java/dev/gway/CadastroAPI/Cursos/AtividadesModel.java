package dev.gway.CadastroAPI.Cursos;

import dev.gway.CadastroAPI.Ninjas.Controller.AlunosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_atividades")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AtividadesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String titulo;
    private String status;


    @OneToMany(mappedBy = "atividades")
    private List<AlunosModel> alunos;



}
