package daySeven;

public class FactorialTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-1;
		int fact=1;
		try {
			for(int i=1;i<=a;i++) {
				fact=fact*i;
			}
			System.out.println(fact);
		}
		catch(Exception e) {
			System.out.println("The exception is "+e);
			e.getStackTrace();
		}

	}

}
