package br.edu.fateczl.biblioteca;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class InicioFragment extends Fragment {

    public InicioFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_inicio, container, false);

        TextView tvInicio = view.findViewById(R.id.tvInicio);
        tvInicio.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        return view;
    }
}