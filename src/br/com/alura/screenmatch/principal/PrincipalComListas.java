package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

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

        lista.add(meuFilme);    // add é uma função da Collection de ArrayList.
        lista.add(outroFilme);
        lista.add(filme03);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2 ) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        // Lista criada para aprender a comparar strings

       List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Raphael");
        buscaPorArtista.add("Maiara");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);  // função do java.util que coloca em ordem alfabética as string da lista.
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de Titulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);

    }
}
