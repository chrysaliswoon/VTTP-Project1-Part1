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

public class Cart implements CartControllable {
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
        String pathName = "/Users/chrysalis/VTTP-Program/project1/shoppingcart/" + user.name + ".cart";

        try {
            File cartReader = new File(pathName);
            Scanner reader = new Scanner(cartReader);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void add() {
        // String pathName = "/Users/chrysalis/VTTP-Program/project1/shoppingcart/" + user.name + ".cart";

        // try {
        //     FileWriter cartWriter = new FileWriter(pathName);
        //     System.out.println("Writing content to the cart file.");
        //     cartWriter.write(cartItem);
        //     cartWriter.close();
        //     System.out.println("Successfully added to the cart file.");
        // } catch (IOException e) {
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        // }

    }

    public void delete() {
        System.out.println("Delete....");

    }

    public void load() {
        String pathName = "/Users/chrysalis/VTTP-Program/project1/shoppingcart/" + user.name + ".cart";

        // try (BufferedReader reader = new BufferedReader(
        //     new FileReader(pathName))) {
        //         while (reader.ready()) {
        //             cart.add(reader.readLine());
        //         }
        //     }
        //     catch (IOException e) {
        //         e.printStackTrace();
        //     }
    }

    public void save() {
        System.out.println("Save....");

    }

    public void exit() {
        System.out.println("Exit....");

    }
}
