package com.example.eventos;


import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class InventoryUpdateListener {

    @EventListener
    public void handleOrderCreated(OrderCreatedEvent event) {
        System.out.println("Reduciendo stock del producto: " + event.getProducto());
    }
}

