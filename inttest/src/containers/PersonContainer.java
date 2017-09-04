package containers;

import java.util.ArrayList;

public class PersonContainer {

    private ArrayList<Person> list;


    public PersonContainer(ArrayList<Person> listToBeAdded) {
        this.list = listToBeAdded;

    }

    public void add(Person input) {
        this.list.add(input);
    }


    public boolean isInContainer(Person p) {

        return this.list.contains(p);

    }

    public String printList() {
        String s = "";
        int count = 1;
        for (Person p : this.list) {

            s += "Actor: " + count + "\n" + p.toString();
            count++;
        }
        return s;
    }

}
