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

import java.awt.Font;
import java.io.File;

public class PhoneBook extends JFrame {
	private JTextField tfName;
	private JTextField tfPhone;
	private JTextField tfEmail;
	private JTextField tfAddress;
	static People contact[] = new People[100];
	static People temp = new People("", "", "", "");
	static int currentAt = 0;
	static int maxN = 0;
	static JFrame err = new JFrame();
	File dat;
	public PhoneBook() {
		getContentPane().setLayout(null);

		JPanel info = new JPanel();
		info.setBounds(0, 0, 284, 112);
		getContentPane().add(info);
		info.setLayout(null);

		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblName.setBounds(42, 10, 60, 14);
		info.add(lblName);

		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPhone.setBounds(42, 35, 60, 14);
		info.add(lblPhone);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEmail.setBounds(42, 60, 60, 14);
		info.add(lblEmail);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblAddress.setBounds(42, 85, 60, 14);
		info.add(lblAddress);
		/***************************************************************************/
		tfName = new JTextField();
		tfName.setBounds(115, 10, 125, 20);
		info.add(tfName);
		tfName.setColumns(10);

		tfPhone = new JTextField();
		tfPhone.setBounds(115, 35, 125, 20);
		info.add(tfPhone);
		tfPhone.setColumns(10);

		tfEmail = new JTextField();
		tfEmail.setBounds(115, 60, 125, 20);
		info.add(tfEmail);
		tfEmail.setColumns(10);

		tfAddress = new JTextField();
		tfAddress.setBounds(115, 85, 125, 20);
		info.add(tfAddress);
		tfAddress.setColumns(10);
		/***************************************************************************/

		JPanel btn = new JPanel();
		btn.setBounds(0, 112, 284, 110);
		getContentPane().add(btn);
		btn.setLayout(null);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnUpdate
				.setToolTipText("Change informtion entered in textfields above to current contact. Resort after update information");
		btnUpdate.setBounds(12, 5, 80, 23);
		btn.add(btnUpdate);
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSave.setToolTipText("Save information entered in textfields above as a new contact. Resort after saved information");
		btnSave.setBounds(102, 5, 80, 23);
		btn.add(btnSave);

		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnDelete.setToolTipText("Delete current contact");
		btnDelete.setBounds(192, 5, 80, 23);
		btn.add(btnDelete);

		JButton btnPrev = new JButton("<<<<<");
		btnPrev.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnPrev.setToolTipText("Go to previous contact (sorted in alphabetical order)");
		btnPrev.setBounds(12, 39, 80, 23);
		btn.add(btnPrev);

		JButton btnNext = new JButton(">>>>>");
		btnNext.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNext.setToolTipText("Go to next contact(alphabetical order)");
		btnNext.setBounds(192, 39, 80, 23);
		btn.add(btnNext);

		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnClear.setToolTipText("Press to clear all text field display above");
		btnClear.setBounds(102, 39, 80, 23);
		btn.add(btnClear);
		
		JButton btnSaveFile = new JButton("Save File");
		btnSaveFile.setBounds(12, 73, 126, 23);
		btn.add(btnSaveFile);
		
		JButton btnOpenFile = new JButton("Open File");
		btnOpenFile.setBounds(150, 73, 122, 23);
		btn.add(btnOpenFile);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tfName.getText().compareTo("") == 0) {
					msgBox("Please Enter Name");
					return;
				}
				temp.setName(tfName.getName());
				if (tfPhone.getText().compareTo("") == 0) {
					msgBox("Please Enter Phone");
					return;
				}
				temp.setPhone(tfPhone.getText());
				if (tfEmail.getText().compareTo("") == 0) {
					msgBox("Please Enter Email");
					return;
				}
				temp.setEmail(tfEmail.getText());
				if (tfAddress.getText().compareTo("") == 0) {
					msgBox("Please Enter Address");
					return;
				}
				temp.setAddress(tfAddress.getText());
				contact[currentAt] = new People(" ", " ", " ", " ");
				saveNewName();
				System.out.println("name inserted");
				msgBox("Contact Saved");
				maxN++;
				currentAt++;
				tfName.setText("");
				tfPhone.setText("");
				tfEmail.setText("");
				tfAddress.setText("");
				System.out.println("asdf");
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			// when button 'update' is pressed
			@Override
			public void actionPerformed(ActionEvent e) {
				contact[currentAt].setName(tfName.getText());
				contact[currentAt].setPhone(tfPhone.getText());
				contact[currentAt].setEmail(tfEmail.getText());
				contact[currentAt].setAddress(tfAddress.getText());
				msgBox("Contact Updated.");
			}
		});
		btnPrev.addActionListener(new ActionListener() {
			// when 'button' previous is pressed
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentAt == 0)
				{
					errorMsg("This is already the first contact");
					return;
				}
				tfName.setEditable(false);
				tfPhone.setEditable(false);
				tfEmail.setEditable(false);
				tfAddress.setEditable(false);
				currentAt--;
				tfName.setText(contact[currentAt].getName());// set name as previous name
				tfEmail.setText(contact[currentAt].getEmail());// set email as previous email
				tfPhone.setText(contact[currentAt].getPhone());
				// set phone as previous phone
				tfAddress.setText(contact[currentAt].getAddress());// set addresses previous address
			}
		});
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(currentAt==maxN)
				{
					errorMsg("This is already the last contact");
					return;
				}
				tfName.setEditable(false);
				tfPhone.setEditable(false);
				tfEmail.setEditable(false);
				tfAddress.setEditable(false);
				currentAt++;
				tfName.setText(contact[currentAt].getName());// set name as previous name
				tfEmail.setText(contact[currentAt].getEmail());// set email as previous email
				tfPhone.setText(contact[currentAt].getPhone());
				// set phone as previous phone
				tfAddress.setText(contact[currentAt].getAddress());// set addresses previous address
			}
		});
		btnOpenFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.setFileFilter(new FileFilter() {
					//can only choose txt file
			        public boolean accept(File f) {
			          return f.getName().toLowerCase().endsWith(".txt")
			              || f.isDirectory();
			        }
			        public String getDescription() {
			          return "*.dat";
			        }
			      });
				if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {	
				    dat = chooser.getSelectedFile();
				    if(!dat.getName().toLowerCase().endsWith(".dat"))
				    	errorMsg("Invalid File Type");
				}
			}
		});
	}
	/**
	 * Show error message
	 * @param msg
	 */
	public static void errorMsg(String msg)
	{
	    JOptionPane.showMessageDialog(err, msg, "ERROR",JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * Save a new contact and sort phone book
	 */
	public static void saveNewName() {

		for (int i = 0; i <= maxN; i++) {
			if (contact[i].getName().compareTo("") == 0) {
				contact[i].setName(temp.getName());
				contact[i].setPhone(temp.getPhone());
				contact[i].setEmail(temp.getEmail());
				contact[i].setAddress(temp.getAddress());
				return;
			}
			else if(contact[i].getName().compareTo(temp.getName())>0)
			{
				for(int j=i+1;j<=maxN;j++)
				{
					contact[j+1]=contact[j];
				}
				contact[i]=temp;
			}
		}
	}

	/**
	 * Pop up message box
	 * 
	 * @param message
	 */
	public static void msgBox(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	public static void main(String[] args) {
		for(int i=0;i<100;i++)
		{
			contact[i]=new People();
		}
		JFrame j = new PhoneBook();
		j.setSize(300, 260);// set size of window
		j.setResizable(false);// not resizable
		j.setLocation(688 - 150, 360 - 115);
		j.setVisible(true);// set as visible

	}
}
