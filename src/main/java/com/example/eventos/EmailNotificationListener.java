package com.example.eventos;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener {

    @EventListener
    public void handleOrderCreated(OrderCreatedEvent event) {
        System.out.println("Enviando correo a " + event.getEmail() +
                " confirmando pedido de " + event.getProducto() + " con ID " + event.getId());
    }
}

