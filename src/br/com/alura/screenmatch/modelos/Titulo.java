package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{

    // Atributos da classe

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;   // private modificador de acesso, não deixa eu ler nem acessar.
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    // Construtor

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }


    // Métodos da classe br.com.alura.screenmatch.modelos.Filme

    public int getTotalDeAvaliacoes(){     // get: recupera/ busca valor; método para exibir um acesso private eu uso o get e retorno o valor.
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {      // set: define valor; ideal para validação
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){       // apenas exibe algo

        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);

    }

    public void avalia(double nota){

        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;

    }


    public double pegaMedia(){

        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


    // Método compareTo, para comparar os titulos para por em ordem alfabética.

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
