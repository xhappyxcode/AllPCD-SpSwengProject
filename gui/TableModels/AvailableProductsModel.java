package gui.TableModels;

import javax.swing.table.AbstractTableModel;

public class AvailableProductsModel extends AbstractTableModel {

	public AvailableProductsModel() {}
	
	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		return null;
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
			case 0:return "Product Name"; 
			case 1:return "Reserved Stocks"; 
			case 2:return "Free Stocks"; 
			default: return "";
		}
	}
}
