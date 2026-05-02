// VectorOperations.java
import java.util.Scanner;

public class VectorOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter dimension (2 or 3): ");
            int dimension = sc.nextInt();

            if (dimension != 2 && dimension != 3) {
                throw new IllegalArgumentException("Only 2D or 3D vectors are allowed.");
            }

            double[] v1 = new double[dimension];
            double[] v2 = new double[dimension];

            System.out.println("Enter components of Vector 1:");
            for (int i = 0; i < dimension; i++) {
                v1[i] = sc.nextDouble();
            }

            System.out.println("Enter components of Vector 2:");
            for (int i = 0; i < dimension; i++) {
                v2[i] = sc.nextDouble();
            }

            Vector vector1 = new Vector(v1);
            Vector vector2 = new Vector(v2);

            Vector sum = vector1.add(vector2);
            System.out.print("Addition Result: ");
            sum.display();

            Vector difference = vector1.subtract(vector2);
            System.out.print("Subtraction Result: ");
            difference.display();

            double dot = vector1.dotProduct(vector2);
            System.out.println("Dot Product Result: " + dot);

        } catch (DimensionMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Program terminated.");
        }
    }
}