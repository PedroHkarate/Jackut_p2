package br.ufal.ic.p2.jackut;
import java.util.ArrayList;

public class EncontrarUsuario extends Usuario{
    private ArrayList<Usuario> usuarios;

    public EncontrarUsuario(String login, String senha, String nome) {
        super(login, senha, nome);
    }

    public String encontrarUsuario(String login, String atributo) throws Exception{
        atributo = null;
        atributo = getAtributo(atributo);

        for (int i = 0; i < this.usuarios.size(); i++) {
            if (usuarios.getLast().equals(login)) return atributo;
        }
        throw new Exception("Usuário não cadastrado.");
    }

//    public String getAtributoUsuario(String login, String atributo) throws Exception {
//        Usuario usuario = new Usuario(login);
//        for (int i = 0; i < this.usuarios.size(); i++) {
//            if (usuarios.getLast().equals(login)) return String.valueOf(usuario);
//        }
//
//        return getAtributo(atributo);
//    }

}
