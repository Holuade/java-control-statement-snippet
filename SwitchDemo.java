package com.learnfrom.bright.controlStructure;

/**
 * Demonstrates the use of switch statement in Java.
 */
public class SwitchDemo {

    public static void main(String[] args) {
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("Welcome Admin!");
                break;
            case "guest":
                System.out.println("Welcome Guest!");
                break;
            default:
                System.out.println("Role not recognized.");
        }
    }
}
