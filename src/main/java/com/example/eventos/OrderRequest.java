package com.example.eventos;

import lombok.Data;

@Data
public class OrderRequest {
    private Long id;
    private String email;
    private String producto;

}