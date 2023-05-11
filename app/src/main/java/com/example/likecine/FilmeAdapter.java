package com.example.likecine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.likecine.Filme;
import java.util.ArrayList;

import java.util.List;


public class FilmeAdapter extends ArrayAdapter<Filme> {

    private TextView textTitulo, textAno;

    public FilmeAdapter(Context context, ArrayList<Filme> filmes) {
        super(context, 0, filmes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Verifica se a view está sendo reutilizada, caso contrário, infla a view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_filme, parent, false);
        }

        // Obtém o item da lista na posição atual
        Filme filme = getItem(position);

        // Obtém as views do layout
        TextView titulo = convertView.findViewById(R.id.textTitulo);
        TextView ano = convertView.findViewById(R.id.textAno);

        // Preenche as informações nas views
        textTitulo.setText(filme.getTitulo());
        textAno.setText(String.valueOf(filme.getAno()));

        // Retorna a view atualizada
        return convertView;
    }
}