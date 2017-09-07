package containers.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    JTextArea textArea;

    public MyPanel(ActionListener e, JTextArea textArea) {
        super(new GridLayout(3, 2));
        this.textArea = textArea;
        createComponents();


    }

    public void createComponents() {
        add(new JLabel("data: "));
        add(new JTextField(10));
        add(new JLabel("age"));
        add(new JTextField(10));
        add(new JLabel("text area: "));
        add(textArea);

    }
}
