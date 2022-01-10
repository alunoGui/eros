package com.example.eros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CriarConta extends AppCompatActivity {

    EditText et_firstName,et_secondName, et_username, et_pass1, et_pass2;
    Button bt_regist;

    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);

        db = new DBHelper(this);

        et_firstName = (EditText) findViewById(R.id.et_firstName);
        et_secondName = (EditText) findViewById(R.id.et_secondName);
        et_username = (EditText) findViewById(R.id.et_username);
        et_pass1 = (EditText) findViewById(R.id.et_pass1);
        et_pass2 = (EditText) findViewById(R.id.et_pass2);
        bt_regist = (Button) findViewById(R.id.bt_regist);

        bt_regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first_name = et_firstName.getText().toString();
                String second_name = et_secondName.getText().toString();
                String username = et_username.getText().toString();
                String pass1 = et_pass1.getText().toString();
                String pass2 = et_pass2.getText().toString();

                if (username.equals("")) {
                    Toast.makeText(CriarConta.this, "Invalid sign up, please try again :(", Toast.LENGTH_SHORT).show();
                } else if (pass1.equals("") || pass2.equals("")) {
                    Toast.makeText(CriarConta.this, "You need a password for your account :|", Toast.LENGTH_SHORT).show();
                } else if (!pass1.equals(pass2)) {
                    Toast.makeText(CriarConta.this, "The password doesn't match, please try again :(", Toast.LENGTH_SHORT).show();
                } else if (first_name.equals("") || second_name.equals("")) {
                    Toast.makeText(CriarConta.this, "I'm sorry but you need to insert your name :(", Toast.LENGTH_SHORT).show();
                } else {
                   /*erro*/ long res = db.CriarUtilizador(username, pass1);
                    if (res > 0) {
                        Toast.makeText(CriarConta.this, "Congrats! You sign up on Eros :)", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(CriarConta.this, "Invalid sign up, please try again :(", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}