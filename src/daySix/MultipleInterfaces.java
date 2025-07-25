package daySix;

import java.util.Scanner;

interface Addition {
    default double calculate(double a, double b) {
        return a + b;
    }
}

interface Substraction {
    default double calculate(double a, double b) {
        return a - b;
    }
}

interface Multiplication {
    default double calculate(double a, double b) {
        return a * b;
    }
}

class Calculator implements Addition, Substraction, Multiplication {
    @Override
    public double calculate(double a, double b) {
        System.out.println("-------------------------------------------");
        System.out.println("CALCULATOR");
        System.out.println("Please Select one option");
        System.out.println("1 - Addition");
        System.out.println("2 - Substraction");
        System.out.println("3 - Multiplication");

        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();
        System.out.println("Option Selected: "+input);

        switch (input) {
            case 1:
                return Addition.super.calculate(a, b);
            case 2:
                return Substraction.super.calculate(a, b);
            case 3:
                return Multiplication.super.calculate(a, b);
            default:
                System.out.println("Invalid option");
                return 0;
        }
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter the First Value: ");
        double a = sc.nextDouble();

        System.out.print("Enter the Second Value: ");
        double b = sc.nextDouble();

        double result = calc.calculate(a, b);
        System.out.println("Result : " + result);
        System.out.println("-------------------------------------------");

        sc.close(); // Close at the end
    }
}