package classes_object;



	public class School {
	    int schoolId;
	    String schoolName;
	    String location;
	    int numberOfTeachers;
	    int numberOfStudents;
	    String schoolType;
	    String principalName;
	    String teacherName;
	    String department;
	    String city;
	    String state;
	    long phoneNumber;
	    String email;
	    String boardName;
	    double fees;

	    public void teaching() {
	        System.out.println("School provides education to students");
	    }

	    public void examination() {
	        System.out.println("School conducts examinations");
	    }

	    public void sports() {
	        System.out.println("School provides sports facilities");
	    }

	    public void display() {

	        System.out.println("School ID---->>" + schoolId);
	        System.out.println("School Name---->>" + schoolName);
	        System.out.println("Location---->>" + location);
	        System.out.println("Number of Teachers---->>" + numberOfTeachers);
	        System.out.println("Number of Students---->>" + numberOfStudents);
	        System.out.println("School Type---->>" + schoolType);
	        System.out.println("Principal Name---->>" + principalName);
	        System.out.println("Teacher Name---->>" + teacherName);
	        System.out.println("Department---->>" + department);
	        System.out.println("City---->>" + city);
	        System.out.println("State---->>" + state);
	        System.out.println("Phone Number---->>" + phoneNumber);
	        System.out.println("Email---->>" + email);
	        System.out.println("Board Name---->>" + boardName);
	        System.out.println("Fees---->>" + fees);

	        teaching();
	        examination();
	        sports();
	    }
	}




