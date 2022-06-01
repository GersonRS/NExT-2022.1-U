package next.aula18.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import next.aula18.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
