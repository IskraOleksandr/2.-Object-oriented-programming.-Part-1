package Classes;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this(0, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void inputFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите числитель: ");
        setNumerator(scanner.nextInt());

        System.out.println("Введите знаменатель: ");
        setDenominator(scanner.nextInt());
    }

    public void printFraction() {
        System.out.println("\nРезультирующая дробы  " + numerator + "/" + denominator);
    }

    public Fraction add(Fraction other) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        result.denominator = this.denominator * other.denominator;

        return result.reductionOfFractions();
    }

    public Fraction subtract(Fraction other) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        result.denominator = this.denominator * other.denominator;

        return result.reductionOfFractions();
    }

    public Fraction multiply(Fraction other) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * other.numerator;
        result.denominator = this.denominator * other.denominator;
        return result.reductionOfFractions();
    }

    public Fraction divide(Fraction other) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * other.denominator;
        result.denominator = this.denominator * other.numerator;
        return result.reductionOfFractions();
    }

    public void fractionToRealNumber() {
        double n = (double) numerator / denominator;
        System.out.println("\nДробь в вещественном числе: " + (double) n);
    }

    public Fraction reductionOfFractions() {
        int numerator = getNumerator();
        int denominator = getDenominator();
        int copyOfNumerator = numerator;
        int copyOfDenominator = denominator;
        while (copyOfNumerator != copyOfDenominator) {
            if (copyOfNumerator < copyOfDenominator) {
                copyOfDenominator -= copyOfNumerator;
            } else {
                copyOfNumerator -= copyOfDenominator;
            }
        }
        int resultNumerator = numerator / copyOfNumerator;
        int resultDenominator = denominator / copyOfDenominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Знаменатель не может быть равен 0\n Введите знаменатель еще раз: ");
            this.denominator = scanner.nextInt();
        }
    }


}