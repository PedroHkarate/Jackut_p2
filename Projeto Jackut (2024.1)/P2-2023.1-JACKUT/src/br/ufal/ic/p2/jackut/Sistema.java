package br.ufal.ic.p2.jackut;

import java.util.ArrayList;
import java.util.Objects;

public class Sistema{
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public Sistema() {

    }

    public String criarUsuario(String login, String atributo) throws Exception{
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
