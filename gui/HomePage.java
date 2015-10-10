package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import guiElements.FontController;

import java.awt.CardLayout;

public class HomePage extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel welcomeLabel;
	private JButton logOutBtn;
	private JToggleButton functionButtons[];
	private JPanel centerPane,topPane;
	private CardLayout cardSwitcher;
	private boolean centerMaxed;
	
	//constructors: overloaded for your convenience
	public HomePage(){
		super();
		assembleUI();
//		setUIFont();
	}
	
	private void assembleUI(){ //main Constructor
		setTitle("Inventory System Client");
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setFont(FontController.getUiFont());
		centerMaxed = false;
		
		JPanel panel = new JPanel();
		JPanel leftPane = new JPanel();
		topPane = new JPanel();
		centerPane = new JPanel();

		panel.setBounds(10, 11, 774, 549);
		topPane.setBounds(10, 11, 754, 52);
		centerPane.setBounds(143, 74, 621, 464);
		leftPane.setBounds(10, 74, 129, 464);
		
		panel.setLayout(null);
		topPane.setLayout(null);
		leftPane.setLayout(new GridLayout(7, 1, 0, 0));
		
		cardSwitcher = new CardLayout();
		cardSwitcher.setVgap(2);
		cardSwitcher.setHgap(2);
		centerPane.setLayout(cardSwitcher);

		getContentPane().add(panel);
		panel.add(topPane);
		panel.add(leftPane);
		panel.add(centerPane);
		
		leftPane.setBorder(new TitledBorder(null, "Main Menu", TitledBorder.LEADING, TitledBorder.TOP, FontController.getUiFont(2)));
		panel.add(leftPane);
		
		JLabel titleLabel = new JLabel("KIMSON TRADING INVENTORY SYSTEM");
		welcomeLabel = new JLabel("Welcome, ___________!");
		logOutBtn= new JButton("Log Out");
		
		titleLabel.setFont(FontController.getUiFont(4));
		welcomeLabel.setFont(FontController.getUiFont(2));
		logOutBtn.setFont(FontController.getUiFont());

		titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
		welcomeLabel.setHorizontalAlignment(SwingConstants.LEFT);

		titleLabel.setBounds(10, 5, 412, 20);
		welcomeLabel.setBounds(10, 28, 290, 15);
		logOutBtn.setBounds(648, 6, 96, 32);

		topPane.add(titleLabel);
		topPane.add(welcomeLabel);
		topPane.add(logOutBtn);
		

		functionButtons = new JToggleButton[7];
		ButtonGroup group1 = new ButtonGroup();
		for (int i = 0; i < functionButtons.length; i++) {
			functionButtons[i] = new JToggleButton(HomePageButtons.getEnum(i).toString());
			functionButtons[i].setHorizontalAlignment(SwingConstants.RIGHT);
			functionButtons[i].setBorderPainted(false);
			functionButtons[i].setFont(FontController.getUiFont());
			group1.add(functionButtons[i]);
			leftPane.add(functionButtons[i]);
		}
	}

	public void setUserName(String name){ //user name setup
		this.welcomeLabel.setText("Welcome, "+ name +"!");
	}
	
	/*	cardSwitcher methods:
	 *	this section of this gui window class is for switching the "cards" of the "centerPane" JPanel
	 * 	"cards" are JPanels that can switch between views if there are different cards in it
	 * 	we have seven functionalities, so there are 7 cards(JPanels). one corresponding to each functionality.
	 */
	public void switchCardView(HomePageButtons viewName){//for switching the centerPane View
		/*this is how this works:
		 * shove the enum type "HomePageButtons" as a parameter
		 * then it will show the "card" corresponding to the enum value
		 * the centerpane will automatically switch to that card
		 */
		cardSwitcher.show(centerPane, viewName.toString());
	}
	public void addViewPanel(JPanel pane, HomePageButtons viewName){
		centerPane.add(pane,viewName.toString());
	}
	
	//other getters
	public JButton getLogOutBtn() {
		return logOutBtn;
	}
	
	public JToggleButton[] getFunctionButtons() {
		return functionButtons;
	}
	
}
