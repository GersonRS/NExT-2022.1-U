package br.org.cesar.aula22.repository;

import org.springframework.data.repository.CrudRepository;

import br.org.cesar.aula22.entity.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
