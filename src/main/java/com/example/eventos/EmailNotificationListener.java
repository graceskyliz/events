package com.example.eventos;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener implements OrderListener {

    @Override
    public void onOrderCreated(OrderRequest order) {
        System.out.println("Enviando correo a " + order.getEmail() +
                " confirmando pedido de " + order.getProducto() +
                " con ID " + order.getId());
    }
}

