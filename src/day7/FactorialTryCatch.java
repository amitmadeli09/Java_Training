package day7;
import java.util.Scanner;

public class FactorialTryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;

        try {
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();

            if (num < 1) {
                throw new Exception("Number can't be less than 1");
            } else {
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                System.out.println("Result after Factorial: " + fact);
            }

        } catch (Exception e) {
            System.out.println("The exception is: " + e.getMessage());
            e.printStackTrace();
        } finally {
            sc.close();
            System.out.println("Scanner closed. Execution complete.");
        }
    }
}