// Customer.java
import java.util.ArrayList;

public class Customer {
    private int custID;
    private String name;
    private String PAN;
    private String Aadhaar;
    private String address;
    private String dob;
    private String phone_no;
    private ArrayList<String> nominees = new ArrayList<>();

    public Customer(int custID, String name, String PAN, String Aadhaar,
                    String address, String dob, String phone_no) {
        this.custID = custID;
        this.name = name;
        this.PAN = PAN;
        this.Aadhaar = Aadhaar;
        this.address = address;
        this.dob = dob;
        this.phone_no = phone_no;
    }

    public void addNominees(String... names) {
        for (String n : names) {
            nominees.add(n);
        }
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + custID);
        System.out.println("Name: " + name);
        System.out.println("PAN: " + PAN);
        System.out.println("Aadhaar: " + Aadhaar);
        System.out.println("Phone: " + phone_no);
        System.out.println("Nominees:");
        for (String n : nominees) {
            System.out.println(n);
        }
    }
}