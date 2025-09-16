package dev.gway.CadastroAPI.Atividades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtividadesDTO {

    private long id;
    private String titulo;
    private String status;


}
