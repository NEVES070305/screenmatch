public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.anoDeLancamento = 2022;
        meuFilme.nome = "Guardiões da Galáxia";

        meuFilme.avalia(2);

        meuFilme.exibeFichaTecnica();
    }
}
