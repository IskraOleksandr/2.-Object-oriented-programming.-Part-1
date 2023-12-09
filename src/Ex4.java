import Classes.Fraction;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n\nВведите две обычных дробы.");

            Fraction fraction1 = new Fraction();
            fraction1.inputFraction();

            Fraction fraction2 = new Fraction();
            fraction2.inputFraction();

            System.out.println("Виберите действие\n 1) + \n 2) - \n 3) * \n 4) / \n :");
            Fraction result;

            switch (scanner.nextInt()) {
                case 1:
                    result = fraction1.add(fraction2);
                    result.printFraction();
                    result.fractionToRealNumber();
                    break;
                case 2:
                    result = fraction1.subtract(fraction2);
                    result.printFraction();
                    result.fractionToRealNumber();
                    break;
                case 3:
                    result = fraction1.multiply(fraction2);
                    result.printFraction();
                    result.fractionToRealNumber();
                    break;
                case 4:
                    result = fraction1.divide(fraction2);
                    result.printFraction();
                    result.fractionToRealNumber();
                    break;
            }
            System.out.println("\nХотите продолжить? 1)Да / 2)Нет :");

        } while (scanner.nextInt() == 1);
    }
}

