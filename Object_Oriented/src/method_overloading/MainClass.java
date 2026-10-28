package method_overloading;

public class MainClass {
	public static void main(String args []) {
		Method_Question obj = new Method_Question();
		System.out.println(" ===== EVEN OR ODD");
		obj.show(10);
		
		System.out.println("\n ===== POSITIVE OR NEGATIVE ===");
		obj.show(-5.5);
		
		
		System.out.println("\n ==== PRINT NUMBERS ===");
		obj.show(1,10);
		
		System.out.println("\n=== MULTIPLICATION TABLE ===");
	    obj.show(5, 10, 1);
	    
	    
	    System.out.println("\n=== REVERSE NUMBER ===");
        obj.show(1234L);

	}

}
