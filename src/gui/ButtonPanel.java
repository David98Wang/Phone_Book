package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.*;

public class ButtonPanel extends JPanel{
	public ButtonPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setSize(300,200);
		/*******************************************/
		JButton btnNew,btnSave,btnNextPage,btnPrevPage,btnSaveAs,btnOpen;
		
		btnNew = new JButton("New");
		btnSave = new JButton("Save");
		//btnNextPage = new JButton("Next Page");
		//btnPrevPage = new JButton("Previous Page");
		btnSaveAs = new JButton("Save As");
		btnOpen = new JButton("Open");
		
		btnNew.setSize(100,200);
		btnSaveAs.setSize(100,200);
		btnSave.setSize(100,200);
		//btnNextPage.setSize(100,200);
		//btnPrevPage.setSize(100,200);
		btnOpen.setSize(100,200);
		
		this.add(btnNew);
		this.add(btnSave);
		//this.add(btnNextPage);
		//this.add(btnPrevPage);
		this.add(btnSaveAs);
		this.add(btnOpen);
		
		btnNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		
		btnNew.setVisible(true);
		btnSaveAs.setVisible(true);
		btnSave.setVisible(true);
		//btnNextPage.setVisible(true);
		//btnPrevPage.setVisible(true);
		btnOpen.setVisible(true);
		
		//this.setSize(getMaximumSize());
		this.setVisible(true);
		System.out.println("ADDED");
	}
}
