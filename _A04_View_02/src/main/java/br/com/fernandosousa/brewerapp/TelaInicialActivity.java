package br.com.fernandosousa.brewerapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class TelaInicialActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        TextView texto3 = (TextView) findViewById(R.id.textView3);
        texto3.setText(R.string.msg_vermelho_branco);

        TextView texto4 = (TextView) findViewById(R.id.textView4);
        texto4.setText(R.string.texto_azul);
    }

}
