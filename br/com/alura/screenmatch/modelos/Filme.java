package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.modelos.Titulo;

public class Filme extends Titulo {
        private String diretor;

        public String getDiretor(){
            return diretor;
        }

        public void setDiretor(String diretor){
            this.diretor = diretor;
        }


}
