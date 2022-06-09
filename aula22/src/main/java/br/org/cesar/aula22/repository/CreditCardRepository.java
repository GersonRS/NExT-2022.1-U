package br.org.cesar.aula22.repository;

import org.springframework.data.repository.CrudRepository;

import br.org.cesar.aula22.entity.CreditCard;

public interface CreditCardRepository extends CrudRepository<CreditCard, Long> {

}
