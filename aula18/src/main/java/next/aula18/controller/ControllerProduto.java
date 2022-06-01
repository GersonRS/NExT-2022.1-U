package next.aula18.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import next.aula18.model.Produto;
import next.aula18.repository.ProdutoRepository;

@RestController
public class ControllerProduto {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/produto")
    public List<Produto> listaProdutos() {
        return repository.findAll();// select * from produto;
    }

    @PostMapping("/produto")
    public Produto cadastrar(@Validated @RequestBody Produto entity) {
        return repository.save(entity);
    }

}
