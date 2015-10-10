package tester;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gui.*;
import gui.TableModels.AvailableProductsModel;
import gui.TableModels.ViewHistoryModel;
import gui.TableModels.ViewOrderModel;
import gui.listeners.HomePageButtonListeners;
import guiElements.FontController;

public class ProxyController {

	private static HomePage home;
	private static FontController font;
	private static SearchProdPane search;
	private static ViewOrdersPane viewOrder;
	private static AddOrderPane addOrder;
	private static AddProductPane addProduct;
	private static AddCategoryPane addCategory;
	private static AddWarehousePane addWarehouse;
	private static ViewHistoryPage viewHistory;
	private static ProxyController proxy;
	
	public static void main(String[] args) {
		try {
			 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		font = FontController.getInstance();
		ProxyController.getInstance();
	}

	private ProxyController(){
		home = new HomePage();
		home.getFunctionButtons()[0].addActionListener(new HomePageButtonListeners(HomePageButtons.SEARCHPROD, home));
		home.getFunctionButtons()[1].addActionListener(new HomePageButtonListeners(HomePageButtons.VIEWORDER, home));
		home.getFunctionButtons()[2].addActionListener(new HomePageButtonListeners(HomePageButtons.ADDORDER, home));
		home.getFunctionButtons()[3].addActionListener(new HomePageButtonListeners(HomePageButtons.ADDPRODUCT, home));
		home.getFunctionButtons()[4].addActionListener(new HomePageButtonListeners(HomePageButtons.ADDCATEGORY, home));
		home.getFunctionButtons()[5].addActionListener(new HomePageButtonListeners(HomePageButtons.ADDWAREHOUSE, home));
		home.getFunctionButtons()[6].addActionListener(new HomePageButtonListeners(HomePageButtons.VIEWHISTORY, home));
		
		search = new SearchProdPane();
		viewOrder = new ViewOrdersPane();
		addOrder = new AddOrderPane();
		addProduct = new AddProductPane();
		addCategory = new AddCategoryPane();
		addWarehouse = new AddWarehousePane();
		viewHistory = new ViewHistoryPage();
		
		viewOrder.setTableModel(new ViewOrderModel());
		viewHistory.setTableModel(new ViewHistoryModel());
		search.setMainTableModel(new AvailableProductsModel());
		
		home.addViewPanel(search, HomePageButtons.SEARCHPROD);
		home.addViewPanel(viewOrder,HomePageButtons.VIEWORDER);
		home.addViewPanel(addOrder,HomePageButtons.ADDORDER);
		home.addViewPanel(addProduct,HomePageButtons.ADDPRODUCT);
		home.addViewPanel(addCategory, HomePageButtons.ADDCATEGORY);
		home.addViewPanel(addWarehouse,HomePageButtons.ADDWAREHOUSE);
		home.addViewPanel(viewHistory,HomePageButtons.VIEWHISTORY);
		
		home.setUserName("Solomon");
		
		home.setVisible(true);
	}
	//SINGLETON
	public static ProxyController getInstance(){
		if(proxy ==null){
			proxy = new ProxyController();
		}
		return proxy;
	}
}
