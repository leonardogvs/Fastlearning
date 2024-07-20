    import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);  // Create a Scanner object to read user input

        int apples = scanner.nextInt();             // Read the number of apples from the user
        int oranges = scanner.nextInt();            // Read the number of oranges from the user

        int result;                                 // Calculate the total number of fruits
        result = apples + oranges;

        System.out.println(result);                 // Print the result
    }
}
