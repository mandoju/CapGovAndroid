package com.example.pesc.myapplication;

import java.io.Serializable;

/**
 * Created by Pesc on 28/05/2015.
 */
public class Pessoa implements Serializable{


    public static  final String TABLE = "table";
    public static  final String KEY_ID = "id";
    public static  final String KEY_NOME = "nome";
    public static  final String KEY_SENHA = "senha";
    public static  final  String KEY_EMAIL = "email";

    String nome;
    String email;
    String senha;

    public Pessoa(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }




}
