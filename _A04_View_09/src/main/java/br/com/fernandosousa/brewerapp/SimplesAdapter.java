package br.com.fernandosousa.brewerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by fsousa on 12/03/2017.
 */

public class SimplesAdapter extends BaseAdapter {

    String[] listaCervejas = new String[] {"Duvel", "Murphys", "Sierra Nevada", "Paulaner"};

    Context context;

    public SimplesAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaCervejas.length;
    }

    @Override
    public Object getItem(int posicao) {
        return listaCervejas[posicao];
    }

    @Override
    public long getItemId(int posicao) {
        return posicao;
    }

    @Override
    public View getView(int posicao, View view, ViewGroup viewGroup) {
        String cerveja = listaCervejas[posicao];

        View viewText = LayoutInflater.from(context).inflate(R.layout.tela_inicial_itens, viewGroup, false);
        TextView t = (TextView)viewText.findViewById(R.id.textItemList);
        t.setText(cerveja);

        return viewText;
    }
}
