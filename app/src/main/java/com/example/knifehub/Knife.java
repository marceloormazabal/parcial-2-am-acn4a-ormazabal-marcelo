package com.example.knifehub;

public class Knife {

    private String nombre;
    private String descripcion;
    private String descripcionLarga;
    private int imagenResId;
    private boolean esFavorito; // ⭐ Favoritos

    // 🔥 Constructor COMPLETO
    public Knife(String nombre, String descripcion, String descripcionLarga, int imagenResId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.descripcionLarga = descripcionLarga;
        this.imagenResId = imagenResId;
        this.esFavorito = false; // Por defecto no es favorito
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public int getImagenResId() {
        return imagenResId;
    }

    // ⭐ FAVORITOS
    public boolean isFavorito() {
        return esFavorito;
    }

    public void setFavorito(boolean favorito) {
        this.esFavorito = favorito;
    }
}
