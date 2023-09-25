package com.example.examen4.ui.biblioteca;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaViewModel extends ViewModel {
    private List<Libro> listaLibros;

    public BibliotecaViewModel() {
        listaLibros = new ArrayList<>();
        cargarLibros();
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    private void cargarLibros() {
        listaLibros.add(new Libro("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", "1960"));
        listaLibros.add(new Libro("1984", "George Orwell", "Secker & Warburg", "1949"));
        listaLibros.add(new Libro("Pride and Prejudice", "Jane Austen", "T. Egerton, Whitehall", "1813"));
        listaLibros.add(new Libro("The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", "1925"));
        listaLibros.add(new Libro("Moby-Dick", "Herman Melville", "Harper & Brothers", "1851"));
        listaLibros.add(new Libro("The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", "1951"));
        listaLibros.add(new Libro("To the Lighthouse", "Virginia Woolf", "Hogarth Press", "1927"));
        listaLibros.add(new Libro("Brave New World", "Aldous Huxley", "Chatto & Windus", "1932"));
        listaLibros.add(new Libro("War and Peace", "Leo Tolstoy", "The Russian Messenger", "1869"));
        listaLibros.add(new Libro("The Odyssey", "Homer", "Ancient Greece", "8th Century BCE"));
    }

}
