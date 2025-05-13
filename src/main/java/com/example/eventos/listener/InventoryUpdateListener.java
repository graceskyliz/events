package com.example.eventos.listener;

import com.example.eventos.model.OrderRequest;
import com.example.eventos.service.OrderListener;
import org.springframework.stereotype.Component;

@Component
public class InventoryUpdateListener implements OrderListener {

    @Override
    public void onOrderCreated(OrderRequest order) {
        System.out.println("Reduciendo stock del producto: " + (order.getStock()-1));
    }
}
