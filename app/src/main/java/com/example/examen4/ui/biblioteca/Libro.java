package com.example.examen4.ui.biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private String anio;

    public Libro(String titulo, String autor, String editorial, String anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAnio() {
        return anio;
    }
}
