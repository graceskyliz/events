package com.example.eventos.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private String id;
    private String email;
    private String producto;
    private int stock = 100;
}
