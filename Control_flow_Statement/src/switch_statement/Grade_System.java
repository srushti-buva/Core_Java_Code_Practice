package switch_statement;

public class Grade_System {
	public static void main(String[] args) {
		int grade = 'A';
		switch(grade) {
		case 'A' :
			System.out.println("Excellent");
			break;
		case 'B' :
			System.out.println("Good");
			break;
		case 'C':
		    System.out.println("Average");
		    break;
		case 'D':
			System.out.println("Pass");
			break;
		case 'F':
			System.out.println("Fail");
		default:
			System.out.println("Invalid grade");
			
			
			
		}
	}

}
