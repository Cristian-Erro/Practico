package com.example.practico3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class principal extends AppCompatActivity {
    Button btnprincipalsalir,btnprincipalacercade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.principal), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Boton para volver a pantalla de logeo.

        btnprincipalsalir=findViewById(R.id.btnprincipalsalir);
        btnprincipalsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent principal=new Intent(principal.this, MainActivity.class);
                startActivity(principal);
                finish();
            }
        });

        //Boton para ir a acerca de.

        btnprincipalacercade=findViewById(R.id.btnprincipalacercade);
        btnprincipalacercade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent principal=new Intent(principal.this, acercade.class);
                startActivity(principal);
                finish();
            }
        });
    }
}