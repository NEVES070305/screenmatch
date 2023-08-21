package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano = true;
    private double somaDasAvaliacoes = 0;
    private int totalDeAvaliacoes = 1;

    public void exibeFichaTecnica(){
        String inclusoNoPlano = incluidoNoPlano ? "Incluso" : "Não incluso";
        double media = pegaMedia();
        String fichaTecnica = String.format("""
                Nome: %s
                Ano de lançamento: %d
                Duração em minutos: %d
                Incluido no plano: %s
                Avaliação média: %.2f""", nome,anoDeLancamento,duracaoEmMinutos,inclusoNoPlano,media);
        System.out.println(fichaTecnica);
    }
    public void avalia(double avaliacao){
        if (totalDeAvaliacoes !=1)
            totalDeAvaliacoes +=1;
        somaDasAvaliacoes += avaliacao;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }


    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
