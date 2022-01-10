package com.example.eros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText username; /* Campo do username */
    EditText password; /* Campo da password */
    RadioButton rm_radio; /* RadioButton para guardar os dados inseridos no username e na password */
    Button bt_login; /* Botão de login */
    TextView forgot_password; /* Hiperligação para a activity de mudar pass */
    TextView sign_up; /* Hiperligação para criar conta */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        rm_radio = (RadioButton) findViewById(R.id.rm_radio);
        bt_login = (Button) findViewById(R.id.bt_login);
        forgot_password = (TextView) findViewById(R.id.forgot_password);
        sign_up = (TextView) findViewById(R.id.sign_up);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* Lê os valores inseridos nos capos username e password
                *   -> SE os valores constarem da base de dados avança para a sessão do utilizador
                *   -> SE NÃO imprime uma mensagem de erro */

            }
        });

        forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* leva para a activity que corresponde a página de modar a pass da conta na app */
                Intent j = new Intent(MainActivity.this, MudarPass.class);
                startActivity(j);
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* leva para a activity que corresponde a página de criar conta na app */
                Intent i = new Intent(MainActivity.this, CriarConta.class);
                startActivity(i);
            }
        });


    }
    

}