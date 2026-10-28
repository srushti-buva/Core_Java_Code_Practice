package classes_object;

public class MainClass {
public static void main(String Args[]) {
		
		System.out.println("employee ---------------------------------\n");
		Employee emp= new Employee();
		emp.employeeId =101;
		emp.employeeName="Ankit";
		emp.age = 27;
		emp.gender ="male";
		emp.department="IT";
		emp.salary=65000;
		emp.designation="software developer";
		emp.email="ank@gmail.com";
		emp.phoneNumber =98763543687L;
		emp.address ="Shivaji nagar";
		emp.city="pune";
		emp.state ="Maharashtra";
		emp.joiningDate="10-06-2025";
		emp.qualification="Btech";
		emp.campanyName="TCS";
		
		emp.display();
	
		System.out.println("-------------------------------------\n");
		System.out.println("hospital ---------------------------------\n");
		Hospital h = new Hospital();
		h.hospitalId = 101;
        h.hospitalName = "City Hospital";
        h.location = "Rajarampuri";
        h.numberOfDoctors = 50;
        h.numberOfBeds = 200;
        h.hospitalType = "Multispeciality";
        h.doctorName = "Dr. Amit";
        h.specialization = "Cardiology";
        h.department = "Heart";
        h.city = "Kolhapur";
        h.state = "Maharashtra";
        h.phoneNumber = 9876543210L;
        h.email = "cityhospital@gmail.com";
        h.consultationFee = "500";
        h.display();
			
        System.out.println("-------------------------------------\n");
		System.out.println("vehicle ---------------------------------\n");
		
		
		Vehicle v = new Vehicle();
        v.vehicleId = 101;
        v.vehicleName = "Swift";
        v.vehicleType = "Car";
        v.companyName = "Maruti Suzuki";
        v.brandName = "Maruti";
        v.model = "Swift VXI";
        v.variant = "VXI";
        v.color = "White";
        v.fuelType = "Petrol";
        v.transmissionType = "Manual";
        v.manufacturingYear = 2025;
        v.registrationYear = 2025;
        v.seatingCapacity = 5;
        v.numberOfDoors = 4;
        v.numberOfWheels = 4;
        v.numberOfAirbags = 6;
        v.numberOfGears = 5;
        v.engineCC = 1197;
        v.horsepower = 82;
        v.topSpeed = 180;
        v.price = 800000;
        v.mileage = 22.0;
        v.fuelTankCapacity = 37.0;
        v.engineOilCapacity = 3.5;
        v.length = 3.86;
        v.width = 1.735;
        v.height = 1.52;
        v.groundClearance = 163;
        v.wheelbase = 2.45;
        v.weight = 920;

        v.registrationNumber = "MH09AB1234";
        v.chassisNumber = "CH123456";
        v.engineNumber = "EN123456";
        v.insuranceNumber = "INS123456";
        v.insuranceCompany = "ABC Insurance";
        v.insuranceExpiryDate = "31-12-2026";
        v.pollutionCertificateNumber = "PUC123456";
        v.pollutionExpiryDate = "30-06-2027";
        v.ownerName = "Amit Patil";
        v.ownerAddress = "Rajarampuri";
        v.ownerPhoneNumber = 9876543210L;
        v.ownerEmail = "amit@gmail.com";
        v.city = "Kolhapur";
        v.state = "Maharashtra";
        v.country = "India";
        v.vehicleCondition = "New";
        v.brakeType = "Disc";
        v.suspensionType = "Hydraulic";
        v.headlightType = "LED";
        v.sunroofType = "No Sunroof";

        v.display();
    

		
		
		
        System.out.println("-------------------------------------\n");
		System.out.println("student---------------------------------\n");
	

		Student s1 = new Student();

        s1.studentId = 101;
        s1.studentName = "Diya";
        s1.studentAge = 22;
        s1.studentGender = "Female";
        s1.courseName = "B.Tech";
        s1.collegeName = "KIT College";
        s1.department = "Computer Science";
        s1.semester = 5;
        s1.email = "diya@gmail.com";
        s1.phoneNumber = 9876543210L;
        s1.address = "Shivaji Nagar";
        s1.city = "Kolhapur";
        s1.state = "Maharashtra";
        s1.fees = 75000.0;
        s1.percentage = 85.5;

        s1.display();
    

        System.out.println("-------------------------------------\n");
		System.out.println("school ---------------------------------\n");

        School s2 = new School();

        s2.schoolId = 101;
        s2.schoolName = "New English School";
        s2.location = "Shivaji Nagar";
        s2.numberOfTeachers = 50;
        s2.numberOfStudents = 1000;
        s2.schoolType = "Private";
        s2.principalName = "Mr. Patil";
        s2.teacherName = "Mrs. Joshi";
        s2.department = "Science";
        s2.city = "Kolhapur";
        s2.state = "Maharashtra";
        s2.phoneNumber = 9876543210L;
        s2.email = "school@gmail.com";
        s2.boardName = "State Board";
        s2.fees = 25000.0;

        s2.display();
    }
}


