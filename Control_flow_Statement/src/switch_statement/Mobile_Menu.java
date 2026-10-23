package switch_statement;

public class Mobile_Menu {
	 public static void main(String[] args) {
	        int choice = 1;

	        switch (choice) {
	            case 1: System.out.println("WiFi Selected"); break;
	            case 2: System.out.println("Bluetooth Selected"); break;
	            case 3: System.out.println("Mobile Data Selected"); break;
	            case 4: System.out.println("Airplane Mode Selected"); break;
	            default: System.out.println("Invalid Choice");
	        }
	    }
	}