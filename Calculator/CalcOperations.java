package Calculator;

import java.util.Objects;
import java.util.Scanner;

public class CalcOperations {
    public static void ChooseGrade() {
        while (!Objects.equals(Main.Grade, "X")){

            Scanner scanner = new Scanner(System.in);
            Main.Grade = scanner.next();

            switch (Main.Grade){
                case "A*":
                    Main.Total += 58;
                    Main.Count+=1;
                    break;
                case "A":
                    Main.Total += 52;
                    Main.Count+=1;
                    break;
                case "B":
                    Main.Total += 46;
                    Main.Count+=1;
                    break;
                case "C":
                    Main.Total += 40;
                    Main.Count+=1;
                    break;
                case "D":
                    Main.Total += 34;
                    Main.Count+=1;
                    break;
                case "E":
                    Main.Total += 28;
                    Main.Count+=1;
                    break;
                case "F":
                    Main.Total += 22;
                    Main.Count+=1;
                    break;
                case "X":
                    break;

                default:
                    System.out.println("Wrong GCSE Grade. Enter grades A*,A,B,C,D,E,F");
            }
        }
    }
}
