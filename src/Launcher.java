import java.awt.event.WindowAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gui.PhoneBook;
import objects.Contact;

public class Launcher {
	public static int contactSize;
	private static String initializeSize = "SELECT COUNT(*) AS total FROM Book";
	public static Connection conn;
    public static java.sql.Statement stment;

	public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		conn = DriverManager.getConnection("jdbc:ucanaccess://PhoneBook.accdb");
		stment = conn.createStatement();
        ResultSet iniSize = stment.executeQuery(initializeSize);
        while(iniSize.next())
        	contactSize = iniSize.getInt("total");
        //get size of contact group
        //System.out.println(contactSize);
		JFrame j = new PhoneBook(contactSize,conn);
		if (System.getProperty("os.name").toLowerCase().contains("windows"))
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			
		j.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	int saveResult=JOptionPane.showConfirmDialog(j, 
			            "Do you want to save your changes?", "Save?", 
			            JOptionPane.YES_NO_CANCEL_OPTION,
			            JOptionPane.QUESTION_MESSAGE);
		        if (saveResult == JOptionPane.YES_OPTION){
		        	PhoneBook.saveResult();
		            System.exit(0);
		        } else if(saveResult == JOptionPane.NO_OPTION){
		        	System.exit(0);
		        } 
		    }
		});
		j.setSize(1000, 600);
		j.setResizable(false);// not resizable
		j.setVisible(true);// set as visible
	}
}
