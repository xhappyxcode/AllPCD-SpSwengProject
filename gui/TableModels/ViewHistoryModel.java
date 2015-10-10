package gui.TableModels;

import javax.swing.table.AbstractTableModel;

public class ViewHistoryModel extends AbstractTableModel{
	private static final long serialVersionUID = -9037525240670465910L;

	public ViewHistoryModel() {}
	
	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public int getRowCount() {
		//WIP
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0: return "Name";
		case 1: return "Edit";
		case 2: return "Date";
		case 3: return "Time";
		default:return "";

		}
	}
}
