package br.ufal.ic.p2.jackut;
import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
    private String login;
    private String senha;
    private String nome;
    private ArrayList<Usuario> usuarios;

    public Usuario(String login, String senha, String nome) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
    }

    public String getLogin(){
        return this.login;
    }

    public String getSenha(){
        return this.senha;
    }

    public String getNome(){
        return this.nome;
    }

    public String getAtributo(String atributo) {
        switch (atributo) {
            case "nome":
                return this.getNome();
            case "senha":
                return this.getSenha();
            case "login":
                return this.getLogin();
            default:
                throw new RuntimeException("Tipo invalido.");
        }
    }



}
