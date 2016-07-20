package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.filechooser.FileFilter;

import objects.Contact;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

public class PhoneBook extends JFrame {
	static int bookSize;
    public static void saveResult(){
    	
    }
	public PhoneBook(int s,Connection c) throws SQLException, ClassNotFoundException{
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLayout(new GridLayout());
		JPanel tablePanel = new TablePanel();
		JPanel buttonPanel = new ButtonPanel();
		bookSize = s;
		this.add(buttonPanel);
		//this.add(tablePanel);
		this.setSize(getMaximumSize());
		
		this.pack();
		this.setVisible(true);
	}
}
