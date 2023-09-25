package com.example.examen4.ui.biblioteca;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examen4.R;

import java.util.List;

public class BibliotecaFragment extends Fragment {
    private BibliotecaViewModel bibliotecaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_biblioteca, container, false);

        bibliotecaViewModel = new ViewModelProvider(this).get(BibliotecaViewModel.class);

        // RecyclerView para mostrar la lista de libros
        RecyclerView recyclerView = root.findViewById(R.id.recyclerViewLibros);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Obtiener la lista de libros
        List<Libro> listaLibros = bibliotecaViewModel.getListaLibros();

        // pasar la lista de libros a LibroAdapter
        LibroAdapter libroAdapter = new LibroAdapter(listaLibros);
        // adaptador para la lista de libros
        recyclerView.setAdapter(libroAdapter);

        // Configurar el ClickListener
        libroAdapter.setOnItemClickListener(new LibroAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                // libro seleccionado
                Libro libroSeleccionado = listaLibros.get(position);

                // enviar los detalles del libro como argumentos
                Bundle args = new Bundle();
                args.putString("titulo", libroSeleccionado.getTitulo());
                args.putString("autor", libroSeleccionado.getAutor());
                args.putString("editorial", libroSeleccionado.getEditorial());
                args.putString("anio", libroSeleccionado.getAnio());

                Navigation.findNavController(requireView()).navigate(R.id.detalleLibroFragment, args);
            }
        });

        return root;
    }
}
