package br.com.treinaweb.ediaristas.web.mappers;

import br.com.treinaweb.ediaristas.core.models.Servico;
import br.com.treinaweb.ediaristas.web.dto.ServicoDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-28T16:54:16-0300",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20221012-0724, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
@Component
public class WebServicoMapperImpl implements WebServicoMapper {

    @Override
    public Servico toModel(ServicoDTO dto) {

        if ( dto == null ) {
            
            return null;
        }

        Servico servico = new Servico();

        servico.setHorasBanheiro( dto.getHorasBanheiro() );
        servico.setHorasCozinha( dto.getHorasCozinha() );
        servico.setHorasOutros( dto.getHorasOutros() );
        servico.setHorasQuarto( dto.getHorasQuarto() );
        servico.setHorasQuintal( dto.getHorasQuintal() );
        servico.setHorasSala( dto.getHorasSala() );
        servico.setIcone( dto.getIcone() );
        servico.setNome( dto.getNome() );
        servico.setPorcentagemComissao( dto.getPorcentagemComissao() );
        servico.setPosicao( dto.getPosicao() );
        servico.setQtdHoras( dto.getQtdHoras() );
        servico.setValorBanheiro( dto.getValorBanheiro() );
        servico.setValorCozinha( dto.getValorCozinha() );
        servico.setValorMinimo( dto.getValorMinimo() );
        servico.setValorOutros( dto.getValorOutros() );
        servico.setValorQuarto( dto.getValorQuarto() );
        servico.setValorQuintal( dto.getValorQuintal() );
        servico.setValorSala( dto.getValorSala() );

        return servico;
    }

    @Override
    public ServicoDTO toDTO(Servico model) {
        if ( model == null ) {
            return null;
        }

        ServicoDTO servicoDTO = new ServicoDTO();

        servicoDTO.setHorasBanheiro( model.getHorasBanheiro() );
        servicoDTO.setHorasCozinha( model.getHorasCozinha() );
        servicoDTO.setHorasOutros( model.getHorasOutros() );
        servicoDTO.setHorasQuarto( model.getHorasQuarto() );
        servicoDTO.setHorasQuintal( model.getHorasQuintal() );
        servicoDTO.setHorasSala( model.getHorasSala() );
        servicoDTO.setIcone( model.getIcone() );
        servicoDTO.setNome( model.getNome() );
        servicoDTO.setPorcentagemComissao( model.getPorcentagemComissao() );
        servicoDTO.setPosicao( model.getPosicao() );
        servicoDTO.setQtdHoras( model.getQtdHoras() );
        servicoDTO.setValorBanheiro( model.getValorBanheiro() );
        servicoDTO.setValorCozinha( model.getValorCozinha() );
        servicoDTO.setValorMinimo( model.getValorMinimo() );
        servicoDTO.setValorOutros( model.getValorOutros() );
        servicoDTO.setValorQuarto( model.getValorQuarto() );
        servicoDTO.setValorQuintal( model.getValorQuintal() );
        servicoDTO.setValorSala( model.getValorSala() );

        return servicoDTO;
    }
}
