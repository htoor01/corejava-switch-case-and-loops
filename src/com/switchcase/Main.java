package com.switchcase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Reference switch-case fruits method, print out value
        fruits("Pear");

        // Create ArrayList of fruits
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Pear");

        // For-loop to print out "Orange" and index number, if we do not know specific index
        for(int i=0;i<fruitList.size();i++){
            if (fruitList.get(i)=="Orange") {
                System.out.println(fruitList.get(i));
                System.out.println(i);
            }
        }

        // While-loop to print out "Orange" and index number, if we do not know specific index
        int i = 0;
        while (i<fruitList.size()){
            if (fruitList.get(i)=="Pear") {
                System.out.println(fruitList.get(i));
                System.out.println(i);
            }
            i++;
        }

    }

    // Create switch-case String method, pulling values from database
    public static String fruits(String fruit) {
        String f = null;
        switch (fruit.toLowerCase()){
            case "orange" :
                f = "Oranges are juicy";
                break;
            case "apple" :
                f = "Apples are sweet";
                break;
            case "pear" :
                f = "Pears are tasty";
                break;
            default :
                f = "Fruits not found";
        }
        System.out.println(f);
        return f;
    }

}


