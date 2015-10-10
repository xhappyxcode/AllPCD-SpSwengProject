package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import guiElements.FontController;

public class ViewOrdersPane extends JPanel{
	
	private static final long serialVersionUID = 1033805579316021472L;
	private JTable mainTable;
	
	public ViewOrdersPane() {
		super();
		assembleUI();
	}
	
	public void assembleUI(){
		setSize(621, 464);
		setLayout(null);
		
		JLabel lblPaneName = new JLabel("View Orders");
		lblPaneName.setFont(FontController.getUiFont(14));
		lblPaneName.setBounds(34, 21, 330, 35);
		add(lblPaneName);
		
		JScrollPane scrollPane = new JScrollPane();
		mainTable = new JTable();
		
		mainTable.setFont(FontController.getUiFont(2));
		
		scrollPane.setBounds(10, 68, 601, 385);
		
		add(scrollPane);
		scrollPane.setViewportView(mainTable);	
	}
	
	//getters and setters
	public void setTableModel(TableModel model){
		mainTable.setModel(model);
		mainTable.updateUI();
	}
}
