package com.mypet2.pet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypet2.pet.dto.ResponsavelDto;
import com.mypet2.pet.modelo.Responsavel;

@RestController//Trasforma a nossa classe em um controller antigamente chamado de bean
@RequestMapping(value = "/responsavel") //Mapeando a url, navegador chama pelo valor (value)
public class ResponsavelController {

    @GetMapping( value = "/imprimir")//Mapeamento do método imprimir. Usando o verbo Get => (Pegar ou buscar)
    public void imprimir() { //void => (não retorna nada)
        System.out.println("chamou o método imprimir");
    }

    @GetMapping( value = "/ola")
    public String ola() { //Adicionado retorno como String (Tipo-texto)//Não quer dizer HTML
        return"<h1>Ythalo<h1>"; //return -> Devolve o retorno para quem chamou

    }
    @GetMapping (value ="/insert")
    public String insert(ResponsavelDto responsavelDto) {
        Responsavel responsavel = responsavelDto.novoResponsavel();
        System.out.println(responsavel.toString());


        return"<h1>tentando salvar os responsáveis dos pets<h2>";
    }
    

}
