package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.TableModel;

import guiElements.FontController;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class SearchProdPane extends JPanel {
	private static final long serialVersionUID = 7130624595417595234L;
	private JButton filterButton;
	private JComboBox <String> comboBox;
	private JScrollPane scrollPane;
	private JTable mainTable;
	private TableModel mainTableModel;
	
	public SearchProdPane() {
		super();
		assembleUI();
	}
	
	private void assembleUI(){
		setSize(621, 464);
		setLayout(null);
		
		this.setFont(FontController.getUiFont());
		
		JPanel panel = new JPanel();
		scrollPane = new JScrollPane();
		JLabel selectLabel = new JLabel("Select Category");
		JLabel lblSearchProducts = new JLabel("Search Products");
		
		mainTable = new JTable();
		scrollPane.setViewportView(mainTable);
		panel.setBounds(0, 53, 621, 33);
		scrollPane.setBounds(0, 87, 621, 377);
		lblSearchProducts.setBounds(34, 21, 330, 35);
		
		comboBox = new JComboBox<String>();
		filterButton = new JButton("Filter");
		
		lblSearchProducts.setFont(FontController.getUiFont(14));
		scrollPane.setFont(FontController.getUiFont(2));
		mainTable.setFont(FontController.getUiFont(2));
		panel.setFont(FontController.getUiFont(2));
		comboBox.setFont(FontController.getUiFont(2));
		filterButton.setFont(FontController.getUiFont(2));
		selectLabel.setFont(FontController.getUiFont(2));
		
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		selectLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		
		add(panel);
		add(scrollPane);
		add(lblSearchProducts);
		
		panel.add(selectLabel);
		panel.add(comboBox);
		panel.add(filterButton);
	}

	//pre-defined setters
	public void setMainTableModel(TableModel model){
			mainTable.setModel(model);
			mainTable.updateUI();
	}
	
	//getters
	public JButton getFilterButton() {
		return filterButton;
	}
	public JComboBox<String> getComboBox() {
		return comboBox;
	}
}
