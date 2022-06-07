package cesar.next.aula21.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cesar.next.aula21.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
