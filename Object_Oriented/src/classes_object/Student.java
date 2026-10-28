package classes_object;

public class Student {
	 int studentId;
	    String studentName;
	    int studentAge;
	    String studentGender;
	    String courseName;
	    String collegeName;
	    String department;
	    int semester;
	    String email;
	    long phoneNumber;
	    String address;
	    String city;
	    String state;
	    double fees;
	    double percentage;

	    public void study() {
	        System.out.println("Student is studying");
	    }

	    public void attendLecture() {
	        System.out.println("Student is attending lecture");
	    }

	    public void giveExam() {
	        System.out.println("Student is giving exam");
	    }

	    public void display() {

	        System.out.println("Student ID---->>" + studentId);
	        System.out.println("Student Name---->>" + studentName);
	        System.out.println("Student Age---->>" + studentAge);
	        System.out.println("Student Gender---->>" + studentGender);
	        System.out.println("Course Name---->>" + courseName);
	        System.out.println("College Name---->>" + collegeName);
	        System.out.println("Department---->>" + department);
	        System.out.println("Semester---->>" + semester);
	        System.out.println("Email---->>" + email);
	        System.out.println("Phone Number---->>" + phoneNumber);
	        System.out.println("Address---->>" + address);
	        System.out.println("City---->>" + city);
	        System.out.println("State---->>" + state);
	        System.out.println("Fees---->>" + fees);
	        System.out.println("Percentage---->>" + percentage);

	        study();
	        attendLecture();
	        giveExam();
	    }
	}



