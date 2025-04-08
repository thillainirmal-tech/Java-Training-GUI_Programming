package com.example.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingBasic {

    public static void main(String[] args) {
        JFrame frame = new JFrame("User Registration");

        // Labels
        JLabel name = new JLabel("Name:");
        JLabel email = new JLabel("Email:");
        JLabel password = new JLabel("Password:");
        JLabel gender = new JLabel("Gender:");
        JLabel interestLabel = new JLabel("Interests:");

        // Text Fields
        JTextField nametext = new JTextField();
        JTextField emailtext = new JTextField();
        JPasswordField passwordtext = new JPasswordField();

        // Radio Buttons
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        // Checkboxes
        JCheckBox programmingCheckBox = new JCheckBox("Programming");
        JCheckBox readingCheckBox = new JCheckBox("Reading");
        JCheckBox travellingCheckBox = new JCheckBox("Travelling");

        // Submit Button
        JButton submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nametext.getText();
                String email = emailtext.getText();
                String password = new String(passwordtext.getPassword()); // secure way to get password
                String gender = male.isSelected() ? "Male" : "Female";

                String interest = "";
                if (programmingCheckBox.isSelected()) {
                    interest += "Programming ";
                }
                if (readingCheckBox.isSelected()) {
                    interest += "Reading ";
                }
                if (travellingCheckBox.isSelected()) {
                    interest += "Travelling ";
                }

                String message = "Name: " + name + "\nEmail: " + email + "\nPassword: " + password +
                                 "\nGender: " + gender + "\nInterests: " + interest.trim();
                JOptionPane.showMessageDialog(frame, message, "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Layout
        JPanel panel = new JPanel(new GridLayout(9, 2, 10, 10));
        panel.add(name);
        panel.add(nametext);
        panel.add(email);
        panel.add(emailtext);
        panel.add(password);
        panel.add(passwordtext);
        panel.add(gender);
        panel.add(new JLabel());
        panel.add(male);
        panel.add(female);
        panel.add(interestLabel);
        panel.add(new JLabel());
        panel.add(programmingCheckBox);
        panel.add(readingCheckBox);
        panel.add(travellingCheckBox);
        panel.add(new JLabel());  // Spacer
        panel.add(submit);

        // Frame settings
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
