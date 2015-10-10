package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.HomePage;
import gui.HomePageButtons;

public class HomePageButtonListeners implements ActionListener {
	private HomePageButtons buttonType;
	private HomePage home;
	
	public HomePageButtonListeners(HomePageButtons buttonType, HomePage home) {
		this.buttonType = buttonType;
		this.home = home;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		switch (buttonType.toIndex()) {
			case 7://what to do for logout
				break;
			default:
				home.switchCardView(buttonType);
				break;
		}
	}

}
