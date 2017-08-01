package br.com.fernandosousa.brewerapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by fsousa on 12/03/2017.
 */

public class SimplesAdapter extends BaseAdapter {

    String[] listaCervejas = new String[] {"Duvel", "Murphys", "Sierra Nevada", "BockBier"};

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
