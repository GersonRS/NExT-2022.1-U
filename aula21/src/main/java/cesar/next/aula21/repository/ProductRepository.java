package cesar.next.aula21.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cesar.next.aula21.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
