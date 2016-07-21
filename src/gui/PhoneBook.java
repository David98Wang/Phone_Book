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
import java.awt.FlowLayout;
import java.awt.Dimension;
import net.miginfocom.swing.MigLayout;

public class PhoneBook extends JFrame {
	static int bookSize;
    public static void saveResult(){
    	
    }
	public PhoneBook(int s,Connection c) throws SQLException, ClassNotFoundException{
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		bookSize = s;
		getContentPane().setLayout(new MigLayout("", "[1px][452px][][][]", "[427px]"));
		JPanel buttonPanel = new ButtonPanel();
		getContentPane().add(buttonPanel, "cell 0 0,alignx left,aligny center");
		buttonPanel.setLayout(null);
		//JPanel tablePanel = new TablePanel();
		//getContentPane().add(tablePanel, "cell 28 0 1 18,alignx left,aligny top");
		this.setSize(new Dimension(1000, 600));
		
		quick.dbtable.DBTable table = new quick.dbtable.DBTable();
		
		table.setJdbcUrl("jdbc:ucanaccess://PhoneBook.accdb");
		table.setSelectSql("SELECT * FROM Book");
		table.setControlPanelVisible(false);
		
		table.connectDatabase();
		table.refresh();
		
		//table.
		getContentPane().add(table, "cell 4 0,alignx left,aligny top");
		
		//this.pack();
		this.setVisible(true);
	}
}
