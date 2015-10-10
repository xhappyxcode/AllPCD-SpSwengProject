package gui.dialogs;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class AddStocks extends JFrame {
	
	private static final long serialVersionUID = -723782340458562929L;
	private JLabel lblProductName;
	private JLabel lblStocksAdded;
	private JLabel lblWarehouseLoc;
	private JComboBox cmbBoxProdName;
	private JSpinner spnnrQty;
	private JComboBox cmbBoxWareHouseName;
	private JButton btnConfirmAdd;
	private JButton btnCancelAdd;
	
	public AddStocks() {
		setSize(440, 215);
		getContentPane().setLayout(null);
		
		lblProductName = new JLabel("Product Name:");
		lblStocksAdded = new JLabel("quantity of stocks to be added:");
		lblWarehouseLoc = new JLabel("Warehouse Location:");
		lblProductName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblStocksAdded.setHorizontalAlignment(SwingConstants.TRAILING);
		lblWarehouseLoc.setHorizontalAlignment(SwingConstants.TRAILING);
		lblProductName.setBounds(95, 23, 95, 31);
		lblStocksAdded.setBounds(10, 54, 180, 31);
		lblWarehouseLoc.setBounds(39, 82, 151, 31);
		
		getContentPane().add(lblProductName);
		getContentPane().add(lblStocksAdded);
		getContentPane().add(lblWarehouseLoc);
		
		cmbBoxProdName = new JComboBox();
		spnnrQty = new JSpinner();
		cmbBoxWareHouseName = new JComboBox();
		
		cmbBoxProdName.setBounds(200, 23, 151, 25);
		spnnrQty.setBounds(200, 54, 124, 31);
		cmbBoxWareHouseName.setBounds(200, 87, 151, 26);
		
		getContentPane().add(cmbBoxProdName);
		getContentPane().add(spnnrQty);
		getContentPane().add(cmbBoxWareHouseName);
		
		btnConfirmAdd = new JButton("Confirm Add");
		btnConfirmAdd.setBounds(119, 124, 101, 31);
		getContentPane().add(btnConfirmAdd);
		
		btnCancelAdd = new JButton("Cancel Add");
		btnCancelAdd.setBounds(230, 124, 101, 31);
		getContentPane().add(btnCancelAdd);
	}

	//getters and setters
	public JComboBox getCmbBoxProdName() {
		return cmbBoxProdName;
	}

	public JSpinner getSpnnrQty() {
		return spnnrQty;
	}

	public JComboBox getCmbBoxWareHouseName() {
		return cmbBoxWareHouseName;
	}

	public JButton getBtnConfirmAdd() {
		return btnConfirmAdd;
	}

	public JButton getBtnCancelAdd() {
		return btnCancelAdd;
	}
}
