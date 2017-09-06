package containers.gui;

import containers.Person;

import javax.swing.*;
import javax.swing.border.Border;
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
    private JTextArea textArea;

    @Override
    public void run() {

        javStars = new ArrayList<>();

        // create the frame

        frame = new JFrame("Title");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        frame.setPreferredSize(new Dimension(500, 500));

        int xPos = (int) ((dim.width / 2) - (frame.getPreferredSize().getWidth() / 2));
        int yPos = (int) ((dim.height / 2) - (frame.getPreferredSize().getHeight() / 2));

        frame.setLocation(xPos, yPos);

        // frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // add the content pane to the frame

        createComponents(frame.getContentPane());


        frame.pack();
        frame.setVisible(true);

    }

    // create components for the frame, including the layout manager.

    private void createComponents(Container container) {
        JPanel panel = new JPanel(new GridLayout(3, 2));


        givenName = new JLabel("Family Name: ");
        gNameField = new JTextField(10);
        familyName = new JLabel("Given Name: ");
        fNameField = new JTextField(10);
        button = new JButton("Add!");
        textArea = new JTextArea( 10, 20);

        AddButtonListener addButton = new AddButtonListener();

        button.addActionListener(addButton);
        panel.add(givenName);
        panel.add(gNameField);
        panel.add(familyName);
        panel.add(fNameField);
        panel.add(new JLabel("Add"));
        panel.add(button);

        container.add(panel, BorderLayout.NORTH);
        container.add(textArea, BorderLayout.SOUTH);


    }

    public javax.swing.JFrame getFrame() {
        return this.frame;

    }


    private class AddButtonListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                javStars.add(new Person(gNameField, fNameField));
                textArea.append(gNameField.getText() + " " + fNameField.getText() + " is now in the list.\n");
                System.out.println(gNameField.getText() + " " + fNameField.getText() + " was added to the container.");

            }
        }
    }

}



