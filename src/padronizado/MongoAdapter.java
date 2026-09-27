package padronizado;

public class MongoAdapter implements DatabaseAdapter {
    private final MongoClient mongoClient;

    public MongoAdapter(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    @Override
    public void conectar() {
        mongoClient.conectar();
    }

    @Override
    public void desconectar() {
        mongoClient.desconectar();
    }

    @Override
    public void salvarUsuario(String nome) {
        mongoClient.salvarDocumento(
                "auditoria",
                "{evento: 'usuario_criado', nome: '" + nome + "'}"
        );
    }
}