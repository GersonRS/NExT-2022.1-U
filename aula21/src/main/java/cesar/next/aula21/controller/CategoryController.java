package cesar.next.aula21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cesar.next.aula21.exceptions.CategoryNotFoundException;
import cesar.next.aula21.model.Category;
import cesar.next.aula21.repository.CategoryRepository;

@RestController
public class CategoryController {

    @Autowired // Isso significa obter o bean chamado repository que é gerado
               // automaticamente pelo Spring, a famosa injeção de dependência
    private CategoryRepository repository;

    @GetMapping("/categories")
    public List<Category> all() {
        return repository.findAll();
    }

    @PostMapping("/categories")
    public Category newCategory(@RequestBody Category newCategory) {
        return repository.save(newCategory);
    }

    @GetMapping("/categories/{id}")
    public Category one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new CategoryNotFoundException(id));
        // return repository.findById(id)
        // .map(category -> EntityModel.of(category,
        // linkTo(methodOn(CategoryController.class).one(category.getId())).withSelfRel(),
        // linkTo(methodOn(CategoryController.class).all()).withRel("categories")))
        // .map(ResponseEntity::ok)
        // .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/categories/{id}")
    public Category replaceCategory(@RequestBody Category newCategory,
            @PathVariable Long id) {

        return repository.findById(id)
                .map(category -> {
                    category.setName(newCategory.getName());
                    return repository.save(category);
                })
                .orElseGet(() -> {
                    newCategory.setId(id);
                    return repository.save(newCategory);
                });
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
