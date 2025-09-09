package dev.gway.CadastroAPI.Atividades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.gway.CadastroAPI.Alunos.AlunosModel;
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

    // Uma atividade pode ter varios alunoos
    @OneToMany(mappedBy = "atividades")
    @JsonIgnore
    private List<AlunosModel> alunos;



}
