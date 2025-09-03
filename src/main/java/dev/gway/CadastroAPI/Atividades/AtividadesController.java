package dev.gway.CadastroAPI.Atividades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AtividadesController {

    @GetMapping("/missaoDoDia")
    public String missoesDoDia(){
        return "A missoes de hoje";
    }


}
