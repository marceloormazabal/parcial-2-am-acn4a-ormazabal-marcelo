package com.example.knifehub;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KnifeListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knife_list);

        // ⭐ BOTÓN VER FAVORITOS
        Button btnFav = findViewById(R.id.btnFavoritos);
        btnFav.setOnClickListener(v -> {
            Intent intent = new Intent(KnifeListActivity.this, FavoritosActivity.class);
            startActivity(intent);
        });

        // RECYCLER VIEW
        RecyclerView recyclerView = findViewById(R.id.rvCuchillos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // OBTENER LISTA DESDE KnifeData
        List<Knife> lista = KnifeData.getCuchillos();

        // ADAPTADOR
        KnifeAdapter adapter = new KnifeAdapter(this, lista);
        recyclerView.setAdapter(adapter);
    }
}
