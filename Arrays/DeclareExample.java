package Arrays;

public class DeclareExample {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        double[] prices = new double[10];
        String[] names = new String[3];

        String[] fruits = { "Apple", "Banana", "Cherry" };
        int[] myNums = { 10, 20, 30, 40, 50 };

        System.out.println("Fruits array length: " + fruits.length);
        System.out.println("First fruit: " + fruits[0]);
        System.out.println("Second number: " + myNums[1]);

        System.out.println(numbers[0]); // Default value 0
        System.out.println(prices[0]); // Default value 0.0
        System.out.println(names[0]); // Default value null
    }
}
