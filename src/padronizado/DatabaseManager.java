package padronizado;

public class DatabaseManager {
    private static DatabaseManager instance;
    private DatabaseAdapter postgresAdapter;
    private DatabaseAdapter mongoAdapter;

    private DatabaseManager() {
        PostgresClient postgresClient = new PostgresClient("localhost", 5432, "usuarios_db");
        MongoClient mongoClient = new MongoClient("localhost", 27017, "auditoria_db");

        postgresAdapter = new PostgresAdapter(postgresClient);
        mongoAdapter = new MongoAdapter(mongoClient);
    }

    public static DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }

    public DatabaseAdapter getPostgresAdapter() {
        return postgresAdapter;
    }

    public DatabaseAdapter getMongoAdapter() {
        return mongoAdapter;
    }
}