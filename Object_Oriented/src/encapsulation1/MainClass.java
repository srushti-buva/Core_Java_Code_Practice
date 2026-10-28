package encapsulation1;

public class MainClass {
	public static void main(String[] args) {
		Student s = new Student();
		//setting values to the setter method
		s.setStudent_id(123);
		s.setStudent_name("Srushti Buva");
		s.setStudent_city("Kolhapur");
		s.setStudent_email("srushti123@gmail.com");
		s.setStudent_fees(2500000.00);
		s.setStudent_Gender("Female");
		s.setStudent_rollNumber(5);
		s.setStudentStatus("Pass");
		s.setCollegeName("KIT College");
		s.setAdmission_Date("20 June 2026");
		s.setCourseName("CSE");
		s.setFirstName("Srushti");
		s.setLastName("Buva");
		s.setPhone("12345667879");
		s.setStudent_dateOfBirth("2 May 2004");
		
		
		
		
		//Getting values to the getter method
		System.out.println("Student Name is : "+ s.getStudent_name());
		System.out.println("Student id is : "+s.getStudent_id());
		System.out.println("Student email is : "+s.getStudent_email());
		System.out.println("Student city is : "+s.getStudent_city());
		System.out.println("Student gender is : "+s.getStudent_gender());
		System.out.println("Student rollNumber is :"+s.getStudent_rollNumber());
		System.out.println("Student AdmissionDate is: "+s.getAdmission_Date());
		System.out.println("Student CollegeName is :"+s.getcCollegeName());
		System.out.println("Studnt FirstName is : "+s.getFirstName());
		System.out.println("Student LastName is : "+s.getLastName());
		System.out.println("Student Phone is : "+s.getPhone());
		System.out.println("Student DateOfBirth is : "+s.getStudent_dateOfBirth());
		System.out.println("Student fees is : "+s.getStudent_fees());
		System.out.println("Student Status is : "+s.getStudentStatus());
		System.out.println("Student course name is : "+s.getCourseName());
		
		
		
	}

}
