import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Roll Number: " + rollNumber);

        sc.close();
    }
}
