    import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner (System.in);

        // Read the number of apples from the user
        int apples = scanner.nextInt();
        // Read the number of oranges from the user
        int oranges = scanner.nextInt();

        // Calculate the total number of fruits
        int result;
        result = apples + oranges;

        // Print the result
        System.out.println(result);
    }
}
