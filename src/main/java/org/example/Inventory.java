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
    // Arrays.sort arguements takes in Array, from index, to index, comparator
    // if to and from is not specified, a null error will happen because the array has null values
    public static void read(String type){
        System.out.println("read method called");
        switch(type){
            case "ID":
                Arrays.sort(tempDB,0, tempCount, Comparator.comparing(Product::getID));
                break;
            case "Name":
                Arrays.sort(tempDB,0, tempCount, Comparator.comparing(Product::getName));
                break;
            case "Brand":
                Arrays.sort(tempDB,0, tempCount, Comparator.comparing(Product::getBrand));
                break;
            case "Quantity":
                Arrays.sort(tempDB,0, tempCount, Comparator.comparing(Product::getQuantity));
                break;
            case "Price":
                Arrays.sort(tempDB,0, tempCount, Comparator.comparing(Product::getPrice));
                break;
            case "Expiration Date":
                Arrays.sort(tempDB,0, tempCount, Comparator.comparing(Product::getExpirationDate));
                break;
            case "Type":
                Arrays.sort(tempDB,0, tempCount, Comparator.comparing(Product::getType));
                break;
            default:
                System.out.println("Error: Wrong read type: " + type);
                break;
        }
        
    }
}

