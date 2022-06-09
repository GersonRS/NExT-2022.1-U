package br.org.cesar.aula22.repository;

import org.springframework.data.repository.CrudRepository;

import br.org.cesar.aula22.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
