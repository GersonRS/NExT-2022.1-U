package br.org.cesar.aula22.repository;

import org.springframework.data.repository.CrudRepository;

import br.org.cesar.aula22.entity.Client;

// @RepositoryRestResource(collectionResourceRel = "client", path = "starstore/client")
public interface ClientRepository extends CrudRepository<Client, Long> {

    // List<Client> findByName(@Param("name") String name);

}
