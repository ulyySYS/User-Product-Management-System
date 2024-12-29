package org.example;

public class Product {
    public int id;
    public String name;
    public String brand;
    public double price;
    public int quantity;
    public String expirationDate;
    public String type;
    public String description;
    public String date;
    public double cost;


    Product(int id, String name, String brand, double price, int quantity, String expirationDate,
        String type,String description, String date, double cost){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.description = description;
        this.date = date;
        this.cost = cost;
        this.type = type;
    }
}
