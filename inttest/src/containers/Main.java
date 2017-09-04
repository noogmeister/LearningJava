package containers;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> manaTitles = new ArrayList<>();

        manaTitles.add("star-123");
        manaTitles.add("star-222");
        manaTitles.add("star-775");

        ArrayList<Person> javList = new ArrayList<>();

        javList.add(new Person("Sakura", "Mana", manaTitles));

        PersonContainer input = new PersonContainer(javList);
        System.out.printf(input.printList());


    }
}
