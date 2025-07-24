package dayOne;

public class referenceVar {

    public static void changeName(person p) {
        p.name = "abc to Changed";
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = num1;
        num2 = 20;
        System.out.println("The num1 is: " + num1);
        System.out.println("The num2 is: " + num2);

        person p1 = new person("Amit");

        System.out.println("p1 = " + p1);

        person p2 = p1;

        System.out.println("p2 = " + p2);

        p2.name = "abc";

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        changeName(p1);

        System.out.println("p1 after changeName = " + p1);
        System.out.println("p2 = " + p2);
    }
}