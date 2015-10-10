package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import guiElements.FontController;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class AddCategoryPane extends JPanel {
	
	private static final long serialVersionUID = -5657334972234510086L;
	private JTextField txtCategory;
	private JButton btnSubmit,btnClear;
	
	public AddCategoryPane() {
		super();
		assembleUI();
	}
	
	public void assembleUI(){
		setSize(621, 464);
		setLayout(null);
		JLabel lblPaneName = new JLabel("Add Category");
		lblPaneName.setFont(FontController.getUiFont(14));
		lblPaneName.setBounds(34, 21, 330, 35);
		add(lblPaneName);
		
		JLabel lblCategoryName = new JLabel("Category Name:");
		txtCategory = new JTextField("Category");
		
		lblCategoryName.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblCategoryName.setFont(FontController.getUiFont(2));
		txtCategory.setFont(FontController.getUiFont(2));
		
		lblCategoryName.setBounds(148, 210, 120, 30);
		txtCategory.setBounds(278, 210, 150, 30);
		
		add(lblCategoryName);
		add(txtCategory);
		txtCategory.setColumns(10);
		
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
}
