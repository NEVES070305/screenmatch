package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;
import br.com.alura.screenmatch.modelos.Titulo;

public class Filme extends Titulo implements Classificavel {
        private String diretor;

        public String getDiretor(){
            return diretor;
        }

        public void setDiretor(String diretor){
            this.diretor = diretor;
        }


    @Override
    public int getClassificacao() {
            return (int)pegaMedia()/2;
    }
}

