package method_types;

public class MainClass {
	public static void main(String args[]) {
		Method_Question obj = new Method_Question();
		
		
		// Type 1 : No Argument,No Return Value
		System.out.println("=== Type 1 ===");
		obj.checkEvenOdd();
		obj.PrintNumber();
		obj.multiplication();
		
		
		
		//Type 2 : Argument, No Return Value
		System.out.println("\n=== Type 2 ===");
		obj.checkNumber(-5);
		obj.factorial(5);
		
		
		
		//Type 3: No Argument ,with Return value
		System.out.println("\n===== Type 3");
		int addResult = obj.addition();
		System.out.println("Addition: "+ addResult);
		
		int squareResult=obj.square();
		System.out.println("Square: "+squareResult);
		
		System.out.println("Number: "+obj.getNumber());
		
		
		
		//Type 4 : Argument,With Return Value;
	    System.out.println("\n==== Type 4");
	    int maxResult = obj.maximum(10, 20);
	    System.out.println("Maximum: "+maxResult);
	    
	    int sumResult = obj.sum(10);
	    System.out.println("Sum: "+sumResult);
	    
	    long factResult = obj.calculateFactorial(5);
	    
	    if(factResult == -1) {
	    	System.out.println("Invalid Factorial Input");
	    }else {
	    	System.out.println("Factorial: "+ factResult);
	    }
	    
	    boolean result = obj.isPalindrome(121);
	    System.out.println("Palindrome: "+ result);
	
		
	    int areaResult = obj.area(10,5);
	    System.out.println("Rectangle Area: "+ areaResult);
		
		
		
	}

}
