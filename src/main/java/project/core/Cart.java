package project.core;

import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors
import java.nio.Buffer;
import java.io.BufferedReader;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files

public class Cart {
    // ? Properties (Members of class)
    public User user;
    // public String cartItem;

    // ? Constructor
    public Cart(User user) {
        this.user = user; // ? Initialise name to whatever value you pass it in
        // System.out.printf("Instantiating new cart object for user %s \n", user);
    }

    // ? Generate Getter & Setter

    // ? Behavior

    public void list() {
        // String pathName = "/Users/chrysalis/VTTP-Program/project1/shoppingcart/" +
        // user.name + ".cart";

        // try {
        // File cartReader = new File(pathName);
        // Scanner reader = new Scanner(cartReader);
        // while (reader.hasNextLine()) {
        // String data = reader.nextLine();
        // System.out.println(data);
        // }
        // reader.close();
        // } catch (FileNotFoundException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }
    }

    public void add() {
        for (int i = 1; i < terms.length; i++) {
            user.name.add(terms[i]);
            System.out.printf("Added %s to cart\n", terms[i]);
        }
    }

    public void delete() {
        System.out.println("Delete....");

    }

    public List<String> load() {
        String pathName = "./shoppingcart/" + user.name + ".cart";
        // list that holds strings of a file
        List<String> listOfStrings = new ArrayList<String>();

        try {
            File cartReader = new File(pathName);
            Scanner reader = new Scanner(cartReader);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                listOfStrings.add(data);
            }
            reader.close();
            return listOfStrings;
        
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return listOfStrings;

    }

    public void save() {
        System.out.println("Save....");

    }

    public void exit() {
        System.out.println("Exit....");

    }
}
