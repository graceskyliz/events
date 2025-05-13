package com.example.eventos;


import org.springframework.context.ApplicationEvent;

public class OrderCreatedEvent extends ApplicationEvent {
    private final Long id;
    private final String email;
    private final String producto;

    public OrderCreatedEvent(Object source, Long id, String email, String producto) {
        super(source);
        this.id = id;
        this.email = email;
        this.producto = producto;
    }

    public Long getId() { return id; }
    public String getEmail() { return email; }
    public String getProducto() { return producto; }
}

