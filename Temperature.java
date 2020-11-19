import java.util.Scanner;
class Temperature {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        for (;;) {
            String answer;
            System.out.println("Please, enter a value in Celsius degrees: ");
            double temprt = readInput( in );
            convert(temprt);
            System.out.println("Would you like to convert another value? [(y) Yes/no (N)]");
            answer = in .nextLine();
            if ((!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("y"))) break;
        }
    }

    public static double readInput(Scanner in ) {
        double temprt = in .nextDouble(); in .nextLine();
        return temprt;
    }

    public static void convert(double temprt) {
        double res = temprt * 1.8 + 32;
        System.out.println("It is " + res + " in Fahrenheit degrees");
    }
}