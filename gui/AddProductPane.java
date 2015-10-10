package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

import guiElements.FontController;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class AddProductPane extends JPanel{
	private static final long serialVersionUID = 1583834961493369887L;
	
	private JLabel lblCategory[];
	private JTextArea txtrProductDescription;
	private JTextField txtProductname;
	private JComboBox <String> cmbCat[];
	private JRadioButton rdbtnActive,rdbtnInactive;
	private JComboBox <String> cmbMeasure;
	private JButton btnSubmit;
	private JButton btnClear;
	
	public AddProductPane() {
		super();
		assembleUI();
	}
	
//	@Override
	public void assembleUI() {
		setSize(621, 464);
		setLayout(null);
		JLabel lblPaneName = new JLabel("Add Product");
		lblPaneName.setFont(FontController.getUiFont(14));
		lblPaneName.setBounds(34, 21, 330, 35);
		add(lblPaneName);
		
		JLabel lblProductName = new JLabel("Product Name:");
		JLabel lblDescription = new JLabel("Description:");
		JLabel lblProductStatus = new JLabel("Product Status:");
		JLabel lblProductMeasurement = new JLabel("Product Measurement:");
		
		lblProductName.setFont(FontController.getUiFont(2));
		lblDescription.setFont(FontController.getUiFont(2));
		lblProductStatus.setFont(FontController.getUiFont(2));
		lblProductMeasurement.setFont(FontController.getUiFont(2));;
		
		lblProductName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescription.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblProductName.setBounds(68, 62, 120, 20);
		lblDescription.setBounds(68, 186, 120, 20);
		lblProductStatus.setBounds(374, 62, 120, 20);
		lblProductMeasurement.setBounds(374, 143, 145, 20);
		
		add(lblProductName);
		add(lblDescription);
		add(lblProductStatus);
		add(lblProductMeasurement);
		
		lblCategory = new JLabel[3];
		for (int i = 0; i < 3; i++) {
			lblCategory[i] = new JLabel("Category "+(i+1)+":");
			lblCategory[i].setHorizontalAlignment(SwingConstants.RIGHT);
			lblCategory[i].setSize(120, 20);
			lblCategory[i].setLocation(68, 93+31*i);
			lblCategory[i].setVisible(false);
			lblCategory[i].setFont(FontController.getUiFont(2));
			add(lblCategory[i]);
		}
		lblCategory[0].setVisible(true);
		
		txtrProductDescription = new JTextArea();
		txtrProductDescription.setLineWrap(true);
		txtrProductDescription.setText("Product Description:");
		txtrProductDescription.setBounds(68, 219, 474, 139);
		add(txtrProductDescription);
		txtrProductDescription.setFont(FontController.getUiFont(2));
		
		txtProductname = new JTextField("ProductName");
		rdbtnActive = new JRadioButton("Active");
		rdbtnInactive = new JRadioButton("Inactive");
		cmbMeasure = new JComboBox();
		
		txtProductname.setFont(FontController.getUiFont(2));
		rdbtnActive.setFont(FontController.getUiFont(2));
		rdbtnInactive.setFont(FontController.getUiFont(2));
		
		cmbMeasure.setEditable(true);
		txtProductname.setBounds(198, 62, 166, 20);
		add(txtProductname);
		txtProductname.setColumns(30);
		
		cmbCat = new JComboBox[3];
		
		for (int i = 0; i < 3; i++) {
			cmbCat[i] = new JComboBox<String>();
			cmbCat[i].setSize(166, 20);
			cmbCat[i].setLocation(198, 93+i*31);
			cmbCat[i].setVisible(false);
			cmbCat[i].setEnabled(false);
			cmbCat[i].setFont(FontController.getUiFont(2));
			add(cmbCat[i]);
		}
		cmbCat[0].setVisible(true);
		cmbCat[0].setEnabled(true);
		
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(rdbtnActive);
		radioGroup.add(rdbtnInactive);
		rdbtnActive.setSelected(true);
		
		rdbtnActive.setBounds(374, 93, 109, 20);
		rdbtnInactive.setBounds(374, 113, 109, 23);
		cmbMeasure.setBounds(374, 174, 90, 20);

		add(rdbtnActive);
		add(rdbtnInactive);
		add(cmbMeasure);
		
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
	//pre defined getters
	public boolean isActive(){
		if(this.rdbtnActive.isSelected()){
			return true;
		}else {
			return false;
		}
	}
	
	//other getters
	public JLabel[] getLblCategory() {
		return lblCategory;
	}

	public JTextArea getTxtrProductDescription() {
		return txtrProductDescription;
	}

	public JTextField getTxtProductname() {
		return txtProductname;
	}

	public JComboBox<String>[] getCmbCat() {
		return cmbCat;
	}

	public JComboBox<String> getCmbMeasure() {
		return cmbMeasure;
	}

	public JButton getBtnSubmit() {
		return btnSubmit;
	}

	public JButton getBtnClear() {
		return btnClear;
	}
	
	
	
}
