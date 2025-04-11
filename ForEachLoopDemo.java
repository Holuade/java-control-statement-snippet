package com.learnfrom.bright.controlStructure;

/**
 * Demonstrates the use of for-each loop in Java.
 */
public class ForEachLoopDemo {

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};

        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
