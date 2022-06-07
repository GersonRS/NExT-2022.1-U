package cesar.next.aula19.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cesar.next.aula19.model.Category;
import cesar.next.aula19.model.Product;
import cesar.next.aula19.repository.RepositoryCategory;
import cesar.next.aula19.repository.RepositoryProduct;

@Configuration
public class LoadDataBase {

    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);

    @Bean
    public CommandLineRunner initDataBase(RepositoryCategory categoryRepository, RepositoryProduct productRepository) {
        return args -> {
            Category c1 = new Category();
            c1.setName("pizzas");
            c1.setDescription("pizzas deliciosas");
            Category c2 = new Category();
            c2.setName("bebidas");
            c2.setDescription("bebidas deliciosas");

            Product p1 = new Product();
            p1.setName("cafe com leite");
            p1.setPrice(10.0);
            p1.setDescription("description1");
            p1.setAmountService(2);
            p1.setCategory(c2);

            log.info("Salvando categoria" + categoryRepository.save(c1));
            log.info("Salvando categoria" + categoryRepository.save(c2));
            log.info("Salvando categoria" + productRepository.save(p1));
        };
    }

}
