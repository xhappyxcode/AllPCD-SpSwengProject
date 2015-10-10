package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.dialogs.ProductInfoPage;
import gui.dialogs.ProductInfoPageButtons;

public class ProductInfoPageListeners implements ActionListener {

	private ProductInfoPage page;
	private ProductInfoPageButtons mode;
	
	public ProductInfoPageListeners(ProductInfoPage page, ProductInfoPageButtons mode) {
		this.page = page;
		this.mode = mode;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		switch(mode){
			case EDITINFO: page.toggleEditable();
				break;
		}
	}

}
