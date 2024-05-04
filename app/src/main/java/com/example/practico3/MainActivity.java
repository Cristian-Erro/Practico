package com.example.practico3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtmainuser;
    EditText edtmainpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtmainuser=findViewById(R.id.edtmainuser);
        edtmainpass=findViewById(R.id.edtmainpass);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.principal), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        }
        //Boton de control y logeo
        public void login(View view){
            String inputUsername = edtmainuser.getText().toString();
            String inputPassword = edtmainpass.getText().toString();

            if (inputUsername.equals("alumno") && inputPassword.equals("1234"))
            {
                Intent intent = new Intent(this,principal.class);
                startActivity(intent);
            }else{
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();

            }
        }
    }