package cesar.next.aula21.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cesar.next.aula21.model.Category;
import cesar.next.aula21.model.Product;
import cesar.next.aula21.repository.CategoryRepository;
import cesar.next.aula21.repository.ProductRepository;

@Configuration
class LoadDataBase {

    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);

    @Bean
    CommandLineRunner initDatabase(CategoryRepository categoryRepository, ProductRepository productRepository) {

        return args -> {
            Category c1 = new Category("name1", "describe1");
            Category c2 = new Category("name2", "describe2");

            Product p1 = new Product("name1", 10.0, c1);
            Product p2 = new Product("name2", 10.0, c1);
            Product p3 = new Product("name3", 10.0, c2);
            Product p4 = new Product("name4", 10.0, c2);

            log.info("Preloading " + categoryRepository.save(c1));
            log.info("Preloading " + categoryRepository.save(c2));
            log.info("Preloading " + productRepository.save(p1));
            log.info("Preloading " + productRepository.save(p2));
            log.info("Preloading " + productRepository.save(p3));
            log.info("Preloading " + productRepository.save(p4));
        };
    }
}
