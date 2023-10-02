package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // Filme 1

        Filme meuFilme = new Filme("Interestelar", 2014);

        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média do avaliações: " + meuFilme.pegaMedia());


        // Serie 1

        Serie lost = new Serie("Lost", 2000);

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        lost.exibeFichaTecnica();

        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());


        //Filme 2

        Filme outroFilme = new Filme("Tubarão", 1993);

        outroFilme.setDuracaoEmMinutos(200);


        // Calculadora de tempo de duração

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());


        // Filtro de recomendação de filme

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(meuFilme);


        // Adicionando Episodio na serie

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        // Filme 3

        Filme filme03 = new Filme("Madagascar", 2000);

        filme03.setDuracaoEmMinutos(200);
        filme03.avalia(10);


        // Criando um Array de Filmes

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(meuFilme);
        listaDeFilme.add(outroFilme);
        listaDeFilme.add(filme03);

        System.out.println("Tamanho da Lista: " + listaDeFilme.size()); // tamanho da lista ou array
        System.out.println("Primeiro filme: " + listaDeFilme.get(0).getNome()); // get é a posição na lista a ser exibida
        System.out.println(listaDeFilme);
        System.out.println("toString do filme: " + listaDeFilme.get(0).toString());

    }
}
