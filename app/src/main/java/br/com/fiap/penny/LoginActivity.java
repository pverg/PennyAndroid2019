package br.com.fiap.penny;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsername;
    EditText edtPassword;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
    }

    public void login(View view) {

        if (edtUsername.getText().toString().equals("penny") && edtPassword.getText().toString().equals("2019")) {

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);

        } else {

            Toast.makeText(this, "Usuário ou senha incorretos!", Toast.LENGTH_LONG);

        }

    }
}
