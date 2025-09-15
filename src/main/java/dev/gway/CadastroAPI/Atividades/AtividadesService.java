package dev.gway.CadastroAPI.Atividades;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@Service
public class AtividadesService {

    private AtividadesRepository atividadesRepository;

    public AtividadesService(AtividadesRepository atividadesRepository) {
        this.atividadesRepository = atividadesRepository;
    }

    // Listar todas as atividades
    public List<AtividadesModel> listarAtividades(){
        return atividadesRepository.findAll();
    }


    //Listar Atividade por Id
    public AtividadesModel listarAtividade(long id ){

        Optional<AtividadesModel> atividadesPorId = atividadesRepository.findById(id);
        return atividadesPorId.orElse(null);
    }

    //Criar Nova atividade
    public AtividadesModel  criarAtividade(AtividadesModel atividades){
        return atividadesRepository.save(atividades);
    }

    public void deletarAtividadePorId(long id){
        atividadesRepository.deleteById(id);
    }








}
