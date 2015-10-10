package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import guiElements.FontController;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class AddOrderPane extends JPanel{
	private static final long serialVersionUID = 1348743695035617392L;
	
	private JScrollPane scrollPane;
	private JButton btnAddProductTo;
	private JTextField txtOrderid,txtCustomername;
	private JComboBox<String> cmbMonth;
	private JComboBox<Integer> cmbDay;
	private JSpinner spinYear;
	private JRadioButton rdbtnPickup,rdbtnDelivery;
	private JButton btnReserve,btnClear;
	
	public AddOrderPane() {
		super();
//		super("Add Order");
		assembleUI();
	}
	
//	@Override
	public void assembleUI(){
		setSize(621, 464);
		setLayout(null);
		JLabel lblPaneName = new JLabel("Add Order");
		lblPaneName.setFont(FontController.getUiFont(14));
		lblPaneName.setBounds(34, 21, 330, 35);
		add(lblPaneName);
		
		JLabel lblOrderId = new JLabel("Order ID: ");
		JLabel lblCustomerName = new JLabel("Customer Name: ");
		JLabel lblDateOrdered = new JLabel("Date Ordered:");
		JLabel lblPickupDelivery = new JLabel("Pickup/Delivery:");
		JLabel lblProductCart = new JLabel("Product Cart:");

		lblOrderId.setFont(FontController.getUiFont(2));
		lblCustomerName.setFont(FontController.getUiFont(2));
		lblDateOrdered.setFont(FontController.getUiFont(2));
		lblDateOrdered.setFont(FontController.getUiFont(2));
		lblPickupDelivery.setFont(FontController.getUiFont(2));
		lblProductCart.setFont(FontController.getUiFont(2));
		
		btnAddProductTo = new JButton("Add Product to Cart");
		scrollPane = new JScrollPane();
		
		
		lblOrderId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCustomerName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateOrdered.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPickupDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblOrderId.setBounds(67, 68, 120, 20);
		lblCustomerName.setBounds(67, 93, 120, 20);
		lblDateOrdered.setBounds(67, 123, 120, 20);
		lblPickupDelivery.setBounds(67, 155, 120, 20);
		btnAddProductTo.setBounds(227, 188, 170, 30);
		lblProductCart.setBounds(42, 239, 102, 20);
		scrollPane.setBounds(85, 264, 460, 135);
		
		
		add(lblDateOrdered);
		add(lblCustomerName);
		add(lblOrderId);
		add(lblPickupDelivery);
		add(btnAddProductTo);
		add(lblProductCart);
		add(scrollPane);
		
		txtOrderid = new JTextField();
		txtCustomername = new JTextField();
		txtOrderid.setEnabled(false);
		txtOrderid.setEditable(false);
		
		txtOrderid.setFont(FontController.getUiFont(2));
		txtCustomername.setFont(FontController.getUiFont(2));
		
		txtOrderid.setText("orderid");
		txtCustomername.setText("customername");
		
		txtOrderid.setBounds(197, 68, 200, 20);
		txtCustomername.setBounds(197, 93, 200, 20);
		
		txtOrderid.setColumns(30);
		txtCustomername.setColumns(30);
		
		add(txtOrderid);
		add(txtCustomername);
		
		cmbMonth = new JComboBox<String>();
		cmbDay = new JComboBox<Integer>();
		spinYear = new JSpinner();
		rdbtnPickup = new JRadioButton("pickup");
		rdbtnDelivery = new JRadioButton("delivery");
		
		cmbMonth.setFont(FontController.getUiFont(2));
		cmbDay.setFont(FontController.getUiFont(2));
		spinYear.setFont(FontController.getUiFont(2));
		rdbtnPickup.setFont(FontController.getUiFont(2));
		rdbtnDelivery.setFont(FontController.getUiFont(2));
		
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(rdbtnPickup);
		radioGroup.add(rdbtnDelivery);
		
		rdbtnPickup.setSelected(true);
		
		cmbMonth.setBounds(197, 123, 86, 20);
		cmbDay.setBounds(293, 123, 45, 20);
		spinYear.setBounds(348, 123, 59, 20);
		rdbtnPickup.setBounds(207, 154, 109, 23);
		rdbtnDelivery.setBounds(318, 154, 109, 23);
		
		add(cmbMonth);
		add(cmbDay);
		add(spinYear);
		add(rdbtnPickup);
		add(rdbtnDelivery);
		
		btnReserve = new JButton("Reserve");
		btnClear = new JButton("Clear");
		
		btnReserve.setFont(FontController.getUiFont(2));
		btnClear.setFont(FontController.getUiFont(2));
		
		btnReserve.setBounds(221, 410, 90, 30);
		btnClear.setBounds(311, 410, 90, 30);
		
		add(btnReserve);
		add(btnClear);
		
	}
	
	//preDef functions
	public Calendar getOrderDate(){
		Calendar cal = Calendar.getInstance();
		cal.set((Integer)this.spinYear.getValue(),(Integer)this.cmbMonth.getSelectedIndex(),(Integer)this.cmbDay.getSelectedIndex()+1);
		return cal;
	}
	public boolean isForPickup(){
		if(this.rdbtnPickup.isSelected()){
			return true;
		}else {
			return false;
		}
	}
	
	//other getters and setters
	public JButton getBtnAddProductTo() {
		return btnAddProductTo;
	}
	public JTextField getTxtOrderid() {
		return txtOrderid;
	}
	public JTextField getTxtCustomername() {
		return txtCustomername;
	}
	public JSpinner getSpinYear() {
		return spinYear;
	}
	public JButton getBtnReserve() {
		return btnReserve;
	}
	public JButton getBtnClear() {
		return btnClear;
	}
	
}
