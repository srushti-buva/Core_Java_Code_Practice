package switch_statement;

public class Simple_Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int choice = 4;
		switch(choice) {
		case 1 :
			System.out.println("Addition of a and b ="+(a+b));
			break;
		case 2 :
			System.out.println("Substraction of a and b="+(a-b));
			break;
		case 3 :
			System.out.println("Multiplication of a and b="+(a*b));
			break;
		case 4 :
			if(b !=0) {
				System.out.println("Division of a and b ="+((double)a/b));
				
				
			}else {
				System.out.println("Cannot divide by zero");
			}
			
		default:
			System.out.println("Invalid choice");
		}
	}

}
