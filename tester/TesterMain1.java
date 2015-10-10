package tester;


import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gui.*;
import gui.dialogs.ProductInfoPage;
import gui.listeners.HomePageButtonListeners;
import guiElements.FontController;

public class TesterMain1 {
	private static ProductInfoPage page;
	private static HomePage home;
	private static FontController font;
	public static void main(String[] args) {
		try {
			/*
			UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
			/*/
			 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			//*/
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		font =FontController.getInstance();
		
		home = new HomePage();
		home.getFunctionButtons()[0].addActionListener(new HomePageButtonListeners(HomePageButtons.SEARCHPROD, home));
		home.getFunctionButtons()[1].addActionListener(new HomePageButtonListeners(HomePageButtons.VIEWORDER, home));
		home.getFunctionButtons()[2].addActionListener(new HomePageButtonListeners(HomePageButtons.ADDORDER, home));
		home.getFunctionButtons()[3].addActionListener(new HomePageButtonListeners(HomePageButtons.ADDPRODUCT, home));
		home.getFunctionButtons()[4].addActionListener(new HomePageButtonListeners(HomePageButtons.ADDCATEGORY, home));
		home.getFunctionButtons()[5].addActionListener(new HomePageButtonListeners(HomePageButtons.ADDWAREHOUSE, home));
		home.getFunctionButtons()[6].addActionListener(new HomePageButtonListeners(HomePageButtons.VIEWHISTORY, home));
		
		home.addViewPanel(new SearchProdPane(), HomePageButtons.SEARCHPROD);
		home.addViewPanel(new ViewOrdersPane(), HomePageButtons.VIEWORDER);
		home.addViewPanel(new AddOrderPane(), HomePageButtons.ADDORDER);
		home.addViewPanel(new AddProductPane(), HomePageButtons.ADDPRODUCT);
		home.addViewPanel(new AddCategoryPane(), HomePageButtons.ADDCATEGORY);
		home.addViewPanel(new AddWarehousePane(), HomePageButtons.ADDWAREHOUSE);
		home.addViewPanel(new ViewHistoryPage(), HomePageButtons.VIEWHISTORY);
		home.setVisible(true);
	}

}
