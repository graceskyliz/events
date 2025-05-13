package com.example.eventos;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AuditLogListener {

    @EventListener
    public void handleOrderCreated(OrderCreatedEvent event) {
        System.out.println("Registrando en logs el pedido: ID=" + event.getId()
                + ", Email=" + event.getEmail()
                + ", Producto=" + event.getProducto());
    }
}

