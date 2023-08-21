import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setDuracaoEmMinutos(5);
        meuFilme.setNome("Guardiões da Galáxia");
        meuFilme.setAnoDeLancamento(2022);;


        Filme outroFilme = new Filme();
        outroFilme.setDuracaoEmMinutos(5);
        outroFilme.setNome("Guardiões da Galáxia");
        outroFilme.setAnoDeLancamento(2022);;
        outroFilme.avalia(2);

        meuFilme.exibeFichaTecnica();

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(outroFilme);
        System.out.println(calculadoraDeTempo.getTempoTotal());
    }
}
