package br.com.organicxpto.estoque;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 15/02/2024
 * Project Name: spring-cloud
 */

@RestController
public class Controller {

    private final ProdutoService produtoService;

    public Controller(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Produto>> getAll() {
        return ResponseEntity.ok(this.produtoService.getAll());
    }
}
