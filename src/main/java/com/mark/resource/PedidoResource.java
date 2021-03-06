package com.mark.resource;

import com.mark.domain.Pedido;
import com.mark.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pedidos")
@ComponentScan("com.mark.services")
public class PedidoResource {

    @Autowired
    private PedidoService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id){
        Pedido obj = service.buscar(id);
        return ResponseEntity.ok().body(obj);
    }
}
