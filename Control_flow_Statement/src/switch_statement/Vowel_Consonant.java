package switch_statement;

public class Vowel_Consonant {
	public static void main(String[] args) {
		char ch = 'a';
		switch(ch) {
		   case 'a':
		   case 'e':
		   case 'i':
		   case 'o':
		   case 'u':
		   case 'A':
		   case 'E':
		   case 'I':
		   case 'O':
		   case 'U':
			   System.out.println("Vowel");
			   break;
		   default:
			   if(( ch >='a' &&  ch <='z') || 
			     ( ch >='A'  &&  ch <='z')){
				   System.out.println("Consonant");
			   }else {
				   System.out.println("Not an alphabet");
			   }
		   	   
			
		}
	}

}
