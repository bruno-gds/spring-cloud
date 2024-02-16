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

    public List<Pedido> getAll() {
        return this.fakeDb;
    }

    public void save(Pedido pedido) {
        this.fakeDb.add(pedido);
    }
}
