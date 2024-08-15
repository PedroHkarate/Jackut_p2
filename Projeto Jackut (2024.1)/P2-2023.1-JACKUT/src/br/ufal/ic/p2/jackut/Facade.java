package br.ufal.ic.p2.jackut;
import static java.lang.Boolean.TRUE;

public class Facade {

    private final Sistema sistema;

    public Facade(Sistema sistema) {
        this.sistema = sistema;
    }

    public void zerarSistema(){

    }

    public Usuario criarUsuario(String login, String senha, String nome) throws Exception{
        CriarUsuarios usuario1 = new CriarUsuarios(login, senha, nome);

        //if(usuario1.equals(TRUE)) this.usuarios.add(login, senha, nome);
        //else throw new Exception("Usuário já existe.");
        return null;
    }

    public String getAtributoUsuario(String login, String atributo) throws Exception{
        String senha = null;
        String nome = null;
        atributo = String.valueOf(new EncontrarUsuario(login, senha, nome));

        if(atributo != null) return atributo;
        throw new Exception("Usuário não cadastrado.");
    }



    public void abrirSessao(String login, String senha){

    }

    public void editarPerfil(String id, String atributo, String valor){

    }

    public void encerrarSistema(){

    }

}
