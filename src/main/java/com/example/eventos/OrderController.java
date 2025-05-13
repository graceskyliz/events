package com.example.eventos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final ApplicationEventPublisher publisher;

    @Autowired
    public OrderController(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderRequest request) {
        OrderCreatedEvent event = new OrderCreatedEvent(this,
                request.getId(),
                request.getEmail(),
                request.getProducto());

        publisher.publishEvent(event);

        return "Pedido recibido y evento publicado.";
    }
}

