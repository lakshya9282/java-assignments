// Vector.java
public class Vector {
    private double[] components;

    public Vector(double[] components) {
        this.components = components;
    }

    public int getDimension() {
        return components.length;
    }

    public Vector add(Vector other) throws DimensionMismatchException {
        if (this.getDimension() != other.getDimension()) {
            throw new DimensionMismatchException("Addition not possible: Dimensions do not match.");
        }

        double[] result = new double[components.length];
        for (int i = 0; i < components.length; i++) {
            result[i] = this.components[i] + other.components[i];
        }
        return new Vector(result);
    }

    public Vector subtract(Vector other) throws DimensionMismatchException {
        if (this.getDimension() != other.getDimension()) {
            throw new DimensionMismatchException("Subtraction not possible: Dimensions do not match.");
        }

        double[] result = new double[components.length];
        for (int i = 0; i < components.length; i++) {
            result[i] = this.components[i] - other.components[i];
        }
        return new Vector(result);
    }

    public double dotProduct(Vector other) throws DimensionMismatchException {
        if (this.getDimension() != other.getDimension()) {
            throw new DimensionMismatchException("Dot product not possible: Dimensions do not match.");
        }

        double sum = 0;
        for (int i = 0; i < components.length; i++) {
            sum += this.components[i] * other.components[i];
        }
        return sum;
    }

    public void display() {
        System.out.print("(");
        for (int i = 0; i < components.length; i++) {
            System.out.print(components[i]);
            if (i != components.length - 1)
                System.out.print(", ");
        }
        System.out.println(")");
    }
}