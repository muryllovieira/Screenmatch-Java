package br.com.senai.screenmatch.calculos;

import br.com.senai.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
