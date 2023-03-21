import entity.Client;
import org.flywaydb.core.Flyway;
import services.ClientCrudService;
import utils.HibernateUtil;


public class Main {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:postgresql://localhost/module10", "postgres", "3nyn56").load();
        flyway.migrate();

        ClientCrudService clientCrudService = new ClientCrudService(HibernateUtil.getInstance().getSessionFactory());
        Client client = new Client();
        client.setName("Alberic de Bordeleaux");
        clientCrudService.create(client);
    }
}