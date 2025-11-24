package com.example.knifehub;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KnifeAdapter extends RecyclerView.Adapter<KnifeAdapter.KnifeViewHolder> {

    private Context context;
    private List<Knife> lista;

    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;

    public KnifeAdapter(Context context, List<Knife> lista) {
        this.context = context;
        this.lista = lista;

        prefs = context.getSharedPreferences("favoritos", Context.MODE_PRIVATE);
        editor = prefs.edit();
    }

    @NonNull
    @Override
    public KnifeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_cuchillo, parent, false);
        return new KnifeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KnifeViewHolder holder, int position) {
        Knife knife = lista.get(position);

        // Datos base
        holder.tvNombre.setText(knife.getNombre());
        holder.tvDescripcion.setText(knife.getDescripcion());
        holder.ivImagen.setImageResource(knife.getImagenResId());

        // ===== Estado actual del favorito =====
        boolean esFavorito = prefs.getBoolean(knife.getNombre(), false);
        holder.ivStar.setImageResource(
                esFavorito ? R.drawable.estrella : R.drawable.estrella_vacia
        );

        // ===== Click en estrella =====
        holder.ivStar.setOnClickListener(v -> {
            boolean estadoActual = prefs.getBoolean(knife.getNombre(), false);
            boolean nuevoEstado = !estadoActual;

            editor.putBoolean(knife.getNombre(), nuevoEstado);
            editor.apply();

            holder.ivStar.setImageResource(
                    nuevoEstado ? R.drawable.estrella : R.drawable.estrella_vacia
            );
        });

        // ===== Navegar al detalle =====
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, KnifeDetailActivity.class);
            intent.putExtra("nombre", knife.getNombre());
            intent.putExtra("descripcionLarga", knife.getDescripcionLarga());
            intent.putExtra("imagen", knife.getImagenResId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class KnifeViewHolder extends RecyclerView.ViewHolder {

        TextView tvNombre, tvDescripcion;
        ImageView ivImagen, ivStar;

        public KnifeViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNombre = itemView.findViewById(R.id.tvNombreCuchillo);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcionCuchillo);
            ivImagen = itemView.findViewById(R.id.ivImagenCuchillo);
            ivStar = itemView.findViewById(R.id.ivStar);
        }
    }
}
