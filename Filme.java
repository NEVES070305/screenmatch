public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano = true;
    double somaDasAvaliacoes = 0;
    int totalDeAvaliacoes = 1;

    void exibeFichaTecnica(){
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
    void avalia(double avaliacao){
        if (totalDeAvaliacoes !=1)
            totalDeAvaliacoes +=1;
        somaDasAvaliacoes += avaliacao;
    }
    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
