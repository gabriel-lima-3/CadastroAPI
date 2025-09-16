package dev.gway.CadastroAPI.Atividades;


import org.springframework.stereotype.Component;

@Component
public class AtividadesMapper {


    public AtividadesModel map(AtividadesDTO dto){

        AtividadesModel atividadesModel = new AtividadesModel();

        atividadesModel.setId(dto.getId());
        atividadesModel.setTitulo(dto.getTitulo());
        atividadesModel.setStatus(dto.getStatus());

        return atividadesModel;
    }


    public AtividadesDTO map(AtividadesModel atividadesModel){


        AtividadesDTO atividadesDTO = new AtividadesDTO();

        atividadesDTO.setId(atividadesModel.getId());
        atividadesDTO.setTitulo(atividadesModel.getTitulo());
        atividadesDTO.setStatus(atividadesModel.getStatus());

        return atividadesDTO;

    }


}
