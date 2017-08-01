package br.com.fernandosousa.brewerapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by fsousa on 12/03/2017.
 */

public class SimplesAdapter extends BaseAdapter {

    String[] listaCervejas = new String[] {"Duvel", "Murphys", "Sierra Nevada", "BockBier"};

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
        TextView t = new TextView(context);

        // calcular tamanho em tela de acordo com a densidade
        float dip = 50;
        float densidade = context.getResources().getDisplayMetrics().density;
        int px = (int)(dip*densidade + 0.5f);
        t.setHeight(px);
        t.setText(cerveja);

        return t;
    }
}
