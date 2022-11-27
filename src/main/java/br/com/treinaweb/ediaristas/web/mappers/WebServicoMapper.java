package br.com.treinaweb.ediaristas.web.mappers;

import org.springframework.stereotype.Component;

import br.com.treinaweb.ediaristas.core.models.Servico;
import br.com.treinaweb.ediaristas.web.dto.ServicoDTO;

@Component
public class WebServicoMapper {
    
    public Servico toModel(ServicoDTO dto) {

        if (dto == null) {

            throw new IllegalArgumentException();
        }

        var model = new Servico();
        
        model.setNome(dto.getNome());
        model.setValorMinimo(dto.getValorMinimo());
        model.setQtdHoras(dto.getQtdHoras());
        model.setPorcentagemComissao(dto.getPorcentagemComissao());
        model.setHorasQuarto(dto.getHorasQuarto());
        model.setValorQuarto(dto.getValorQuarto());
        model.setHorasSala(dto.getHorasSala());
        model.setValorSala(dto.getValorSala());
        model.setHorasBanheiro(dto.getHorasBanheiro());
        model.setValorBanheiro(dto.getValorBanheiro());
        model.setHorasCozinha(dto.getHorasCozinha());
        model.setValorCozinha(dto.getValorCozinha());
        model.setHorasQuintal(dto.getHorasQuintal());
        model.setValorQuintal(dto.getValorQuintal());
        model.setHorasOutros(dto.getHorasOutros());
        model.setValorOutros(dto.getValorOutros());
        model.setIcone(dto.getIcone());
        model.setPosicao(dto.getPosicao());

        return model;
    }

    public ServicoDTO toDTO(Servico model) {

        if (model == null) {

            throw new IllegalArgumentException();
        }

        var dto = new ServicoDTO();
        
        dto.setNome(model.getNome());
        dto.setValorMinimo(model.getValorMinimo());
        dto.setQtdHoras(model.getQtdHoras());
        dto.setPorcentagemComissao(model.getPorcentagemComissao());
        dto.setHorasQuarto(model.getHorasQuarto());
        dto.setValorQuarto(model.getValorQuarto());
        dto.setHorasSala(model.getHorasSala());
        dto.setValorSala(model.getValorSala());
        dto.setHorasBanheiro(model.getHorasBanheiro());
        dto.setValorBanheiro(model.getValorBanheiro());
        dto.setHorasCozinha(model.getHorasCozinha());
        dto.setValorCozinha(model.getValorCozinha());
        dto.setHorasQuintal(model.getHorasQuintal());
        dto.setValorQuintal(model.getValorQuintal());
        dto.setHorasOutros(model.getHorasOutros());
        dto.setValorOutros(model.getValorOutros());
        dto.setIcone(model.getIcone());
        dto.setPosicao(model.getPosicao());

        return dto;
    }
}