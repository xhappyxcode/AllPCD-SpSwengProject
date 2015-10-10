package guiElements;

import java.awt.Font;

import javax.swing.JLabel;

public class FontController {
	private static FontController font;
	private static Font uiFont;
	private FontController(){
		if(System.getProperty("os.name").toLowerCase().contains("mac")){
			uiFont = new Font("Helvetica Neue", Font.PLAIN, 10);
			}
		else if(System.getProperty("os.name").toLowerCase().contains("windows")){
			uiFont = new Font("Segoe UI Light", Font.PLAIN, 12);
		}
		else {
			uiFont = new JLabel().getFont();
		}
			
	}
	
	public static Font getUiFont(){
		return uiFont;
	}
	public static Font getUiFont(int size){
		//note size is uiFont's default size+size
		//for windows: it's size 12, so 12+size
		return new Font(uiFont.getFontName(), Font.PLAIN, uiFont.getSize()+size);
	}
	public static FontController getInstance(){
		if (font==null){
			font = new FontController();
		}
		return font;
	}
}
