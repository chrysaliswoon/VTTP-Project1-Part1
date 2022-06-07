package project.core;

import java.io.Console;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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
        Boolean usingCart = true;

        while (usingCart) {
            System.out.printf("Welcome to the shopping cart \n");
            String userInput = cons.readLine("> ");
            String[] terms = userInput.split(" "); // ? Split returns an array of string
            String command = terms[0];
            List<String> cart = fredCart.load();



            if (command.equals("create")) {   //! Create not working
                System.out.printf("Enter a new user \n");
                String createUser = cons.readLine("> ");
                // User newUser = new User(createUser);
                // newUser.create();

            } else if (command.equals("list")) { //? In progress - Need to create appropriate message if list is empty
                fredCart.list();


            } else if (command.equals("add")) { 
                fredCart.add();

            } else if (command.equals("delete")) {  //? In progress
                System.out.println("Deleting");

            } else if (command.equals("load")) { //? Load the existing file info into an aray list
                System.out.println(cart);


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
