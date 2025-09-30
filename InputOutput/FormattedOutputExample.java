package InputOutput;

public class FormattedOutputExample {
    public static void main(String[] args) {
        String name = "Jevon";
        int age = 19;
        double height = 173.5;
        boolean isStudent = true;

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Height: %.2f cm%n", height);
        System.out.printf("Is Student: %b%n", isStudent);
    }
}
