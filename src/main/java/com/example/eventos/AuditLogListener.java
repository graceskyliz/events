package com.example.eventos;


import com.example.eventos.OrderListener;
import com.example.eventos.OrderRequest;
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

