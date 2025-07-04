package com.mypet2.pet.controller;

import java.net.URI;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jersey.JerseyProperties.Servlet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriBuilder;

import com.mypet2.pet.dto.ResponsavelDto;
import com.mypet2.pet.modelo.Responsavel;
import com.mypet2.pet.repository.ResponsavelRepository;

@RestController // Trasforma a nossa classe em um controller antigamente chamado de bean
@RequestMapping(value = "/responsavel") // Mapeando a url, navegador chama pelo valor (value)
public class ResponsavelController {

    @Autowired
    private ResponsavelRepository responsavelRepository;

    @GetMapping(value = "/imprimir") // Mapeamento do método imprimir. Usando o verbo Get => (Pegar ou buscar)
    public void imprimir() { // void => (não retorna nada)
        System.out.println("chamou o método imprimir");
    }

    @GetMapping(value = "/ola")
    public String ola() { // Adicionado retorno como String (Tipo-texto)//Não quer dizer HTML
        return "<h1>Ythalo<h1>"; // return -> Devolve o retorno para quem chamou

    }

    @PostMapping(value = "/insert")
    public ResponseEntity<?> insert(@RequestBody ResponsavelDto responsavelDto) {

        Responsavel responsavel = responsavelDto.novoResponsavel();
        responsavelRepository.save(responsavel);
        
        System.out.println(responsavel.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                            .path("/id")
                            .buildAndExpand(responsavel.getId())
                            .toUri();


        return ResponseEntity.created(uri).body(responsavel);
    }

}
