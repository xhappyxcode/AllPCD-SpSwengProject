package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

import guiElements.FontController;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class ViewHistoryPage extends JPanel {
	
	private static final long serialVersionUID = 1210319718964394515L;
	private JTable mainTable;
	
	public ViewHistoryPage() {
		super();
		assembleUI();
	}
	
	public void assembleUI(){
		setSize(621, 464);
		setLayout(null);
		
		JLabel lblPaneName = new JLabel("View History");
		lblPaneName.setFont(FontController.getUiFont(14));
		lblPaneName.setBounds(34, 21, 330, 35);
		add(lblPaneName);
		
		JScrollPane scrollPane = new JScrollPane();
		mainTable = new JTable();
		
		mainTable.setFont(FontController.getUiFont(2));
		
		scrollPane.setBounds(10, 67, 601, 386);
		
		add(scrollPane);
		scrollPane.setViewportView(mainTable);
	}
	
	//getters and setters
	public void setTableModel(TableModel model){
		mainTable.setModel(model);
		mainTable.updateUI();
	}
}
