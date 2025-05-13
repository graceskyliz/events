package com.example.eventos.listener;

import com.example.eventos.model.OrderRequest;
import com.example.eventos.service.OrderListener;
import org.springframework.stereotype.Component;

@Component
public class AuditLogListener implements OrderListener {

    @Override
    public void onOrderCreated(OrderRequest order) {
        System.out.println(" Registrando en logs el pedido: ID=" + order.getId()
                + ", Email=" + order.getEmail()
                + ", Producto=" + order.getProducto());
    }
}

