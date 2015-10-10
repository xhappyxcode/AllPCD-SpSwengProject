package gui.dialogs;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login extends JFrame {
	private JLabel titleLabel;
	private JTextField userField;
	private JPasswordField passwordField;
	private JButton submitBtn;
	private JButton regBtn;
	private JLabel lblUsername, lblPassword, lblNewUser;
	private boolean isAdmin;
	
	public Login(boolean isAdmin) {
//		isAdmin = true;//debug
		assembleUI();
		if (isAdmin) {
			adminUIMode();
		}else{
			userUIMode();
		}
		setLocationRelativeTo(null);
		setVisible(true);
	}
	//modes
	private void assembleUI(){
		setTitle("Inventory System Client Login");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		titleLabel = new JLabel();
		lblUsername = new JLabel("username:");
		lblPassword = new JLabel("password:");
		lblNewUser = new JLabel("New User?");
		userField = new JTextField();
		passwordField = new JPasswordField();
		submitBtn = new JButton("Submit");
		regBtn = new JButton("Register");
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
		userField.setText("your username");
		passwordField.setText("password");
		passwordField.setColumns(20);
		userField.setColumns(20);
		
		getContentPane().add(lblUsername);
		getContentPane().add(lblPassword);
		getContentPane().add(lblNewUser);
		getContentPane().add(titleLabel);
		getContentPane().add(userField);
		getContentPane().add(passwordField);
		getContentPane().add(submitBtn);
		getContentPane().add(regBtn);
		
	}
	//UI modes
	private void userUIMode(){
		isAdmin = false;
		setSize(370, 275);
		
		titleLabel.setText("<html>KIMSON TRADING<br>INVENTORY SYSTEM</html>");
		
		titleLabel.setBounds(21, 28, 148, 29);
		lblUsername.setBounds(21, 68, 82, 25);
		lblPassword.setBounds(21, 130, 82, 25);
		lblNewUser.setBounds(243, 86, 62, 19);
		userField.setBounds(21, 93, 175, 29);
		passwordField.setBounds(21, 154, 175, 29);
		submitBtn.setBounds(140, 200, 89, 23);
		regBtn.setBounds(243, 104, 95, 40);
		
	}
	private void adminUIMode(){
		isAdmin = true;
		setSize(235, 275);
		
		titleLabel.setText("ADMIN LOGIN");
		
		lblNewUser.setVisible(false);
		regBtn.setVisible(false);
		regBtn.setEnabled(false);
		
		titleLabel.setBounds(21, 28, 148, 29);
		lblUsername.setBounds(21, 68, 82, 25);
		lblPassword.setBounds(21, 130, 82, 25);
		userField.setBounds(21, 93, 175, 29);
		passwordField.setBounds(21, 154, 175, 29);
		submitBtn.setBounds(65, 201, 89, 23);
	}
	public String getUserName() {
		return userField.getText();
	}
	public char[] getPassword() {
		return passwordField.getPassword();
	}
	public JButton getSubmitBtn() {
		return submitBtn;
	}
	public JButton getRegBtn() {
		return regBtn;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	
}
