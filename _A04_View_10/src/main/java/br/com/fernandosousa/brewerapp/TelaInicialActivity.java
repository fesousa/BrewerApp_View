package br.com.fernandosousa.brewerapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class TelaInicialActivity extends DebugActivity {

    private List<Cerveja> cervejas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        cervejas = Cerveja.getCervejas();
        ListView lista = (ListView)findViewById(R.id.listView);
        lista.setAdapter(new CervejasAdpapter(TelaInicialActivity.this, cervejas));

        lista.setOnItemClickListener(new  ListView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long id) {
                Toast.makeText(TelaInicialActivity.this, "Selecionado "+ cervejas.get(index).nome, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
