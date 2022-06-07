package project.core;

import java.io.File; //? Import the File class
import java.io.IOException; //? Import the IOException class to handle errors

public class User {
    // ? Properties (Members of class)
    public String name;

    // ? Constructor
    public User(String name) {
            this.name = name; // ? Initialise name to whatever value you pass it in
        }

    // ? Generate Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ? Behavior
    public void create(String name) {
        String pathName = "/Users/chrysalis/VTTP-Program/project1/shoppingcart/" + name + ".cart";

        try {
            File userFile = new File(pathName);
            if (userFile.createNewFile()) {
                System.out.println("File created: " + userFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
