package com.example.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDialogExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JButton dialogbtn = new JButton("Show custom Dialog");
		dialogbtn.addActionListener(e->showCustomdialog(frame));
		frame.add(dialogbtn);
		frame.setSize(400,300);
		frame.setVisible(true);
		

	}

	private static void showCustomdialog(JFrame frame) {
		// TODO Auto-generated method stub
		JDialog customdialog = new JDialog(frame,"custom dialog",true);
		customdialog.setSize(300,200);
		JLabel label = new JLabel("This is a custom dialog");
		JButton closebtn = new JButton("close");
		closebtn.addActionListener(e->customdialog.dispose());
		customdialog.setLayout(new BorderLayout());
		customdialog.add(label,BorderLayout.CENTER);
		customdialog.add(closebtn,BorderLayout.WEST);
		customdialog.setVisible(true);
	}

}
