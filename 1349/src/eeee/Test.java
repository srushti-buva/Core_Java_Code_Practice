package eeee;

public class Test {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		Doctor doctor = hospital.getDoctor();
		Patient patient = doctor.getPatient();
		Report report = patient.getReport();
		Result result = report.getResult();
		String message = result.getResultName();
		System.out.println(message);
		
	}

}
