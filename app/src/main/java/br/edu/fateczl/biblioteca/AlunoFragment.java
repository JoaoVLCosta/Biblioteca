package br.edu.fateczl.biblioteca;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AlunoFragment extends Fragment {

    private TextView tvListarA;

    private View view;

    public AlunoFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_aluno, container, false);

        tvListarA = view.findViewById(R.id.tvListarA);
        tvListarA.setMovementMethod(new ScrollingMovementMethod());

        return view;
    }
}