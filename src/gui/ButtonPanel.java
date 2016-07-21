package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.*;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class ButtonPanel extends JPanel{
	public ButtonPanel() {
		this.setSize(90,123);
		/*******************************************/
		JButton btnNew,btnSave,btnNextPage,btnPrevPage,btnSaveAs,btnOpen;
		setLayout(new MigLayout("", "[120px]", "[23px][23px][23px][12px]"));
		btnSave = new JButton("Save");
		this.add(btnSave, "cell 0 2,alignx center,aligny top");
		btnSave.setVisible(true);
		//btnNextPage = new JButton("Next Page");
		//btnPrevPage = new JButton("Previous Page");
		btnSaveAs = new JButton("Save As");
		this.add(btnSaveAs, "cell 0 1,alignx center,aligny top");
		btnSaveAs.setVisible(true);
		btnOpen = new JButton("Open");
		this.add(btnOpen, "cell 0 0,alignx center,aligny top");
		//btnNextPage.setVisible(true);
		//btnPrevPage.setVisible(true);
		btnOpen.setVisible(true);
		
		btnNew = new JButton("New");
		this.add(btnNew, "cell 0 3,grow");
		
		btnNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		
		btnNew.setVisible(true);
		System.out.println("ADDED");
	}
}
