package br.ufal.ic.p2.jackut;

import java.util.ArrayList;
import java.util.Objects;

public class CriarUsuarios extends Usuario{

    public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public CriarUsuarios(String login, String senha, String nome) {
        super(login, senha, nome);
    }

    public String criarUsuario(String login, String atributo) throws Exception{
        String senha = null;
        String nome = null;
        atributo = getAtributo(atributo);

        if(Objects.equals(atributo, "nome")){
            if(atributo != null) throw new Exception("Conta com esse nome j� existe.");
        }
        if(Objects.equals(atributo, "login")){
            if(atributo != null) throw new Exception("Login inv�lido.");
        }
        if(Objects.equals(atributo, "senha")){
            if(atributo != null) throw new Exception("Senha inv�lida.");
        }
        return atributo;
    }
}
