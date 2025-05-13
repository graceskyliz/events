package com.example.eventos.controller;

import com.example.eventos.model.OrderRequest;
import com.example.eventos.service.OrderService;
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
