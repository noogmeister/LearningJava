package containers;

import javax.swing.*;
import java.util.ArrayList;

public class Person {

    private String givenName;
    private String familyName;
    private ArrayList<String> titlesMade;

    public Person (JTextField gName, JTextField fName) {
        this.givenName = gName.getText();
        this.familyName = fName.getText();
        this.titlesMade = new ArrayList<>();

    }

    public Person(String gName, String fName, ArrayList<String> titlesMade) {
        this.givenName = gName;
        this.familyName = fName;
        this.titlesMade = titlesMade;

    }

    // Getters and Setters

    public String getGivenName() {
        return this.givenName;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public ArrayList<String> getTitlesMade() {
        return this.titlesMade;

    }

    @Override
    public String toString() {

        String string = String.format("%-11s %s %14s %s","Given Name:", this.givenName, "Family Name:", this.familyName);
        String formatted = String.format("%10s", string);

        int count = 1;
        for (String s : this.titlesMade) {

            formatted += String.format("%-3s %d %20s", "\nTitle:", count, s);

            count++;
            System.out.println();

        }
        return formatted;
    }


}
