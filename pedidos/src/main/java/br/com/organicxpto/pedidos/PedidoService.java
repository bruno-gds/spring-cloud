package br.com.organicxpto.pedidos;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 15/02/2024
 * Project Name: spring-cloud
 */


@Service
public class PedidoService {

    private List<Pedido> fakeDb = new ArrayList<>();

    private final EstoquePedidoProducer estoquePedidoProducer;

    public PedidoService(EstoquePedidoProducer estoquePedidoProducer) {
        this.estoquePedidoProducer = estoquePedidoProducer;
    }

    public List<Pedido> getAll() {
        return this.fakeDb;
    }

    public void save(Pedido pedido) {
        try {
            pedido.getItens().forEach(p -> this.estoquePedidoProducer.removerEstoque(
                    new RemoverEstoqueRequest(p.getIdProduct(), p.getQuantidade())
            ));
            this.fakeDb.add(pedido);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Fora de estoque");
        }
    }
}
