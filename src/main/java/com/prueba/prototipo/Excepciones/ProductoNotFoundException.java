package com.prueba.prototipo.Excepciones;

public class ProductoNotFoundException extends RuntimeException{
    public ProductoNotFoundException(String message) {
        super(message);
    }
}
