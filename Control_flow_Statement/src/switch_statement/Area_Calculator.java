package switch_statement;

public class Area_Calculator {
	public static void main(String[] args) {
		int choice =1;
		double radius = 5;
		double length = 10;
		double breadth = 4;
		double side = 5;
		switch(choice) {
		  case 1:
			  System.out.println("Area of circle= "+ (3.14* radius *radius));
			  break;
		  case 2:
			  System.out.println("Area of Rectangle= "+ (length * breadth));
			  break;
		  case 3:
			  System.out.println("Area of square= "+(side * side));
			  break;
		  default:
			  System.out.println("Invalid choice");
			  
		}
	}

}
