package containers;


import containers.gui.UserInterface;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);


//        ArrayList<String> manaTitles = new ArrayList<>();
//
//        manaTitles.add("star-123");
//        manaTitles.add("star-222");
//        manaTitles.add("star-775");
//
//        ArrayList<Person> javList = new ArrayList<>();
//
//        javList.add(new Person("Sakura", "Mana", manaTitles));
//
//        PersonContainer input = new PersonContainer(javList);
//        System.out.printf(input.printList()); // prints out everyone in the list (each persons toString).
//        System.out.println(input.search("Sakura")); // prints out the Person toString.
//        System.out.println(input.search("Airi"));


    }
}
