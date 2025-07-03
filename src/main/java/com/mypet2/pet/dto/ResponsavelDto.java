package com.mypet2.pet.dto;

import com.mypet2.pet.modelo.Responsavel;

public class ResponsavelDto {
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    @Deprecated
    public ResponsavelDto() {
    }

    public ResponsavelDto(String nome, String email, String telefone, String cpf) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    
    }

    public Responsavel novoResponsavel() {
        return new Responsavel(0, nome, email, telefone, cpf);
    }

}
