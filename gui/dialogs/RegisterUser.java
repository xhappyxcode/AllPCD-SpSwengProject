package gui.dialogs;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class RegisterUser extends JFrame {
	private static final long serialVersionUID = -1834526534107187684L;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	private JPasswordField pwdPassword_1;
	

	public RegisterUser() {
		setSize(360, 280);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFirstName.setBounds(66, 36, 80, 20);
		getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblLastName.setBounds(66, 61, 80, 20);
		getContentPane().add(lblLastName);
		
		JLabel lblAssignedWarehouse = new JLabel("Assigned Warehouse:");
		lblAssignedWarehouse.setBounds(40, 92, 106, 20);
		getContentPane().add(lblAssignedWarehouse);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUsername.setBounds(66, 123, 80, 20);
		getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setBounds(66, 149, 80, 20);
		getContentPane().add(lblPassword);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(156, 36, 120, 20);
		getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setText("last name");
		txtLastName.setBounds(156, 61, 120, 20);
		getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(156, 92, 120, 20);
		getContentPane().add(comboBox);
		
		txtUsername = new JTextField();
		txtUsername.setText("username");
		txtUsername.setBounds(156, 123, 120, 20);
		getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("password");
		pwdPassword.setBounds(156, 149, 120, 20);
		getContentPane().add(pwdPassword);
		
		JLabel lblRetype = new JLabel("Re-Type:");
		lblRetype.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRetype.setBounds(66, 173, 80, 20);
		getContentPane().add(lblRetype);
		
		pwdPassword_1 = new JPasswordField();
		pwdPassword_1.setText("Password");
		pwdPassword_1.setBounds(156, 173, 120, 20);
		getContentPane().add(pwdPassword_1);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.setBounds(146, 204, 89, 23);
		getContentPane().add(btnSubmit);
		
		JLabel lblNewUserRegistration = new JLabel("New User Registration");
		lblNewUserRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewUserRegistration.setBounds(112, 11, 144, 14);
		getContentPane().add(lblNewUserRegistration);
		
		
		
		setVisible(true);
	}
}
