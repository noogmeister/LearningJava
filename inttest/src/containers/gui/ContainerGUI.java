package containers.gui;

import javax.swing.*;
import java.awt.*;

public class ContainerGUI extends JFrame {

    private JPanel mainPanel;
    private JLabel gNameLabel;
    private JLabel fNameLabel;

    public ContainerGUI() {
        super("Test GUI");

        // create main panel
        GridLayout mainLayout = new GridLayout(1, 3);
        mainPanel = new JPanel(mainLayout);

        gNameLabel = new JLabel("Given Name: ");

        fNameLabel = new JLabel("Family Name: ");

        add(mainPanel);

        // create name panel (two labels, and two text fields)
        BoxLayout nameBoxes = new BoxLayout()
        JPanel namesPanel = new JPanel(nameBoxes);

        // create comment area panel (
        // one text field, which displays the comments, and has a save changes button).

        // create movie list panel that lists all the movies the selected actor has made, and has an add new movie button.


    }
}
