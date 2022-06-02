package cesar.next.aula19.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cesar.next.aula19.model.Category;

public interface RepositoryCategory extends JpaRepository<Category, Long> {

}
