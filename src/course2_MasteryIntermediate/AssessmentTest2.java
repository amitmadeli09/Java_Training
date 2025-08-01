package course2_MasteryIntermediate;
import java.util.HashMap;
import java.util.Scanner;

public class AssessmentTest2 {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Choose an option :");
			System.out.println("1. Add Student");
			System.out.println("2. Get Student Score");
			System.out.println("3. Exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 : 
				System.out.println("Enter the student's name :");
				String name = sc.nextLine();
				System.out.println("Enter the student's score: ");
				int score = sc.nextInt();
				map.put(name, score);
				break;
			case 2 :
				System.out.println("Enter the student's name to get the score: ");
				String studentName = sc.nextLine();
				Integer studentScore = map.get(studentName);
				
				if(studentScore != null) {
					System.out.println("Score for "+studentName+" is: "+studentScore);
					
				}else {
					System.out.println("Student Not Found");
				}
				break;
				
			case 3 :
				System.out.println("Existing");
				sc.close();
				System.exit(0);
				
			default :
				System.out.println("Invalid Choice. Please try again");
			}
		}

	}

}
