package com.example.knifehub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 🔐 VERIFICAR SESIÓN
        if (FirebaseAuth.getInstance().getCurrentUser() == null) {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
            return;
        }

        setContentView(R.layout.activity_main);

        Button btnIngresar = findViewById(R.id.btnIngresar);
        Button btnLogout = findViewById(R.id.btnLogout);

        // 👉 IR AL LISTADO DE CUCHILLOS
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Estás entrando a KnifeHub!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, KnifeListActivity.class);
                startActivity(intent);
            }
        });

        // 🔴 CERRAR SESIÓN
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();

                Toast.makeText(MainActivity.this, "Sesión cerrada", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
