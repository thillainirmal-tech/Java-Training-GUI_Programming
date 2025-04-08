package com.example.gui;

import java.awt.*;
import java.awt.event.*;

public class AwtApplication {

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(400, 400);
        frame.setLayout(null); // Important for setBounds to work
        frame.setVisible(true);

        // Window Listener
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        // Label
        Label label = new Label("Name: ");
        label.setBounds(50, 50, 50, 20);
        frame.add(label);

        // Text Field
        TextField text = new TextField();
        text.setBounds(110, 50, 150, 20);
        frame.add(text);

        // Button
        Button btn = new Button("Submit");
        btn.setBounds(110, 90, 100, 30);
        frame.add(btn);

        // Checkbox
        Checkbox chk = new Checkbox("I agree to terms and conditions");
        chk.setBounds(110, 130, 200, 20);
        frame.add(chk);

        // Radio Buttons
        CheckboxGroup chk_group = new CheckboxGroup();
        Checkbox radio1 = new Checkbox("Option 1", chk_group, false);
        Checkbox radio2 = new Checkbox("Option 2", chk_group, false);
        radio1.setBounds(110, 160, 100, 20);
        radio2.setBounds(220, 160, 100, 20);
        frame.add(radio1);
        frame.add(radio2);

        // List
        List l1 = new List();
        l1.setBounds(110, 190, 120, 80);
        l1.add("Laptop");
        l1.add("Mouse");
        l1.add("Smartphone");
        frame.add(l1);

        // Scrollbar
        Scrollbar sb = new Scrollbar();
        sb.setBounds(250, 190, 20, 80);
        frame.add(sb);
    }
}

