package javastudy;

public class RationalNumber {
    private int numerator;
    private int denominator;

    // Constructor
    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Simplify the fraction
    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        // Ensure the denominator is positive
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Calculate the greatest common divisor (GCD)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Addition
    public RationalNumber add(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Subtraction
    public RationalNumber subtract(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Multiplication
    public RationalNumber multiply(RationalNumber other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Division
    public RationalNumber divide(RationalNumber other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Equality check
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RationalNumber that = (RationalNumber) obj;
        return numerator == that.numerator && denominator == that.denominator;
    }

    // String representation
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Main method for testing
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(1, 2);
        RationalNumber r2 = new RationalNumber(3, 4);

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);

        System.out.println("r1 + r2: " + r1.add(r2));
        System.out.println("r1 - r2: " + r1.subtract(r2));
        System.out.println("r1 * r2: " + r1.multiply(r2));
        System.out.println("r1 / r2: " + r1.divide(r2));
    }
}

