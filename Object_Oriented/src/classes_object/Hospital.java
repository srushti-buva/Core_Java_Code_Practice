package classes_object;

public class Hospital {
	int hospitalId;
	String hospitalName;
	String location;
	int numberOfDoctors;
	int numberOfBeds;
	String hospitalType;
	String doctorName;
	String specialization;
	String department;
	String city;
	String state;
	long phoneNumber;
	String email;
	String consultationFee;
	
	public void treatment() {
		System.out.println("Hospital porovides treatment");
	}
	public void emergency() {
		System.out.println("Emergency service is available");
	}
	public void facilities() {
		System.out.println("Hospital provides medical facillities");
	}
	
	public void display() {
	System.out.println("Hospital ID--->>" +hospitalId);
	System.out.println("Hospital Name ---->>" +hospitalName);
	System.out.println("Hospital Type--->>"+hospitalType);
	System.out.println("Doctor Name ----->>"+doctorName);
	System.out.println("Specialization---->>"+specialization);
	System.out.println("Number of Beds --->" +numberOfBeds);
	System.out.println("Number of Doctors---->>"+numberOfDoctors);
	System.out.println("department------>>"+department);
	System.out.println("city----->>"+city);
	System.out.println("State--->>" +state);
	System.out.println("phone no.--->>"+phoneNumber);
	System.out.println("location---->>"+location);
	System.out.println("email--->>+email");
	System.out.println("consultationFee---->>+consultationFee");
	
	treatment();
	emergency();
	facilities();
	
	
	
	}
	
	

}
