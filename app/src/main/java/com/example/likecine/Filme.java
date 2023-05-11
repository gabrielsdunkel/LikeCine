package com.example.likecine;

public class Filme {
    private String textAno;
    private String textTitulo;
    private int curtidas;

    public Filme(String textAno, String textTitulo, int curtidas) {
        this.textAno = textAno;
        this.textTitulo = textTitulo;
        this.curtidas = curtidas;
    }

    public String getAno() {
        return textAno;
    }

    public void setAno(String textAno) {
        this.textAno = textAno;
    }

    public String getTitulo() {
        return textTitulo;
    }

    public void setTitulo(String textTitulo) {
        this.textTitulo = textTitulo;
    }

    public int getcurtidas() {
        return curtidas;
    }

    public void setcurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
}