package cesar.next.aula19.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cesar.next.aula19.model.Product;

public interface RepositoryProduct extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);
}
