// MainForVehicle.java
public class MainForVehicle {
    public static void main(String[] args) {

        // Creating vehicle objects
        Vehicle carA = new Vehicle();

        Vehicle carB = new Vehicle("Toyota", "Camry", 1750000, "Silver");
        carB.fuelCategory = 'C';
        carB.setManufacturingCode("MH12AB4567");

        Vehicle carC = new Vehicle('D', 2890000, "KA05MN7788");

        // Copy constructor
        Vehicle carD = new Vehicle(carB);

        // Array of objects
        Vehicle[] garage = { carA, carB, carC, carD };

        // Table Header
        System.out.println("===========================================================================");
        System.out.printf("%-12s %-12s %-6s %-8s %-6s %-6s %-12s %-8s %-12s %-5s%n",
                "Make", "Variant", "Year", "Color", "Fuel", "Seats", "Price", "Mileage", "MfgCode", "Srv");
        System.out.println("===========================================================================");

        for (Vehicle current : garage) {
            double mileageValue;

            if (current.fuelCategory == 'D')
                mileageValue = current.calcMileage(50, 650);
            else if (current.fuelCategory == 'P' || current.fuelCategory == 'C')
                mileageValue = current.calcMileage(40, 650);
            else
                mileageValue = 0;

            Vehicle.printTabular(current, mileageValue);
        }

        System.out.println("===========================================================================\n");

        // Simulating operations
        for (Vehicle current : garage) {
            System.out.println(">>> Running vehicle: " + current.make + " " + current.variant);
            current.start();
            current.drive();
            current.changeSpeed(80);
            current.stop();
            System.out.println();
        }
    }
}