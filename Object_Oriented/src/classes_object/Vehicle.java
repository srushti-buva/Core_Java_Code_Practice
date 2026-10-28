package classes_object;

public class Vehicle {
	

    int vehicleId;
    String vehicleName;
    String vehicleType;
    String companyName;
    String brandName;
    String model;
    String variant;
    String color;
    String fuelType;
    String transmissionType;

    int manufacturingYear;
    int registrationYear;
    int seatingCapacity;
    int numberOfDoors;
    int numberOfWheels;
    int numberOfAirbags;
    int numberOfGears;
    int engineCC;
    int horsepower;
    int topSpeed;

    double price;
    double mileage;
    double fuelTankCapacity;
    double engineOilCapacity;
    double length;
    double width;
    double height;
    double groundClearance;
    double wheelbase;
    double weight;

    String registrationNumber;
    String chassisNumber;
    String engineNumber;
    String insuranceNumber;
    String insuranceCompany;
    String insuranceExpiryDate;
    String pollutionCertificateNumber;
    String pollutionExpiryDate;
    String ownerName;
    String ownerAddress;

    long ownerPhoneNumber;
    String ownerEmail;
    String city;
    String state;
    String country;
    String vehicleCondition;
    String brakeType;
    String suspensionType;
    String headlightType;
    String sunroofType;

    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    public void display() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Company Name: " + companyName);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model: " + model);
        System.out.println("Variant: " + variant);
        System.out.println("Color: " + color);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Transmission Type: " + transmissionType);

        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Registration Year: " + registrationYear);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Number of Airbags: " + numberOfAirbags);
        System.out.println("Number of Gears: " + numberOfGears);
        System.out.println("Engine CC: " + engineCC);
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Top Speed: " + topSpeed);

        System.out.println("Price: " + price);
        System.out.println("Mileage: " + mileage);
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity);
        System.out.println("Engine Oil Capacity: " + engineOilCapacity);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Ground Clearance: " + groundClearance);
        System.out.println("Wheelbase: " + wheelbase);
        System.out.println("Weight: " + weight);

        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Chassis Number: " + chassisNumber);
        System.out.println("Engine Number: " + engineNumber);
        System.out.println("Insurance Number: " + insuranceNumber);
        System.out.println("Insurance Company: " + insuranceCompany);
        System.out.println("Insurance Expiry Date: " + insuranceExpiryDate);
        System.out.println("Pollution Certificate Number: " + pollutionCertificateNumber);
        System.out.println("Pollution Expiry Date: " + pollutionExpiryDate);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Owner Address: " + ownerAddress);

        System.out.println("Owner Phone Number: " + ownerPhoneNumber);
        System.out.println("Owner Email: " + ownerEmail);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Vehicle Condition: " + vehicleCondition);
        System.out.println("Brake Type: " + brakeType);
        System.out.println("Suspension Type: " + suspensionType);
        System.out.println("Headlight Type: " + headlightType);
        System.out.println("Sunroof Type: " + sunroofType);

        start();
        stop();
    }
}