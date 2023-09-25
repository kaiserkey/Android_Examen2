package com.example.examen4.ui.biblioteca;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.examen4.R;

public class DetalleLibroFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_detalle_libro, container, false);

        // Recuperar detalles del libro
        Bundle args = getArguments();
        if (args != null) {
            String titulo = args.getString("titulo");
            String autor = args.getString("autor");
            String editorial = args.getString("editorial");
            String anio = args.getString("anio");

            // Muestrar los detalles del libro
            TextView tvTitulo = root.findViewById(R.id.tvTitulo);
            TextView tvAutor = root.findViewById(R.id.tvAutor);
            TextView tvEditorial = root.findViewById(R.id.tvEditorial);
            TextView tvAnio = root.findViewById(R.id.tvAnio);

            tvTitulo.setText("Título: " + titulo);
            tvAutor.setText("Autor: " + autor);
            tvEditorial.setText("Editorial: " + editorial);
            tvAnio.setText("Año: " + anio);
        }

        return root;
    }

}
