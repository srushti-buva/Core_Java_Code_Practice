package switch_statement;

public class Numbers_In_Words {
	public static void main(String[] args) {
		int number = 3;
		switch(number) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;	
		case 5:
			System.out.println("five");
			break;	
		default:
			System.out.println("Invalid Number");
		}
	}

}
