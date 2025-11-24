package com.example.knifehub;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FavoritosActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Knife> listaFavoritos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        recyclerView = findViewById(R.id.rvFavoritos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        cargarFavoritos();
        mostrarFavoritos();
    }

    private void cargarFavoritos() {

        SharedPreferences prefs = getSharedPreferences("favoritos", MODE_PRIVATE);
        Map<String, ?> datos = prefs.getAll();

        listaFavoritos.clear();

        for (Map.Entry<String, ?> entry : datos.entrySet()) {

            boolean esFav = Boolean.TRUE.equals(entry.getValue());
            if (!esFav) continue;

            String nombre = entry.getKey();
            Knife k = obtenerKnifePorNombre(nombre);
            if (k != null) listaFavoritos.add(k);
        }
    }

    private Knife obtenerKnifePorNombre(String nombre) {

        List<Knife> todos = KnifeData.getCuchillos();

        for (Knife k : todos) {
            if (k.getNombre().equals(nombre)) {
                return k;
            }
        }
        return null;
    }

    private void mostrarFavoritos() {
        KnifeAdapter adapter = new KnifeAdapter(this, listaFavoritos);
        recyclerView.setAdapter(adapter);
    }
}
