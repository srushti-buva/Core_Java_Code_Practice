package switch_statement;

public class Menu_Driven {
	public static void main(String[] args) {
		int choice = 2;
		switch(choice) {
		case 1 :
			System.out.println("login");
			break;
		case 2 :
			System.out.println("Register");
			break;
		case 3 :
			System.out.println("Profile");
			break;
		case 4 :
			System.out.println("Logout");
		default:
			System.out.println("Invalid choice");
		}
	}

}
