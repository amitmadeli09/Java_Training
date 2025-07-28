package daySeven;
import java.util.Scanner;

public class FactorialTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int fact=1;
		try {
			if(num < 1) {
				throw new Exception("Input number cannot be negative: " + num);
			}else {
				for(int i=1 ; i<= num ; i++) {
					fact *= i;
					}
				System.out.println("Result after Factorial :"+fact);
				}
		}
		catch(Exception e) {
			System.out.println("The exception is "+e);
			e.getStackTrace();
		}

	}

}
