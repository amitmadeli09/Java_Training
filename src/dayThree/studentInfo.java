package dayThree;

class Student{
	String name;
	int age;
	int roll_number;
	
	void display() {
		System.out.println("Name: " + name + "\nAge: " + age + "\nRoll Number: " + roll_number);		
	}
}
public class studentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "Amit";
		s1.age = 24;
		s1.roll_number = 1941012;
		s1.display();
	}

}
