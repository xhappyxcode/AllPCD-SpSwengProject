package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

import guiElements.FontController;

public abstract class MainMenuPane extends JPanel {
	protected JLabel lblPaneName;
	
	protected MainMenuPane(){
		super();
		fixPane();
		paneName();
		assembleUI();
	}
	protected MainMenuPane(String name) {
		super();
		fixPane();
		paneName(name);
		assembleUI();
	}
	protected final void fixPane(){
		setSize(621, 464);
		setLayout(null);
	}
	protected final void paneName(String name){
		lblPaneName = new JLabel(name);
		setupPaneBounds();
	}
	protected final void paneName(){
		lblPaneName = new JLabel();
		setupPaneBounds();
		
	}
	protected final void setPaneName(String name){
		this.lblPaneName.setText(name);
	}
	private final void setupPaneBounds(){
		lblPaneName.setFont(FontController.getUiFont(14));
		lblPaneName.setBounds(34, 21, 330, 30);
		add(lblPaneName);
	}
	protected abstract void assembleUI();
}
