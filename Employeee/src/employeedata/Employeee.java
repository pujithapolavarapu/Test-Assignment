package employeedata;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;

public class Employeee {

	private JFrame frame;
	private JTextField id;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField employeeid;
	private JTextField startdate;
	private JTextField designation;
	private JTextField department;
	private JTextField enddate;
	private JTextField status;
	private JTextField textField_9;
	private JTextField dob;
	private JTextField rm;
	private JTextField bg;
	private JTextField gender;
	private JTextField address;
	DefaultTableModel model;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employeee window = new Employeee();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Employeee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1188, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(50, 29, 60, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setBounds(29, 54, 92, 26);
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblFirstname);
		
		JLabel lblLastname = new JLabel("Lastname");
		lblLastname.setBounds(29, 91, 117, 26);
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblLastname);
		
		JLabel lblEmployeeId = new JLabel("Employee Id");
		lblEmployeeId.setBounds(14, 128, 107, 32);
		lblEmployeeId.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblEmployeeId);
		
		JLabel lblStartdate = new JLabel("Startdate");
		lblStartdate.setBounds(24, 176, 92, 26);
		lblStartdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblStartdate);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setBounds(14, 228, 103, 29);
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblDesignation);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(24, 265, 117, 35);
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblDepartment);
		
		JLabel lblEnddate = new JLabel("Enddate");
		lblEnddate.setBounds(14, 311, 117, 43);
		lblEnddate.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblEnddate);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(14, 383, 60, 14);
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblStatus);
		
		JLabel lblDesignation_1 = new JLabel("Designation");
		lblDesignation_1.setBounds(3, 408, 107, 26);
		lblDesignation_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblDesignation_1);
		
		JLabel lblDob = new JLabel("Dob");
		lblDob.setBounds(250, 103, 60, 14);
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblDob);
		
		JLabel lblReportingManager = new JLabel("Reporting manager");
		lblReportingManager.setBounds(230, 19, 138, 35);
		lblReportingManager.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblReportingManager);
		
		JLabel Iblgender = new JLabel("Gender\r\n");
		Iblgender.setBounds(260, 131, 96, 26);
		Iblgender.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(Iblgender);
		
		JLabel lblBloodGroup = new JLabel("Blood group");
		lblBloodGroup.setBounds(230, 50, 103, 35);
		lblBloodGroup.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblBloodGroup);
		
		JLabel lblAddress = new JLabel("address");
		lblAddress.setBounds(230, 172, 92, 35);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblAddress);
		
		id = new JTextField();
		id.setBounds(124, 28, 96, 20);
		frame.getContentPane().add(id);
		id.setColumns(10);
		
		firstname = new JTextField();
		firstname.setBounds(124, 59, 96, 20);
		firstname.setColumns(10);
		frame.getContentPane().add(firstname);
		
		lastname = new JTextField();
		lastname.setBounds(124, 96, 96, 20);
		lastname.setColumns(10);
		frame.getContentPane().add(lastname);
		
		employeeid = new JTextField();
		employeeid.setBounds(124, 136, 96, 20);
		employeeid.setColumns(10);
		frame.getContentPane().add(employeeid);
		
		startdate = new JTextField();
		startdate.setBounds(124, 181, 96, 20);
		startdate.setColumns(10);
		frame.getContentPane().add(startdate);
		
		designation = new JTextField();
		designation.setBounds(120, 231, 96, 20);
		designation.setColumns(10);
		frame.getContentPane().add(designation);
		
		department = new JTextField();
		department.setBounds(124, 274, 96, 20);
		department.setColumns(10);
		frame.getContentPane().add(department);
		
		enddate = new JTextField();
		enddate.setBounds(124, 324, 96, 20);
		enddate.setColumns(10);
		frame.getContentPane().add(enddate);
		
		status = new JTextField();
		status.setBounds(124, 365, 96, 20);
		status.setColumns(10);
		frame.getContentPane().add(status);
		
		textField_9 = new JTextField();
		textField_9.setBounds(124, 414, 96, 20);
		textField_9.setColumns(10);
		frame.getContentPane().add(textField_9);
		
		dob = new JTextField();
		dob.setBounds(370, 96, 96, 20);
		dob.setColumns(10);
		frame.getContentPane().add(dob);
		
		rm = new JTextField();
		rm.setBounds(370, 28, 96, 20);
		rm.setColumns(10);
		frame.getContentPane().add(rm);
		
		bg = new JTextField();
		bg.setBounds(370, 59, 96, 20);
		bg.setColumns(10);
		frame.getContentPane().add(bg);
		
		gender = new JTextField();
		gender.setBounds(370, 136, 96, 20);
		gender.setColumns(10);
		frame.getContentPane().add(gender);
		
		address = new JTextField();
		address.setBounds(370, 181, 96, 20);
		address.setColumns(10);
		frame.getContentPane().add(address);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(492, 11, 672, 454);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		model= new DefaultTableModel();
		Object[] column= {"Id","Firstname","Lastname","Employment id","Startdate","Desgination","Department","Enddate","Status","Dob","Reportingmanager","gender","bloodgroup","address"};
		final Object[] row=new Object[14];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		table.setBackground(new Color(255, 255, 0));
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("") || firstname.getText().equals("")|| lastname.getText().equals("")||employeeid.getText().equals(""))if(startdate.getText().equals("") || designation.getText().equals("")|| department.getText().equals("")|| enddate.getText().equals(""))if(status.getText().equals("") || dob.getText().equals("")|| rm.getText().equals("")||gender.getText().equals(""))if(bg.getText().equals("") || address.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"please fill complete information");
						}
				else
				    row[0]=id.getText();
				row[1]=firstname.getText();
				row[2]=lastname.getText();
				row[3]=employeeid.getText();
				row[4]=startdate.getText();
				row[5]=designation.getText();
				row[6]=department.getText();
				row[7]=enddate.getText();
				row[8]=status.getText();
				row[9]=dob.getText();
				row[10]=rm.getText();
				row[11]=gender.getText();
				row[12]=bg.getText();
				row[13]=address.getText();
				
				id.setText("");
				firstname.setText("");
				lastname.setText("");
			     employeeid.setText("");
				startdate.setText("");
				designation.setText("");
				department.setText("");
				enddate.setText("");
				status.setText("");
				dob.setText("");
				rm.setText("");
				gender.setText("");
				bg.setText("");
				address.setText("");
				JOptionPane.showMessageDialog(null,"details enteres successfully");
				model.addRow(row);
			}
		});
		btnNewButton.setBounds(230, 214, 82, 53);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int i=table.getSelectedRow();
				if(i>=0) {
				model.setValueAt(id.getText(), i, 0);
				model.setValueAt(firstname.getText(), i, 1);
				model.setValueAt(lastname.getText(), i, 2);
				model.setValueAt(employeeid.getText(), i, 3);
				model.setValueAt(startdate.getText(), i, 4);
				model.setValueAt(designation.getText(), i, 5);
				model.setValueAt(department.getText(), i, 6);
				model.setValueAt(enddate.getText(), i, 7);
				model.setValueAt(status.getText(), i, 8);
				model.setValueAt(dob.getText(), i, 9);
				model.setValueAt(rm.getText(), i, 10);
				model.setValueAt(gender.getText(), i, 11);
				model.setValueAt(bg.getText(), i, 12);
				model.setValueAt(address.getText(), i, 13);
				JOptionPane.showMessageDialog(null, "updated suucessfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "please select a row first");
				}
				model.addRow(row);
			}
		});
		btnNewButton_1.setBounds(322, 252, 103, 57);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i>=0)
				{
				model.removeRow(i);
				JOptionPane.showMessageDialog(null, "deleted suucessfully");
			}
				else
				{
					JOptionPane.showMessageDialog(null, "please select a row first");
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(230, 306, 126, 48);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				firstname.setText("");
				lastname.setText("");
			     employeeid.setText("");
				startdate.setText("");
				designation.setText("");
				department.setText("");
				enddate.setText("");
				status.setText("");
				dob.setText("");
				rm.setText("");
				gender.setText("");
				bg.setText("");
				address.setText("");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(244, 362, 126, 53);
		frame.getContentPane().add(btnNewButton_3);
	}
}
