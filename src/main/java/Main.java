import org.flywaydb.core.Flyway;


public class Main {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:postgresql://localhost/module10", "postgres", "3nyn56").load();
        flyway.migrate();
    }
}