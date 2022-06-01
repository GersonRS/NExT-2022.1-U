package next.aula18.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping("/produto/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable(value = "id") long id,
            @Validated @RequestBody Produto newProduto) {

        Optional<Produto> oldProduto = repository.findById(id);

        if (oldProduto.isPresent()) {
            Produto pTemporario = oldProduto.get();

            pTemporario.setNome(newProduto.getNome());
            pTemporario.setValor(newProduto.getValor());

            repository.save(pTemporario);

            return new ResponseEntity<Produto>(pTemporario, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/produto/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") long id) {

        Optional<Produto> oldProduto = repository.findById(id);
        if (oldProduto.isPresent()) {
            repository.delete(oldProduto.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
