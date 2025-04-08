package com.example.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class SwingAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		String[] colnames = {"Task","Category","Priorty","Completion"};
		Object[][] data = {{"Task1","Work","High",30},{"Task2","Personal1","Medium",60},
				{"Task3","Work","Low",70}};
		//table
		JTable tasktable = new JTable(new DefaultTableModel(data,colnames));
		//scrollPane
		JScrollPane taskscrollpane = new JScrollPane(tasktable);
		//tree
		//root
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Category");
		DefaultMutableTreeNode Worknode = new DefaultMutableTreeNode("Work");
		DefaultMutableTreeNode personalnode = new DefaultMutableTreeNode("personal");
		root.add(personalnode);
		root.add(Worknode);
		JTree tasktree = new JTree(root);
		JScrollPane treescrollpane = new JScrollPane(tasktree);
		//list
		String[] priortylevels = {"High","Medium","Low"};
		JList<String> priortylist = new JList<>(priortylevels);
		JScrollPane listscrollpane = new JScrollPane(priortylist);
		//tabbedpane
		JTabbedPane tabpane = new JTabbedPane();
		tabpane.addTab("All tasks", taskscrollpane);
		tabpane.addTab("Category", treescrollpane);
		tabpane.addTab("PriortyList", listscrollpane);
		//progressbar
		JProgressBar progress = new JProgressBar();
		progress.setStringPainted(true);
		//slider
		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(25);
		slider.setMinorTickSpacing(6);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		//spinnermodel
		SpinnerModel spinner = new SpinnerNumberModel(3,0,10,1);
		//spinner
		JSpinner taskspinner = new JSpinner(spinner);
		//layout
		frame.setLayout(new BorderLayout());
		frame.add(tabpane,BorderLayout.CENTER);
		frame.add(createpriortypanel(slider),BorderLayout.SOUTH);
		frame.add(createprogresspanel(slider),BorderLayout.NORTH);
		frame.add(createspinnerpanel(taskspinner),BorderLayout.EAST);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
		
}
	private static JPanel createpriortypanel(JSlider slider) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(new JLabel("Task priorty"));
		panel.add(slider);
		return panel;
	}
	private static JPanel createprogresspanel(JSlider slider) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(new JLabel("Category"));
		panel.add(slider);
		return panel;
		
	}
	private static JPanel createspinnerpanel(JSpinner taskspinner) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(new JLabel("completion"));
		panel.add(taskspinner);
		return panel;
	}
}