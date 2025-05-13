package com.example.eventos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderRequest request) {
        orderService.createOrder(request);
        return "Pedido recibido y notificado a los observadores.";
    }
}
