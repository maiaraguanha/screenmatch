package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Interestelar", 2014);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Tubarão", 1993);
        meuFilme.avalia(6);
        Filme filme03 = new Filme("Madagascar", 2000);
        meuFilme.avalia(10);

        Serie lost = new Serie("Lost", 2000);


        // Criando um Array de Filmes e Series

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filme03);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() >2 ){
                System.out.println("Classificação: " + filme.getClassificacao());
            }


        }
    }
}
