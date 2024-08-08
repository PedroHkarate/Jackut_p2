package br.ufal.ic.p2.jackut;

import java.util.Objects;

public class CriarUsuario extends Usuario{

    public CriarUsuario(String login, String senha, String nome) {
        super(login, senha, nome);
    }

//    public void criarUsuario(String login, String atributo) throws Exception{
//        atributo = getAtributo(atributo);
//
//        if(Objects.equals(atributo, "nome")){
//            if(atributo != null) throw new Exception("Conta com esse nome já existe.");
//        }
//        if(Objects.equals(atributo, "login")){
//            if(atributo != null) throw new Exception("Login inválido.");
//        }
//        if(Objects.equals(atributo, "senha")){
//            if(atributo != null) throw new Exception("Senha inválida.");
//        }
//        this.usuarios.add(new Usuario(login, senha, nome));
//    }
}
