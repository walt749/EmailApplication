
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmailApp extends JFrame {

	

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField txtTher;
	private JTextField textField_4;
	private JLabel lblPassword;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel lblCompany;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private JLabel lblDepartment;
	private JButton btnNewButton_1;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private Statement state;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws SQLException {
		
		final Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Email", "student" , "student");
		final Statement myStmt = myConn.createStatement();
		ResultSet myRs = null;
		
		//myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Email", "student" , "student");
		//myStmt = myConn.createStatement();
		myRs = myStmt.executeQuery("select * from Email");

		while (myRs.next()) {
			System.out.println(myRs.getString("First_name") + ", ");
		
		}  
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmailApp frame = new EmailApp();
					frame.setVisible(true);
					frame.setStatement(myStmt);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmailApp() {
	//	setUndecorated(true);
		
		Email email = new Email();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 542);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 136, 186 ));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(206, 34, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.getText();
		
		textField_1 = new JTextField();
		textField_1.setBounds(206, 76, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(206, 221, 146, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		
		
		txtTher = new JTextField();
		txtTher.setEditable(false);
		txtTher.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTher.setBounds(114, 360, 313, 37);
		contentPane.add(txtTher);
		txtTher.setColumns(10);
		
		JLabel lblYourEmail = new JLabel("Your Email");
		lblYourEmail.setBounds(32, 372, 93, 20);
		contentPane.add(lblYourEmail);
		
		
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setEditable(false);
		textField_4.setBounds(114, 433, 277, 37);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblPassword = new JLabel("password:");
		lblPassword.setBounds(33, 442, 78, 20);
		contentPane.add(lblPassword);
		
		lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(99, 37, 92, 20);
		contentPane.add(lblFirstName);
		
		lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(99, 79, 84, 20);
		contentPane.add(lblLastName);
		
		lblCompany = new JLabel("Company Name");
		lblCompany.setBounds(75, 224, 126, 20);
		contentPane.add(lblCompany);
		
		btnNewButton = new JButton("Accounting");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				email.setDeparment("accounting");
			}
		});
		btnNewButton.setBounds(32, 143, 115, 29);
		contentPane.add(btnNewButton);
		
		btnNewButton_2 = new JButton("Sales");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				email.setDeparment("sales");
			}
		});
		btnNewButton_2.setBounds(32, 179, 115, 29);
		contentPane.add(btnNewButton_2);
		
		lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(156, 122, 102, 20);
		contentPane.add(lblDepartment);
		
		btnNewButton_1 = new JButton("Technology");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				email.setDeparment("technology");
			}
		});
		btnNewButton_1.setBounds(162, 143, 115, 29);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_3 = new JButton("Marketing");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				email.setDeparment("marketing");
			}
		});
		btnNewButton_3.setBounds(162, 179, 115, 29);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("HR");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				email.setDeparment("hr");
			}
		});
		btnNewButton_4.setBounds(292, 143, 115, 29);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Purchasing");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				email.setDeparment("purchasing");
			}
		});
		btnNewButton_5.setBounds(292, 179, 115, 29);
		contentPane.add(btnNewButton_5);
		
		JButton btnGetNewEmail = new JButton("Email and password");
		btnGetNewEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				email.setname(textField.getText());
				email.setLastName(textField_1.getText());
				email.setCompany(textField_3.getText());
				txtTher.setText(email.getEmail());
				textField_4.setText(email.getPassword());
				System.out.println(email.getPassword());
				System.out.println(email.getPassword());
				try {
					setInfo(email.getFirstName(), email.getLastName(), email.getCompany(),
						email.getDepartment(),email.getEmail(), email.getPassword(), state );
					
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnGetNewEmail.setBounds(45, 292, 188, 37);
		contentPane.add(btnGetNewEmail);
		
		
	}
	private static void setInfo(String firstname, String lastName,String Comp,
			String Dep,String email,String pass, Statement sta) throws SQLException {
		
		String setInfoString = "INSERT INTO EMAIL Values ('" +firstname +"','" +lastName +"','" +Comp 
				+"','"	+ Dep+"','" +email +"','" +pass +"');";
		sta.executeUpdate(setInfoString);
		
	}
	private void setStatement(Statement state) {
		this.state = state;
	}
	
	
	
}
