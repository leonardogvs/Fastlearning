package Calculator;
    public class Main {
        static String Grade;
        static int Total = 0;
        static int Count = 0;

    public static void main(String[] args) {

        System.out.println(" Enter Your Grade");
        System.out.println(" Enter 'X' to get average");

        CalcOperations.ChooseGrade();

        System.out.println("The Total is: " + Total + "\tCount: " + Count);
        System.out.println("The average is: " + Total / Count);
    }

}

