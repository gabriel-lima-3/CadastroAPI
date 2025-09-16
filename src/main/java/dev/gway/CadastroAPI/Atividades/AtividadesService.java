package dev.gway.CadastroAPI.Atividades;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AtividadesService {

    private final AtividadesMapper atividadesMapper;
    private final AtividadesRepository atividadesRepository;

    @Autowired
    public AtividadesService(AtividadesRepository atividadesRepository, AtividadesMapper atividadesMapper) {
        this.atividadesRepository = atividadesRepository;
        this.atividadesMapper = atividadesMapper;
    }

    // Listar todas as atividades (DTO)
    public List<AtividadesDTO> listarAtividades() {
        List<AtividadesModel> atividades = atividadesRepository.findAll();
        return atividades.stream()
                .map(atividadesMapper::map) // Model -> DTO
                .collect(Collectors.toList());
    }

    // Listar atividade por Id (DTO)
    public AtividadesDTO listarAtividade(long id) {
        Optional<AtividadesModel> atividadesPorId = atividadesRepository.findById(id);
        return atividadesPorId.map(atividadesMapper::map).orElse(null);
    }

    // Criar nova atividade
    public AtividadesDTO criarAtividade(AtividadesDTO atividadesDTO) {
        AtividadesModel model = atividadesMapper.map(atividadesDTO); // DTO -> Model
        AtividadesModel salvo = atividadesRepository.save(model);    // salvar no banco
        return atividadesMapper.map(salvo);                           // Model -> DTO
    }

    // Deletar atividade por Id
    public void deletarAtividadePorId(long id) {
        atividadesRepository.deleteById(id);
    }
}
