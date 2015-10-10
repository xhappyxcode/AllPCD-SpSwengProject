package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import guiElements.FontController;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class AddWarehousePane extends JPanel {
	
	private JButton btnSubmit,btnClear;
	private JTextField txtName,txtLocation;
	
	public AddWarehousePane() {
		super();
		assembleUI();
	}
	
	public void assembleUI(){
		setSize(621, 464);
		setLayout(null);
		JLabel lblPaneName = new JLabel("Add Warehouse");
		lblPaneName.setFont(FontController.getUiFont(14));
		lblPaneName.setBounds(34, 21, 330, 35);
		add(lblPaneName);
		
		
		JLabel lblWarehouseName = new JLabel("Warehouse Name:");
		JLabel lblLocation = new JLabel("Location:");
		
		lblWarehouseName.setFont(FontController.getUiFont(2));
		lblLocation.setFont(FontController.getUiFont(2));
		
		lblWarehouseName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLocation.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblWarehouseName.setBounds(147, 187, 120, 20);
		lblLocation.setBounds(147, 218, 120, 20);
		
		add(lblWarehouseName);
		add(lblLocation);
		
		txtName = new JTextField("name");
		txtLocation = new JTextField("location");
		
		txtName.setFont(FontController.getUiFont(2));
		txtLocation.setFont(FontController.getUiFont(2));
		
		txtLocation.setBounds(277, 218, 160, 20);
		txtName.setBounds(277, 187, 160, 20);
		
		add(txtName);
		add(txtLocation);
		
		txtName.setColumns(30);
		txtLocation.setColumns(30);
		
		
		btnSubmit = new JButton("Submit");
		btnClear = new JButton("Clear");
		
		btnSubmit.setFont(FontController.getUiFont(2));
		btnClear.setFont(FontController.getUiFont(2));
		
		btnSubmit.setFont(FontController.getUiFont(2));
		btnClear.setFont(FontController.getUiFont(2));
		
		btnSubmit.setBounds(221, 410, 90, 30);
		btnClear.setBounds(311, 410, 90, 30);
		
		add(btnSubmit);
		add(btnClear);
	}

	public JButton getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(JButton btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

	public JButton getBtnClear() {
		return btnClear;
	}

	public void setBtnClear(JButton btnClear) {
		this.btnClear = btnClear;
	}

	public JTextField getTxtName() {
		return txtName;
	}

	public void setTxtName(JTextField txtName) {
		this.txtName = txtName;
	}

	public JTextField getTxtLocation() {
		return txtLocation;
	}

	public void setTxtLocation(JTextField txtLocation) {
		this.txtLocation = txtLocation;
	}
}
