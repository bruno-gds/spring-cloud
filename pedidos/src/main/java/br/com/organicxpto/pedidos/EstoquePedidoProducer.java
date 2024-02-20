package br.com.organicxpto.pedidos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 19/02/2024
 * Project Name: spring-cloud
 */

@FeignClient(value = "estoque", url = "http://localhost:8081/api")
public interface EstoquePedidoProducer {

    @PostMapping(value = "/consumer-remova-estoque")
    void removerEstoque(RemoverEstoqueRequest removerEstoqueRequest);
}
