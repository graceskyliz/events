package com.example.eventos;

public class OrderRequest {
    private String id;
    private String email;
    private String producto;

    // Getters y setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }
}
