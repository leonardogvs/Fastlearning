import java.util.Objects;
import java.util.Scanner;

public class gradeCalculator {
    static String Grade;
    static int Total = 0;
    static int Count = 0;

    public static void main(String[] args) {

        System.out.println(" Enter Your Grade");
        System.out.println(" Enter 'X' to get average");

        while (!Objects.equals(Grade, "X")){
            Scanner scanner = new Scanner(System.in);
            Grade = scanner.next();

            switch (Grade){
                case "A*":
                    Total = Total + 58;
                    AverageCount();
                    break;
                case "A":
                    Total = Total + 52;
                    AverageCount();
                    break;
                case "B":
                    Total = Total + 46;
                    AverageCount();
                    break;
                case "C":
                    Total = Total + 40;
                    AverageCount();
                    break;
                case "D":
                    Total = Total + 34;
                    AverageCount();
                    break;
                case "E":
                    Total = Total + 28;
                    AverageCount();
                    break;
                case "F":
                    Total = Total + 22;
                    AverageCount();
                    break;
                case "X":
                    break;

                default:
                    System.out.println("Wrong GCSE Grade. Enter grades A*,A,B,C,D,E,F");
            }
        }
        System.out.println("The Total is: " + Total + "\tCount: " + Count);
        System.out.println("The average is: " + Total / Count);
    }
    static public void AverageCount(){
        Count = Count + 1;
    }
}
