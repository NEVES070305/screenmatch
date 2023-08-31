package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Lindo",2);
        Serie lost = new Serie("Lost",2022);
        var filmeDoGui=new Filme("Meu",2021);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoGui);
        lista.add(meuFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao()>2)
                System.out.println("Classificação"+filme.getClassificacao());

        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Gui");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Depois de ordenar");
        System.out.println(buscaPorArtista);
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
        /*
        * A linha de código que você mencionou utiliza o método `sort()` em uma instância de `ArrayList` (assumindo que `lista` é uma variável que faz referência a uma lista do tipo `ArrayList`). A razão pela qual essa linha funciona é que a classe `ArrayList` implementa a interface `List`, que inclui o método `sort()`. Portanto, você pode chamar o método `sort()` diretamente em uma lista do tipo `ArrayList`.

O método `sort()` pode ser usado para ordenar os elementos de uma lista em uma ordem específica. Nesse caso, você está usando um comparador personalizado definido com `Comparator.comparing(Titulo::getAnoDeLancamento)`. Isso indica que você deseja ordenar os elementos da lista com base no ano de lançamento dos objetos do tipo `Titulo`. O `Comparator.comparing` é uma forma de criar um comparador personalizado para especificar como os objetos devem ser comparados e ordenados.

Portanto, a linha de código que você forneceu é uma maneira válida e eficaz de classificar os elementos em uma lista do tipo `ArrayList` com base em um atributo específico dos objetos contidos nessa lista.*/

    }
}
