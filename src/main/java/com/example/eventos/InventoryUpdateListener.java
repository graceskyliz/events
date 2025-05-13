package com.example.eventos;

import org.springframework.stereotype.Component;

@Component
public class InventoryUpdateListener implements OrderListener {

    @Override
    public void onOrderCreated(OrderRequest order) {
        System.out.println("Reduciendo stock del producto: " + order.getProducto());
    }
}


