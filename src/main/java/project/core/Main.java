package project.core;

import java.io.Console;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner; // Import the Scanner class
import java.io.BufferedReader;
import java.io.IOException; // Import the IOException class to handle errors


public class Main {
    public static void main(String[] args)

    {

        // ? Instantiate a new User
        User fred = new User("fred");

        // ? Instantiate a new Cart
        Cart fredCart = new Cart(fred);

        // ? Runs the method
        // fredCart.add();

        // Scanner scanner = new Scanner(System.in);
        Console cons = System.console();
        ArrayList<String> cart = new ArrayList<String>();
        Boolean usingCart = true;

        while (usingCart) {
            System.out.printf("Welcome to the shopping cart \n");
            String userInput = cons.readLine("> ");
            String[] terms = userInput.split(" "); // ? Split returns an array of string
            String command = terms[0];


            if (command.equals("create")) {   //? In progress
                System.out.println("Creating new user");

            } else if (command.equals("list")) { //? In progress - Need to create appropriate message if list is empty
                fredCart.list();


            } else if (command.equals("add")) { 
                // for (int i = 1; i < terms.length; i++) {
                //     // boolean found = false;
                //     // for (int j = 0; j < cart.size(); j++) {
                //     //     if (terms[i].equals(cart.get(j))) {
                //     //         found = true;
                //     //         System.out.printf("%s exists in the cart\n", terms[i]);
                //     //         break;
                //     //     }
                //     //}
                //     // if (!found) {
                //         fredCart.add(terms[i]);
                //         System.out.printf("Added %s to cart\n", terms[i]);
                //     // }
                // }

            } else if (command.equals("delete")) {  //? In progress
                System.out.println("Deleting");

            } else if (command.equals("load")) { //? Load the existing file info into an aray list
                fredCart.load();

            } else if (command.equals("save")) { //? In progress
                System.out.println("Saving");

            } else if (command.equals("exit")) {
                usingCart = false;
                break;

            } else {
                System.err.println("Please enter a valid input");
            }
        }
        System.out.printf("Thank you for using the cart \n");
    }
}
