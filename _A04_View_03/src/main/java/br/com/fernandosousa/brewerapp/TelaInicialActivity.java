package br.com.fernandosousa.brewerapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;

public class TelaInicialActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        int branco = ContextCompat.getColor(this, R.color.branco);
        int verde = ContextCompat.getColor(this, R.color.verde);
        int azul = ContextCompat.getColor(this, R.color.azul);
        int vermelho = ContextCompat.getColor(this, R.color.vermelho);

        TextView texto1 = (TextView) findViewById(R.id.textView1);
        texto1.setTextColor(branco);
        texto1.setBackgroundColor(verde);

        TextView texto2 = (TextView) findViewById(R.id.textView2);
        texto2.setTextColor(branco);
        texto2.setBackgroundColor(azul);

        TextView texto3 = (TextView) findViewById(R.id.textView3);
        texto3.setText(R.string.msg_vermelho_branco);

        TextView texto4 = (TextView) findViewById(R.id.textView4);
        texto4.setText(R.string.texto_azul);
    }

}
