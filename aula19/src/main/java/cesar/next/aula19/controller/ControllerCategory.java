package cesar.next.aula19.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cesar.next.aula19.model.Category;

@RestController
public class ControllerCategory {

    @Autowired
    private RepositoryCategory repository;

    @GetMapping("/category")
    public List<Category> listaCategoria() {
        return repository.findAll();
    }
}
