package padronizado;

public interface DatabaseAdapter {

    void conectar();

    void desconectar();

    void salvarUsuario(String nome);
}