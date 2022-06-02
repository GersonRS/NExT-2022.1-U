package cesar.next.aula19.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cesar.next.aula19.model.Product;
import cesar.next.aula19.repository.RepositoryProduct;

@RestController
public class ControllerProduct {

    @Autowired
    private RepositoryProduct repository;

    @GetMapping("/product")
    public List<Product> listaPratos() {
        return repository.findAll();
    }

    @PostMapping("/product")
    public Product cadastrar(@Validated @RequestBody Product newProduct) {
        return repository.save(newProduct);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> buscaPratoPorID(@PathVariable(value = "id") long id) {
        Optional<Product> p = repository.findById(id);
        if (p.isPresent()) {
            return new ResponseEntity<Product>(p.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/product/{name}")
    public List<Product> buscaPratoPorNome(@PathVariable(value = "id") String name) {
        return repository.findByName(name);

    }

}
