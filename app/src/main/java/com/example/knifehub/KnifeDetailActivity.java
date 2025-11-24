package com.example.knifehub;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class KnifeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knife_detail);

        // Referencias a las vistas
        ImageView ivImagen = findViewById(R.id.ivDetalleImagen);
        TextView tvNombre = findViewById(R.id.tvDetalleNombre);
        TextView tvDescripcionLarga = findViewById(R.id.tvDetalleDescripcionLarga);

        // Recibimos datos desde el intent
        String nombre = getIntent().getStringExtra("nombre");
        String descripcionLarga = getIntent().getStringExtra("descripcionLarga");
        int imagenResId = getIntent().getIntExtra("imagen", 0);

        // Mostramos los datos
        tvNombre.setText(nombre);
        tvDescripcionLarga.setText(descripcionLarga);
        ivImagen.setImageResource(imagenResId);
    }
}
