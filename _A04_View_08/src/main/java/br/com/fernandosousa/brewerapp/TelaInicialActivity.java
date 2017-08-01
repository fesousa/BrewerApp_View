package br.com.fernandosousa.brewerapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class TelaInicialActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        ListView lista = (ListView)findViewById(R.id.listView);

        lista.setAdapter(new SimplesAdapter(TelaInicialActivity.this));

        lista.setOnItemClickListener(new  ListView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long id) {
                Toast.makeText(TelaInicialActivity.this, "Selecionado "+ index, Toast.LENGTH_SHORT).show();
            }
        });


    }

}
