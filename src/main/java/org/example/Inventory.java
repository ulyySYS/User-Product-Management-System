package org.example;

import java.util.Scanner;

public class Inventory {
    static int storageCapacity;
    static int tempCount = 0;
    static Product[] tempDB;

    Inventory(int storageCapacity){
        this.storageCapacity = storageCapacity;
        tempDB = new Product[storageCapacity];
    }

    public static void add(String name, double price, int quantity){
        System.out.println(tempCount+ " " +storageCapacity);
        if(tempCount < storageCapacity){

//            Scanner myObj = new Scanner(System.in);
//            System.out.println("Enter product name: ");
//            String name = myObj.nextLine();

            tempDB[tempCount] = new Product(name, price, quantity);

            tempCount++;
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

