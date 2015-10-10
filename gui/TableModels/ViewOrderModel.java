package gui.TableModels;

import javax.swing.table.AbstractTableModel;

public class ViewOrderModel extends AbstractTableModel {
	
	private static final long serialVersionUID = -1809207117162876209L;

	public ViewOrderModel() {}
	
	//
	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public int getRowCount() {
		//for modification
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		//this too
		return null;
	}
	
	@Override
	public String getColumnName(int column) {
		switch (column) {
			case 0: return "Order ID";
			case 1: return "Customer Name";
			case 2: return "Time";
			case 3: return "Date";
			default:return "";
		}
	}

}
