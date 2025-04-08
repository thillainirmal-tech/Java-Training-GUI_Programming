package com.example.gui;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SwingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Swing menu and Toolbar");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//menubar
		JMenuBar menubar = new JMenuBar();
		//menu
		JMenu filemenu = new JMenu("file");
		JMenu editmenu = new JMenu("edit");
		JMenu cutitems = new JMenu("cut");
		JMenu copyitems = new JMenu("copy");
		JMenu pasteitems = new JMenu("paste");
		JMenu submenu = new JMenu("submenu");
		//menuitems
		JMenuItem newitem = new JMenuItem("new");
		JMenuItem openitem = new JMenuItem("open");
		JMenuItem saveitem = new JMenuItem("save");
		JMenuItem exititem = new JMenuItem("exit");
		//menu into menuitems
		//filemenu
		filemenu.add(newitem);
		filemenu.add(openitem);
		filemenu.add(saveitem);
		filemenu.add(exititem);
		//checkbox
		JCheckBoxMenuItem checkitem = new JCheckBoxMenuItem("checkable file");
		//editmenu
		submenu.add(checkitem);
		//editmenu
		editmenu.add(cutitems);
		editmenu.add(copyitems);
		editmenu.add(pasteitems);
		editmenu.addSeparator();
		editmenu.add(submenu);
		//add into menu bar
		menubar.add(filemenu);
		menubar.add(editmenu);
		
		frame.setJMenuBar(menubar);
		frame.setVisible(true);
		
		
	
		
		

	}

}
