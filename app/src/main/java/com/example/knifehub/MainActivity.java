package com.example.knifehub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculamos el botón
        Button btn = findViewById(R.id.btnIngresar);

        // Acción del botón
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // MOSTRAR MENSAJE (opcional)
                Toast.makeText(MainActivity.this, "Estás entrando a KnifeHub!", Toast.LENGTH_SHORT).show();

                // IR A LA NUEVA ACTIVIDAD
                Intent intent = new Intent(MainActivity.this, KnifeListActivity.class);
                startActivity(intent);
            }
        });
    }
}
