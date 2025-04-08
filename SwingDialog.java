package com.example.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SwingDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(()->{
			JFrame frame = new JFrame("Swing Dialog Application");
			frame.setSize(400,300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JButton filechooser = new JButton("show file chosen Dialog");
			filechooser.addActionListener(e->showfilechooser(frame));
			JPanel panel = new JPanel(new FlowLayout());
			panel.add(filechooser);
			frame.add(panel);
			frame.setVisible(true);
			
		});

	}

	private static void showfilechooser(JFrame frame) {
		// TODO Auto-generated method stub
		JFileChooser file = new JFileChooser();
		int result = file.showOpenDialog(frame);
		if(result == JFileChooser.APPROVE_OPTION) {
			File selectedfile = file.getSelectedFile();
			JOptionPane.showMessageDialog(frame,selectedfile.getAbsolutePath(),"Selected File",JOptionPane.INFORMATION_MESSAGE);
			
		}
		else {
	
			JPanel panel = new JPanel();
			JOptionPane.showMessageDialog(frame,"Selected File Cancelled","file",JOptionPane.INFORMATION_MESSAGE);
			JButton colorchooser = new JButton("Show Colour chooser Dialog");
			colorchooser.addActionListener(e->showcolorchooser(frame));
			panel.add(colorchooser);
		}
	}

	private static void showcolorchooser(JFrame frame) {
		// TODO Auto-generated method stub
		Color selectedcolor = JColorChooser.showDialog(frame,"choose a colour",Color.RED);
		if(selectedcolor != null) {
			JOptionPane.showMessageDialog(frame,"Selected colour"+selectedcolor,"color chooser",JOptionPane.INFORMATION_MESSAGE);
			
		}
		else {
			JOptionPane.showMessageDialog(frame, "Selected color cancelled"+selectedcolor,"color chooser",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}
