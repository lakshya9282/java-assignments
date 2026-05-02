// Vehicle.java
class Vehicle {

    // Public members
    public String make;
    public String variant;
    public java.time.Year manufactureYear;
    public String bodyColor;
    public char fuelCategory; // E, P, D, C
    public double cost;
    public int seatCount;

    // Private members
    private String manufacturingCode;
    private int serviceCount;

    // Default constructor
    public Vehicle() {
        make = "Honda";
        variant = "Civic";
        manufactureYear = java.time.Year.of(2026);
        bodyColor = "Red";
        fuelCategory = 'P';
        seatCount = 5;
        cost = 2200000;
    }

    // Parameterized constructor
    public Vehicle(String make, String variant, double cost, String bodyColor) {
        this.make = make;
        this.variant = variant;
        this.cost = cost;
        this.bodyColor = bodyColor;
        this.manufactureYear = java.time.Year.of(2025);
        this.fuelCategory = 'P';
        this.seatCount = 5;
    }

    // Constructor with fuel + manufacturing code
    public Vehicle(char fuelCategory, double cost, String manufacturingCode) {
        this.make = "Mahindra";
        this.variant = "XUV700";
        this.manufactureYear = java.time.Year.of(2024);
        this.bodyColor = "Grey";
        this.fuelCategory = fuelCategory;
        this.cost = cost;
        this.seatCount = 7;
        this.manufacturingCode = manufacturingCode;
    }

    // Copy constructor
    public Vehicle(Vehicle other) {
        this.make = other.make;
        this.variant = other.variant;
        this.manufactureYear = other.manufactureYear;
        this.bodyColor = other.bodyColor;
        this.fuelCategory = other.fuelCategory;
        this.cost = other.cost;
        this.seatCount = other.seatCount;
        this.manufacturingCode = other.manufacturingCode;
        this.serviceCount = other.serviceCount;
    }

    // Setters & Getters
    public void setManufacturingCode(String code) {
        manufacturingCode = code;
    }

    public String getManufacturingCode() {
        return manufacturingCode;
    }

    public void setServiceCount(int count) {
        serviceCount = count;
    }

    public int getServiceCount() {
        return serviceCount;
    }

    // Methods
    public void start() {
        System.out.println("Engine started successfully.");
    }

    public void drive() {
        System.out.println("Vehicle is now moving.");
    }

    public void stop() {
        System.out.println("Engine switched off.");
    }

    public void changeSpeed(int speed) {
        System.out.println("Speed adjusted to " + speed + " kmph");
    }

    public double calcMileage(double fuelUsed, double distanceCovered) {
        return distanceCovered / fuelUsed;
    }

    public static void printTabular(Vehicle v, double mileage) {
        System.out.printf(
                "%-10s %-10s %-6s %-8s %-5s %-5d %-10.2f %-8.2f %-10s %-5d%n",
                v.make,
                v.variant,
                v.manufactureYear,
                v.bodyColor,
                v.fuelCategory,
                v.seatCount,
                v.cost,
                mileage,
                v.getManufacturingCode(),
                v.getServiceCount()
        );
    }
}