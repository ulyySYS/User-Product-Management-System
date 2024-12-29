package org.example;

import java.util.Scanner;

public class Inventory {
    static int storageCapacity;
    static int tempCount = 0;
    static Product[] tempDB;
    static int idCount = 1;

    Inventory(int storageCapacity){
        this.storageCapacity = storageCapacity;
        tempDB = new Product[storageCapacity];
    }
    
    public static String getDate(){
        String date = "chwismath";
        return date;
    }

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


    public static void read(){
        for(int i = 0; i < tempCount; i++){
            System.out.println(tempDB[i].name);
        }
    }
}

