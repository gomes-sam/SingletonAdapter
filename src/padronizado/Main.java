package padronizado;

public class Main {
    public static void main(String[] args) {
        DatabaseManager databaseManager = DatabaseManager.getInstance();

        UsuarioService usuarioNoPostgres = new UsuarioService(
                databaseManager.getPostgresAdapter()
        );

        UsuarioService auditoriaNoMongo = new UsuarioService(
                databaseManager.getMongoAdapter()
        );

        usuarioNoPostgres.cadastrarUsuario("Ana");
        auditoriaNoMongo.cadastrarUsuario("Ana");
    }
}