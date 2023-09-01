package br.com.alura.screenmatch.modelos;    //forma de criar package de classe, escrevendo o nome do dominio e o nome da pasta ao contrário.

public class Filme extends Titulo {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}


