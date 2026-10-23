package switch_statement;

public class Arithmetic_Operator {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		char operator = '*';
		switch(operator) {
		case '+':
			System.out.println("Addition ="+(a + b));
			break;
		case '-':
			System.out.println("Substraction ="+(a-b));
			break;
		case '*':
			System.out.println("Multiplication ="+(a*b));
			break;
		case '/':
			if(b !=0) {
				System.out.println("division="+((double)a/b));
			}else {
				System.out.println("Cannot divide by zero");
			}
		default:
		    System.out.println("Invalid Operator");
		   
			
		
		}
	}

}
