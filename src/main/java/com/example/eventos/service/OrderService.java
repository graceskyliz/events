package com.example.eventos.service;

import com.example.eventos.model.OrderRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final List<OrderListener> listeners;

    public OrderService(List<OrderListener> listeners) {
        this.listeners = listeners;
    }

    public void createOrder(OrderRequest request) {
        for (OrderListener listener : listeners) {
            listener.onOrderCreated(request);
        }
    }
}
