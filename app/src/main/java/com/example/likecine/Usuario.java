package com.example.likecine;

public class Usuario{
    private String id;
    private String nome;
    private String idPlaylist;

    public Usuario(String id, String nome, String idPlaylist) {
        this.id = id;
        this.nome = nome;
        this.idPlaylist = idPlaylist;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(String idPlaylist) {
        this.idPlaylist = idPlaylist;
    }
}