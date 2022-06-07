package cesar.next.aula19.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cesar.next.aula19.model.Category;
import cesar.next.aula19.model.Pedido;
import cesar.next.aula19.model.Product;
import cesar.next.aula19.repository.RepositoryCategory;
import cesar.next.aula19.repository.RepositoryPedido;
import cesar.next.aula19.repository.RepositoryProduct;

@Configuration
public class LoadDataBase {

    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);

    @Bean
    public CommandLineRunner initDataBase(RepositoryCategory categoryRepository, RepositoryProduct productRepository,
            RepositoryPedido pedidoRepository) {
        return args -> {
            Category c1 = new Category("Pizzas", "pizzas deliciosas");
            Category c2 = new Category("bebidas", "bebidas deliciosas");
            log.info("Salvando categoria: " + categoryRepository.save(c1));
            log.info("Salvando categoria: " + categoryRepository.save(c2));

            Product p1 = new Product("cafe com leite", "description1", 20.0, 1);
            p1.setCategory(c2);
            Product p2 = new Product("pizza de queijo", "description1", 48.0, 8);
            p2.setCategory(c1);
            Product p3 = new Product("refrigerante", "description1", 5.5, 1);
            p3.setCategory(c2);

            Pedido o1 = new Pedido("07/07/2022", 53.5);
            Pedido o2 = new Pedido("07/07/2022", 20.0);
            log.info("Salvando produto: " + productRepository.save(p1));
            log.info("Salvando produto: " + productRepository.save(p2));
            log.info("Salvando produto: " + productRepository.save(p3));

            o1.getProducts().add(p2);
            o1.getProducts().add(p3);
            o2.getProducts().add(p1);

            log.info("Salvando pedido: " + pedidoRepository.save(o1));
            log.info("Salvando pedido: " + pedidoRepository.save(o2));

        };
    }

}
