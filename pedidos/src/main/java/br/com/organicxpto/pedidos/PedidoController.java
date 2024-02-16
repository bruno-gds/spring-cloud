package br.com.organicxpto.pedidos;

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
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Pedido>> getAllPedidos() {
        return ResponseEntity.ok(this.pedidoService.getAll());
    }
}
