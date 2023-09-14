package singleton;

public class DatabaseConfig {
    private static DatabaseConfig instance;
    private String databaseUrl;

    private DatabaseConfig() {
        // Configurações de inicialização do banco de dados
        databaseUrl = "jdbc:mysql://localhost/mydb";
    }

    public static synchronized DatabaseConfig getInstance() {
        if (instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }
}

