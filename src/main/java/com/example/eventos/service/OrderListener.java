package com.example.eventos.service;

import com.example.eventos.model.OrderRequest;

public interface OrderListener {
    void onOrderCreated(OrderRequest order);
}
