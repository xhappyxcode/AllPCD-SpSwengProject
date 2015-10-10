package gui.dialogs;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class ProductInfoPage extends JFrame {
	private static final long serialVersionUID = 2377038183527269475L;
	private JTextField txtName;
	private JLabel lblStat, lblCategory[], lblProductname, lblStatus;
	private JLabel lblCategoryies, lblTotalFreeStocks, lblTotalReservedStocks, stocksQtyRes, stocksQtyFree;
	private JButton btnEditInfo,btnAddStocks,btnDeductStocks,btnDeactivate;
	private JScrollPane scrollPane;
	private JComboBox<String> categoryBox[];
	private boolean editable;

	public ProductInfoPage() {
		assembleUI();
	}
	
	@SuppressWarnings("unchecked")
	public void assembleUI() {
		setSize(411, 480);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setTitle("Product Info");
		getContentPane().setLayout(null);

		editable = false;
		lblProductname = new JLabel("Product Name:");
		lblStatus = new JLabel("Status:");
		lblCategoryies = new JLabel("Category:");
		lblTotalFreeStocks = new JLabel("Total Free Stocks:");
		lblTotalReservedStocks = new JLabel("Total Reserved Stocks:");

		lblProductname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategoryies.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalFreeStocks.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalReservedStocks.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProductname.setBounds(55, 61, 80, 20);
		lblStatus.setBounds(55, 92, 80, 20);
		lblCategoryies.setBounds(55, 123, 80, 20);
		lblTotalFreeStocks.setBounds(66, 229, 125, 20);
		lblTotalReservedStocks.setBounds(66, 257, 125, 20);

		getContentPane().add(lblProductname);
		getContentPane().add(lblStatus);
		getContentPane().add(lblCategoryies);
		getContentPane().add(lblTotalFreeStocks);
		getContentPane().add(lblTotalReservedStocks);

		txtName = new JTextField();
		lblStat = new JLabel();
		stocksQtyFree = new JLabel("90");
		stocksQtyRes = new JLabel("90");
		txtName.setText("Name");
		lblStat.setText("Status");

		txtName.setBounds(138, 61, 151, 20);
		lblStat.setBounds(138, 92, 86, 20);
		stocksQtyFree.setBounds(194, 229, 36, 20);
		stocksQtyRes.setBounds(194, 257, 36, 20);

		lblCategory = new JLabel[3];

		for (int i = 0; i < 3; i++) {
			lblCategory[i] = new JLabel();
			lblCategory[i].setBounds(138, 123, 115, 20);
			if (i != 0)
				lblCategory[i].setLocation(lblCategory[i].getX(), lblCategory[i].getY() + (31 * i));
			lblCategory[i].setText("Category " + (i + 1));
			getContentPane().add(lblCategory[i]);
		}

		txtName.setEditable(false);
		getContentPane().add(txtName);
		txtName.setColumns(30);

		getContentPane().add(lblStat);
		getContentPane().add(stocksQtyFree);
		getContentPane().add(stocksQtyRes);

		btnEditInfo = new JButton("Edit Info");
		btnAddStocks = new JButton("Add Stocks");
		btnDeductStocks = new JButton("Deduct Stocks");
		btnDeactivate = new JButton("Deactivate");

		btnEditInfo.setBounds(138, 21, 125, 30);
		btnAddStocks.setBounds(270, 123, 101, 30);
		btnDeductStocks.setBounds(270, 155, 101, 30);
		btnDeactivate.setBounds(270, 185, 101, 30);

		getContentPane().add(btnEditInfo);
		getContentPane().add(btnAddStocks);
		getContentPane().add(btnDeductStocks);
		getContentPane().add(btnDeactivate);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 288, 350, 152);
		getContentPane().add(scrollPane);

		categoryBox = new JComboBox[3];
		for (int i = 0; i < 3; i++) {
			categoryBox[i] = new JComboBox<String>();
			categoryBox[i].setBounds(lblCategory[i].getBounds());
			categoryBox[i].setEnabled(false);
			categoryBox[i].setVisible(false);
			getContentPane().add(categoryBox[i]);
		}

	}

	public void toggleEditable() {
		editable = !editable;
		txtName.setEditable(!txtName.isEditable());
		for (JLabel l : lblCategory) {
			l.setVisible(!l.isVisible());
		}
		for (JComboBox<String> j : categoryBox) {
			j.setEnabled(!j.isEnabled());
			j.setVisible(!j.isVisible());
		}
		System.out.println(isEditable());
	}

	//geters and setters

	public JTextField getTxtName() {
		return txtName;
	}

	public JLabel getLblStat() {
		return lblStat;
	}

	public JLabel[] getLblCategory() {
		return lblCategory;
	}

	public JLabel getLblStatus() {
		return lblStatus;
	}

	public JLabel getStocksQtyRes() {
		return stocksQtyRes;
	}

	public JLabel getStocksQtyFree() {
		return stocksQtyFree;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public JComboBox<String>[] getCategoryBox() {
		return categoryBox;
	}

	public boolean isEditable() {
		return editable;
	}
	public JButton getBtnEditInfo() {
		return btnEditInfo;
	}

	public JButton getBtnAddStocks() {
		return btnAddStocks;
	}

	public JButton getBtnDeductStocks() {
		return btnDeductStocks;
	}

	public JButton getBtnDeactivate() {
		return btnDeactivate;
	}
	
}
