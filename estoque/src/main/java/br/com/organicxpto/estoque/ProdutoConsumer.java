package br.com.organicxpto.estoque;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 16/02/2024
 * Project Name: spring-cloud
 */

@Component
public class ProdutoConsumer {

    private final ProdutoService produtoService;

    public ProdutoConsumer(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @Bean(name = "remova-estoque")
    Consumer<ProdutoRequested> consumer() {
        return pR -> this.produtoService.removerEstoque(pR.getIdProduto(), pR.getQuantidade());
    }
}
