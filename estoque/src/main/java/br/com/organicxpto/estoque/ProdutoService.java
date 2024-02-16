package br.com.organicxpto.estoque;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 15/02/2024
 * Project Name: spring-cloud
 */

@Service
public class ProdutoService {

    private List<Produto> fakeDb = List.of(
            new Produto(1L, "Tomates", BigDecimal.valueOf(1000000)),
            new Produto(2L, "Abacaxi", BigDecimal.TEN));

    public List<Produto> getAll() {
        return this.fakeDb;
    }
}
