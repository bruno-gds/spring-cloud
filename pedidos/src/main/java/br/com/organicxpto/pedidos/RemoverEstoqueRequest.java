package br.com.organicxpto.pedidos;

import java.math.BigDecimal;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 19/02/2024
 * Project Name: spring-cloud
 */

public class RemoverEstoqueRequest {

    private Long idProduto;

    private BigDecimal quantidade;

    public RemoverEstoqueRequest(Long idProduto, BigDecimal quantidade) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }
}
