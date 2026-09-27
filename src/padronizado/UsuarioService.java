package padronizado;

public class UsuarioService {
    private final DatabaseAdapter databaseAdapter;

    public UsuarioService(DatabaseAdapter databaseAdapter) {
        this.databaseAdapter = databaseAdapter;
    }

    public void cadastrarUsuario(String nome) {
        System.out.println("Cadastro usando Adapter e Singleton");
        databaseAdapter.conectar();
        try {
            databaseAdapter.salvarUsuario(nome);
        } finally {
            databaseAdapter.desconectar();
        }
    }
}