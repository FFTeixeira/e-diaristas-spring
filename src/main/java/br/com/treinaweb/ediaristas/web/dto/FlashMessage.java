package br.com.treinaweb.ediaristas.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlashMessage {
    
    private String classeCSS;

    private String mensagem;
}