package br.org.cesar.aula22.repository;

import org.springframework.data.repository.CrudRepository;

import br.org.cesar.aula22.entity.ProductTransaction;

public interface ProductTransactionRepository extends CrudRepository<ProductTransaction, Long> {

}
