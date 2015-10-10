package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gui.HomePage;
import gui.dialogs.ProductInfoPage;

public class Controller {
	
	private static Controller control;
	private static HomePage home;
//	private static ProductInfo prodPane;
//	private static 
	
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {}
		
		Controller.getInstance();
	}
	
	private Controller(){
		
	}
	public static Controller getInstance(){
		if(control == null)
			control = new Controller();
		return control;
	}
}
