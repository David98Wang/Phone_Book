package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.*;
import java.awt.FlowLayout;

public class ButtonPanel extends JPanel{
	public ButtonPanel() {
		this.setSize(120,123);
		/*******************************************/
		JButton btnNew,btnSave,btnNextPage,btnPrevPage,btnSaveAs,btnOpen;
		
		btnNew = new JButton("New");
		//btnNextPage = new JButton("Next Page");
		//btnPrevPage = new JButton("Previous Page");
		btnSaveAs = new JButton("Save As");
		
		btnNew.setSize(100,200);
		btnSaveAs.setSize(100,200);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.add(btnNew);
		btnOpen = new JButton("Open");
		//btnNextPage.setSize(100,200);
		//btnPrevPage.setSize(100,200);
		btnOpen.setSize(100,200);
		this.add(btnOpen);
		//btnNextPage.setVisible(true);
		//btnPrevPage.setVisible(true);
		btnOpen.setVisible(true);
		//this.add(btnNextPage);
		//this.add(btnPrevPage);
		this.add(btnSaveAs);
		btnSave = new JButton("Save");
		btnSave.setSize(100,200);
		this.add(btnSave);
		btnSave.setVisible(true);
		
		btnNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		
		btnNew.setVisible(true);
		btnSaveAs.setVisible(true);
		System.out.println("ADDED");
	}
}
