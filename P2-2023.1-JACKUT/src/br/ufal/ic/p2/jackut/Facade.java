package br.ufal.ic.p2.jackut;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import br.ufal.ic.p2.jackut.*;

public class Facade {

    private ArrayList<Usuario> usuarios;


    public void zerarSistema(){

    }

    public Usuario getAtributoUsuario(String login, String atributo) throws Exception{
        String senha = null;
        String nome = null;
        Usuario usuario = new EncontrarUsuario(login, senha, nome);

        if(usuario != null) return usuario;
        throw new Exception("Usuário não cadastrado.");
    }

    public void criarUsuario(String login, String senha, String nome){
        login = String.valueOf(new Scanner(login));
        senha = String.valueOf(new Scanner(senha));
        Scanner name = new Scanner(nome);
        //System.out.printf("\n" + nome + "\n");
    }

}
