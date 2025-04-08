package com.example.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stubi98
		Frame frame = new Frame("Awt Layout Application");
		frame.setSize(400,300);
		frame.setVisible(true);
		//handle closing
		frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
		//flowlayout
		FlowLayout flowobj = new FlowLayout();
		//panel
		Panel flowpanel = new Panel(flowobj);
		//add components
		flowpanel.add(new Button("Button1"));
		flowpanel.add(new Button("Button2"));
		flowpanel.add(new Button("Button3"));
		frame.add(flowpanel);
		//border layout
		BorderLayout borderobj = new BorderLayout();
		frame.setLayout(borderobj);
		
		Button button6 = new Button("Button6");
		Button button5 = new Button("Button5");
		Button button4 = new Button("Button4");
		
		frame.add(button6,BorderLayout.NORTH);
		frame.add(button5,BorderLayout.SOUTH);
		frame.add(button4,BorderLayout.EAST);
		//gridlayout
		GridLayout grid = new GridLayout(2,2);
		Panel gridpanel = new Panel();
		
		gridpanel.add(new Button("Button9"));
		gridpanel.add(new Button("Button8"));
		gridpanel.add(new Button("Button7"));
		frame.add(gridpanel);
		
		
		
		
		

	}

}
