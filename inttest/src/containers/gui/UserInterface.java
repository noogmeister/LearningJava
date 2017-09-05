package containers.gui;

import containers.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UserInterface implements Runnable {

    private JFrame frame;
    private JButton button;
    private JLabel givenName;
    private JLabel familyName;
    private ArrayList<Person> javStars;
    private JTextField gNameField;
    private JTextField fNameField;

    @Override
    public void run() {

        javStars = new ArrayList<>();

        // create the frame

        frame = new JFrame("Title");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        frame.setSize(500, 500);

        int xPos = (dim.width / 2) - (frame.getWidth() / 2);
        int yPos = (dim.height / 2) - (frame.getHeight() / 2);

        frame.setLocation(xPos, yPos);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // add the content pane to the frame

        createComponents(frame.getContentPane());


        frame.pack();
        frame.setVisible(true);

    }

    // create components for the frame, including the layout manager.

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(5, 2);
        frame.setLayout(layout);

        givenName = new JLabel("name: ");
        gNameField = new JTextField();
        familyName = new JLabel("ID: ");
        fNameField = new JTextField();
        button = new JButton("Add!");

        AddButtonListener addButton = new AddButtonListener();

        button.addActionListener(addButton);


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
//
//
//        PersonListener listener = new PersonListener(input, gNameField, fNameField);
//        button.addActionListener(listener);

        container.add(givenName);
        container.add(gNameField);
        container.add(familyName);
        container.add(fNameField);
        container.add(new JLabel("What is supposed to go in here?"));
        container.add(button);

    }

    public javax.swing.JFrame getFrame() {
        return this.frame;

    }

    private class AddButtonListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                javStars.add(new Person(gNameField, fNameField));
                System.out.println(gNameField.getText() + " " + fNameField.getText() + " was added to the container.");

            }
        }
    }

}



