package org.example;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Inventory {
    static int storageCapacity;
    static int tempCount = 0;
    static Product[] tempDB;
    static int idCount = 1;

    Inventory(int storageCapacity){
        this.storageCapacity = storageCapacity;
        tempDB = new Product[storageCapacity];
    }
    
    // returns current date
    public static String getDate(){
        String date = "chwismath"; //temp date
        return date;
    }

    // adds new product
    public static void add(String name,String brand, double price, int quantity, String expirationDate,                      String type, String description, double cost){
        System.out.println(tempCount+ " " +storageCapacity);
        if(tempCount < storageCapacity){

            tempDB[tempCount] = new Product(idCount, name,brand, price, quantity, expirationDate, type,                                    description, getDate(), cost);

            tempCount++; 
            idCount++;
        } else {
            System.out.println("full capacity");
        }
    }


    // Sorts the tempDB
    // Arrays.sort(tempDB, Comparator.nullsLast(Comparator.comparing(Product::getID)));
    // This sorts the product array by name, ignoring nulls.
    // Null elements are placed at the end of the array.
    // Uses Comparator.nullsLast to handle nulls and place them at the end, and Comparator.comparing to sort by product name.
    public static void read(String type){
        System.out.println("read method called");
        switch(type){
            case "ID":
                
                Arrays.sort(tempDB, Comparator.nullsLast(Comparator.comparing(Product::getID)));
                break;
            case "Name":
               
                Arrays.sort(tempDB, Comparator.nullsLast(Comparator.comparing(Product::getName)));
                break;
            case "Brand":
                
                Arrays.sort(tempDB, Comparator.nullsLast(Comparator.comparing(Product::getBrand)));
                break;
            case "Quantity":
                
                Arrays.sort(tempDB, Comparator.nullsLast(Comparator.comparing(Product::getQuantity)));
                break;
            case "Price":
                
                Arrays.sort(tempDB, Comparator.nullsLast(Comparator.comparing(Product::getPrice)));
                break;
            case "Expiration Date":
                
                Arrays.sort(tempDB, Comparator.nullsLast(Comparator.comparing(Product::getExpirationDate)));
                break;
            case "Type":
                Arrays.sort(tempDB, Comparator.nullsLast(Comparator.comparing(Product::getType)));
                break;
            default:
                System.out.println("Error: Wrong read type: " + type);
                break;
        }
        
    }
}

