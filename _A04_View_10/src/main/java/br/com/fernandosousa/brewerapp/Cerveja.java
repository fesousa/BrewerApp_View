package br.com.fernandosousa.brewerapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fsousa on 18/03/2017.
 */

public class Cerveja {

    public String nome;
    public int imagem;

    public Cerveja(String nome, int imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }

    public static List<Cerveja> getCervejas(){
        List<Cerveja> cervejas = new ArrayList<Cerveja>();
        cervejas.add(new Cerveja("Duvel", R.drawable.duvel));
        cervejas.add(new Cerveja("Murphys", R.drawable.murphys));
        cervejas.add(new Cerveja("Sierra Nevada", R.drawable.sierra_nevada));
        cervejas.add(new Cerveja("Paulaner", R.drawable.paulaner));

        return cervejas;
    }
}
