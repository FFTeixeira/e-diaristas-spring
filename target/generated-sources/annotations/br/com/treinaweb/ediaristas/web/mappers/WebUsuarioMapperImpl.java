package br.com.treinaweb.ediaristas.web.mappers;

import br.com.treinaweb.ediaristas.core.models.Usuario;
import br.com.treinaweb.ediaristas.web.dto.UsuarioDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-28T16:50:26-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.17 (Ubuntu)"
)
@Component
public class WebUsuarioMapperImpl implements WebUsuarioMapper {

    @Override
    public Usuario toModel(UsuarioDTO dto) {

        if ( dto == null ) {
            
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setNomeCompleto( dto.getNomeCompleto() );
        usuario.setEmail( dto.getEmail() );
        usuario.setSenha( dto.getSenha() );

        return usuario;
    }
}
