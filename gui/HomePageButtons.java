package gui;

public enum HomePageButtons {
	
	/* THIS ENUM TYPE IS VERY IMPORTANT!!!!
	 * this will be used for controlling most of the program's operations
	 * card switching, button functions, EVARYTHING!!!
	 * if there's a new functionality, we will just change this, and a few others
	 */
	SEARCHPROD,VIEWORDER,ADDORDER,ADDPRODUCT,ADDCATEGORY,ADDWAREHOUSE,VIEWHISTORY,LOGOUT;
	
	public String toString(){
		switch (this) {
			case SEARCHPROD:return "Search Products";
			case VIEWORDER:return "View Order";
			case ADDORDER:return "Add Order";
			case ADDPRODUCT:return "Add Product";
			case ADDCATEGORY:return "Add Category";
			case ADDWAREHOUSE:return "Add Warehouse";
			case VIEWHISTORY:return "View History";
			case LOGOUT: return "Log Out";
			default: return "";
		}
	}
	public int toIndex(){
		switch (this) {
			case SEARCHPROD:return 0;
			case VIEWORDER:return 1;
			case ADDORDER:return 2;
			case ADDPRODUCT:return 3;
			case ADDCATEGORY:return 4;
			case ADDWAREHOUSE:return 5;
			case VIEWHISTORY:return 6;
			case LOGOUT: return 7;
			default: return 99;
		}
	}
	public static HomePageButtons getEnum(int i){
		switch (i) {
			case 0: return SEARCHPROD;
			case 1: return VIEWORDER;
			case 2: return ADDORDER;
			case 3: return ADDPRODUCT;
			case 4: return ADDCATEGORY;
			case 5: return ADDWAREHOUSE;
			case 6: return VIEWHISTORY;
			case 7: return LOGOUT;
			default:return null;
		}
	}
}
