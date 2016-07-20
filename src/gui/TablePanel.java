package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.lang.reflect.GenericArrayType;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import quick.dbtable.*;

import java.sql.*;

public class TablePanel extends JPanel{
	//static JTable table;
	static String[] ColumnNames = {"Name","Address","Phone","Email"};
	static Object data[][];
	static int ContentSize;
	private static Connection conn;
	private static java.sql.Statement stment;
	public TablePanel() throws SQLException, ClassNotFoundException{
		
		DBTable table = new DBTable();
		
		table.setJdbcUrl("jdbc:ucanaccess://PhoneBook.accdb");
		table.setSelectSql("SELECT * FROM Book");
		table.setControlPanelVisible(true);
		
		table.connectDatabase();
		table.refresh();
		
		//table.
		this.add(table);
		this.setSize(500,600);
		//		this.setLayout(new BorderLayout());
//        initializeTable();
//        
//        JScrollPane tableContainer = new JScrollPane(table);
//        this.add(tableContainer,BorderLayout.CENTER);

        
        
	}
//	public static void initializeTable() throws SQLException{
//		data = new Object[ContentSize][4];
//		String str = "SELECT * FROM Book";
//		ResultSet rst = stment.executeQuery(str);
//		int cur = 0;
//		while(rst.next()){
//			for(int i=1;i<5;i++){
//				data[cur][i-1]=rst.getObject(i+1);
//			}
//			++cur;
//		}
//		table = new JTable(data, ColumnNames);
//		table.setEnabled(false);
//		table.setFont(new Font("Times New Rome",Font.PLAIN,20));
//		table.setRowHeight(25);
//		
//		for(int i=0;i<cur;i++)
//			System.out.println(data[i][0]+""+data[i][1]+""+data[i][2]);
//	}
}
