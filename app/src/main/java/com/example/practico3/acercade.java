package com.example.practico3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class acercade extends AppCompatActivity {
//Declaracion de botones
    Button btnacercadevolver,btnllamada,btnacercamail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_acercade);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Boton para volver a menu principal

        btnacercadevolver=findViewById(R.id.btnacercadevolver);
        btnacercadevolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a =new Intent(acercade.this, principal.class);
                startActivity(a);
                finish();
            }
        });
        //Intent implicito para llamar

        btnllamada=findViewById(R.id.btnacercallamar);
        btnllamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:1122334455")));
            }
        });

        //Intent implicito para enviar mail

        btnacercamail=findViewById(R.id.btnacercamail);
        btnacercamail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:cristianlp86@gmail.com"));
                startActivity(intent);

            }
        });
    }

}