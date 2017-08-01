package br.com.fernandosousa.brewerapp;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

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

        ImageButton imgBtn = (ImageButton) findViewById(R.id.botaoImg2);
        imgBtn.setImageResource(R.drawable.smile2);

        final CheckBox check = (CheckBox)findViewById(R.id.checkbox1);

        final ToggleButton toggle = (ToggleButton)findViewById(R.id.toggle1);

        final RadioGroup radioGroup = (RadioGroup)findViewById(R.id.group1);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedID) {
                boolean sim = R.id.radioSim ==checkedID;
                boolean nao = R.id.radioNao ==checkedID;
                if(sim) {
                    Toast.makeText(TelaInicialActivity.this, "Marcou sim", Toast.LENGTH_LONG).show();
                } else if (nao) {
                    Toast.makeText(TelaInicialActivity.this, "Marcou não", Toast.LENGTH_LONG).show();
                }
            }
        });

        check.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                Toast.makeText(TelaInicialActivity.this, "Check marcado: " + isChecked, Toast.LENGTH_LONG).show();
            }
        });

        imgBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                boolean checkMarcado = check.isChecked();
                boolean toggleValue = check.isChecked();

                Toast.makeText(TelaInicialActivity.this, "Check: "+ checkMarcado, Toast.LENGTH_LONG).show();
                Toast.makeText(TelaInicialActivity.this, "Toggle: "+ toggleValue, Toast.LENGTH_LONG).show();

            }
        });

    }

}
