package br.com.fernandosousa.brewerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        ImageView imagem  = (ImageView) findViewById(R.id.imagemLogin);
        imagem.setImageResource(R.drawable.login_img);

        TextView texto  = (TextView) findViewById(R.id.mensagemInicio);
        texto.setText(R.string.mensagem_login_activity);

        int branco = ContextCompat.getColor(this, R.color.branco);
        texto.setTextColor(branco);

        int vermelho = ContextCompat.getColor(this, R.color.vermelho);
        texto.setBackgroundColor(vermelho);


        TextView textoSenha  = (TextView) findViewById(R.id.textoSenha);
        textoSenha.setText(R.string.texto_senha);

        TextView campoUsuario = (TextView) findViewById(R.id.campoUsuario);
        TextView campoSenha = (TextView) findViewById(R.id.campoSenha);

        String txtUsuario = campoUsuario.toString();
        String txtSenha = campoSenha.toString();

        Button botao = (Button)findViewById(R.id.botaoLogin);

        botao.setOnClickListener(onClickLogin());
    }

    private View.OnClickListener onClickLogin() {
        return new View.OnClickListener() {
            public void onClick(View v) {
                TextView campoUsuario = (TextView) findViewById(R.id.campoUsuario);
                TextView campoSenha = (TextView) findViewById(R.id.campoSenha);

                String txtUsuario = campoUsuario.getText().toString();
                String txtSenha = campoSenha.getText().toString();

                //Toast.makeText(MainActivity.this, "Usuário: " + txtUsuario + "; Senha: " + txtSenha, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, TelaInicialActivity.class);

                Bundle params = new Bundle();
                params.putString("nome", txtUsuario);
                intent.putExtras(params);

                // sem resultado
                //startActivity(intent);
                // com resultado
                startActivityForResult(intent, 1);
            }
        };
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            String result=data.getStringExtra("result");
            Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
        }
    }
}
