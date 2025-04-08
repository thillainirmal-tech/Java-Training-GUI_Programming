package com.example.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

public class SwingToolbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Swing menu and Toolbar");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//toolbar
		JToolBar toolbar = new JToolBar();
		//button
		JButton newbtn = new JButton();
	    JButton openbtn = new JButton();
	    JButton savebtn = new JButton();
	    JButton cutbtn = new JButton();
	    //window listener
	    newbtn.addActionListener(e->showMessage("New Button Clicked"));
	    openbtn.addActionListener(e->showMessage("open Button Clicked"));
	    savebtn.addActionListener(e->showMessage("save Button Clicked"));
	    cutbtn.addActionListener(e->showMessage("cut Button Clicked"));
	    toolbar.add(newbtn);
	    toolbar.add(openbtn);
	    toolbar.add(savebtn);
	    toolbar.add(cutbtn);
	    
	    frame.add(toolbar);
	    frame.setVisible(true);
	    

	}
	private static void showMessage(String msg) {
		JOptionPane.showMessageDialog(null, msg,"message",JOptionPane.INFORMATION_MESSAGE);
	}

}
