package org.example;

public class Product {
    public int id;
    public String name;
    public double price;
    public int quantity;
    public String expirationDate;
    public String description;


    Product(int id, String name, double price, int quantity, String expirationDate, String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.description = description;
    }
}
