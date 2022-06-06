package project.core;

import java.util.HashMap;
import java.util.Scanner; // Import the Scanner class

public class Main {
    public static void main(String[] args)

    {
        // ? Create a HashMap object called usersList
        HashMap<Integer, String> usersList = new HashMap<Integer, String>();

        // ? Add keys and values (Key, Value)
        usersList.put(1, "fred");
        usersList.put(2, "delan");
        usersList.put(3, "kk");
        usersList.put(4, "chrys");
        usersList.put(5, "wy");
        usersList.put(6, "joy");
        usersList.put(7, "ivan");
        usersList.put(8, "simon");
        usersList.put(9, "michael");
        usersList.put(10, "caleb");
        // String createUser = usersList.get(1);

        // ? Instantiate a new User
        // User userName = new User(createUser);
        User fred = new User("fred");
        // ? Instantiate a new Cart
        // Cart userCart = new Cart (createUser);
        Cart fredCart = new Cart(fred);
        // Cart delanCart = new Cart(delan);

        // ? Runs the method
        // chrys.create();
        // fredCart.add();

        Scanner scanner = new Scanner(System.in);
        Boolean useCart = true;

        while (useCart == true) {
            System.out.printf("Welcome to the shopping cart \n");
            String userInput = scanner.nextLine();

            if (userInput.equals("create")) {
                System.out.println("Creating new user");

            } else if (userInput.equals("list")) {
                fredCart.list();

            } else if (userInput.equals("add")) {
                System.out.println("Adding item");

            } else if (userInput.equals("delete")) {
                System.out.println("Deleting");
            } else if (userInput.equals("load")) {
                System.out.println("Loading...");
            } else if (userInput.equals("save")) {
                System.out.println("Saving");
            } else if (userInput.equals("exit")){
                useCart = false;
                break;
            } else {
                System.err.println("Please enter a valid input");
            }
        }
        System.out.printf("Thank you for using the cart \n");
    }
}
